# Personal Reflection: ASCII Tree Project – Full Implementation & First Merges

**Session Date:** 17/09/26  
**Entry Date:** 17/09/26  

---

## What I Learned & Key Takeaways

This was the big implementation day. Everyone finished the real logic
behind their module:

- I completed `TreeBuilder.java`, which builds the tree from the list of
  parent-child pairs and automatically detects the root — the one name that
  never appears as a child.
- Krishna finished input validation in `InputHandler.java`, so malformed
  lines are skipped with a warning instead of crashing the program.
- Shashwat completed `TreeTraversal.java`, implementing the stack-push logic
  so children print left-to-right despite the stack being LIFO — pushing
  children in reverse order so the first child pops first.
- Dhyan finished `TreePrinter.java`, wiring `StackFrame` and `TreeTraversal`
  together to print each node with the correct `├──` / `└──` / `│`
  connectors.

We tested the full pipeline end-to-end with a sample org-chart input (CEO →
VP_Sales/VP_Eng → managers/devs → a sales rep) and got exactly the nested
tree output we expected from an 8-line input.

We then began merging pull requests into `main`, in dependency order (Tree
Construction first, since every other module depends on `TreeNode`). This
is where we hit our first real merge conflicts — not in the Java code
itself, since everyone worked on separate files, but in IntelliJ's
auto-generated project configuration files (`.iml`, `misc.xml`, `vcs.xml`),
which differ slightly per person's local machine (e.g. different configured
JDK versions).

---

## Core Takeaways

* **Stack-based traversal in practice:** Seeing the reverse-push trick
  actually produce correctly ordered output made the LIFO-vs-print-order
  concept click in a way that just reading about it hadn't.
* **Merge order matters:** Merging branches in dependency order (structure
  → input → traversal → printing) meant every branch compiled cleanly
  against `main` at the point it was merged.
* **IDE config conflicts are a trap:** Conflicts in `.idea`/`.iml` files are
  not real code conflicts — they're a sign these machine-specific files
  shouldn't be tracked in Git at all. The right fix is adding them to
  `.gitignore` going forward.
* **Test before merging:** Running the program end-to-end before opening
  pull requests caught issues early, rather than discovering them after
  everything was already on `main`.
