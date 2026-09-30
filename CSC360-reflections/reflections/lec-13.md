# Lecture 13 Reflection: ASCII Tree Project – Full Implementation & First Merges

**Session Date:** 17/09/26  
**Entry Date:** 17/09/26  

## 📋 TODO / Topics Covered (Revision Checklist)

- [ ] Complete the real logic behind each module (`TreeBuilder`, `InputHandler`, `TreeTraversal`, `TreePrinter`)
- [ ] Understand the reverse-push trick for printing children in order with a LIFO stack
- [ ] Test the full pipeline end-to-end with a sample org-chart input
- [ ] Merge pull requests into `main` in dependency order
- [ ] Recognize and resolve merge conflicts in IDE configuration files

---

## ❓ Class Questions & Detailed Answers

### Q1: What did each module's full implementation involve?

This was the big implementation day. Everyone finished the real logic behind their module:

* **`TreeBuilder.java` (me):** Builds the tree from the list of parent-child pairs and automatically detects the root — the one name that never appears as a child.
* **`InputHandler.java` (Krishna):** Input validation, so malformed lines are skipped with a warning instead of crashing the program.
* **`TreeTraversal.java` (Shashwat):** The stack-push logic (see Q2).
* **`TreePrinter.java` (Dhyan):** Wires `StackFrame` and `TreeTraversal` together to print each node with the correct `├──` / `└──` / `│` connectors.

### Q2: How does a LIFO stack print children left-to-right?

* **Problem:** A stack is LIFO, so children pushed in normal order would pop (and print) in reverse.
* **Reverse-Push Trick:** Push children in **reverse order** so the first child pops first.
* **Takeaway:** Seeing this actually produce correctly ordered output made the LIFO-vs-print-order concept click in a way that just reading about it hadn't.

### Q3: How did we test the pipeline?

* **End-to-End Test:** We ran the full pipeline with a sample org-chart input (CEO → VP_Sales/VP_Eng → managers/devs → a sales rep).
* **Result:** Got exactly the nested tree output we expected from an 8-line input.
* **Takeaway:** Running the program end-to-end before opening pull requests caught issues early, rather than discovering them after everything was already on `main`.

### Q4: In what order did we merge pull requests, and why?

* **Dependency Order:** Tree Construction first (since every other module depends on `TreeNode`), then input → traversal → printing.
* **Benefit:** Every branch compiled cleanly against `main` at the point it was merged.

### Q5: What caused our first merge conflicts, and how should they be fixed?

* **Cause:** Not the Java code itself (everyone worked on separate files), but IntelliJ's auto-generated project configuration files (`.iml`, `misc.xml`, `vcs.xml`), which differ slightly per person's local machine (e.g. different configured JDK versions).
* **Insight:** Conflicts in `.idea`/`.iml` files are not real code conflicts — they're a sign these machine-specific files shouldn't be tracked in Git at all.
* **Fix:** Add them to `.gitignore` going forward.
