# Lecture 12 Reflection: ASCII Tree Project – Skeleton & Core Classes

**Session Date:** 15/09/26  
**Entry Date:** 15/09/26  

## 📋 TODO / Topics Covered (Revision Checklist)

- [ ] Push a shared project skeleton with empty stub files
- [ ] Create a feature branch per person and start each first class
- [ ] Understand each module's first class (`TreeNode`, `InputHandler`, `StackFrame`, `TreePrinter`)
- [ ] Identify dependencies between modules and plan around them
- [ ] Practice small, incremental commits

---

## ❓ Class Questions & Detailed Answers

### Q1: Why start with a shared project skeleton?

* **Initial Commit:** We pushed an initial commit with empty stub files (`TreeNode.java`, `InputHandler.java`, `TreePrinter.java`, `AsciiTree.java`).
* **Common Starting Point:** Everyone could branch off the same baseline instead of drifting into inconsistent structures.
* **Takeaway:** A common, empty baseline made it much easier to keep class names and method signatures consistent across four separate branches.

### Q2: What was each person's first class?

Each of us created our own feature branch and began filling in our first class:

* **`TreeNode.java` (me):** The basic building block of the tree, holding a name and a list of child nodes.
* **`InputHandler.java` (Krishna):** Reads the number of relationships and each `"Parent Child"` line from the user.
* **`StackFrame.java` (Shashwat):** A small wrapper class that bundles a node together with its printing context (prefix string, whether it's the last child in its group).
* **`TreePrinter.java` (Dhyan):** A placeholder shell, since his real logic would depend on Shashwat's traversal code being ready first.

### Q3: How did we handle dependencies between modules?

* **Dependency Awareness:** Recognizing early that `TreePrinter` depends on `StackFrame`/`TreeTraversal` let Dhyan build a placeholder now.
* **Benefit:** He avoided blocking his own progress while waiting on a teammate.

### Q4: Why commit incrementally?

* **Approach:** Commit a stub class first, then fill it in over subsequent days.
* **Benefit:** Keeps each day's contribution small, reviewable, and clearly attributable in the Git history.
