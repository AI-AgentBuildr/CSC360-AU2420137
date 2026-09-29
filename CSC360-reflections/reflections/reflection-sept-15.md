# Personal Reflection: ASCII Tree Project – Skeleton & Core Classes

**Session Date:** 15/09/26  
**Entry Date:** 15/09/26  

---

## What I Learned & Key Takeaways

Today we got the project skeleton in place and started on each person's
first class. We pushed an initial commit with empty stub files
(`TreeNode.java`, `InputHandler.java`, `TreePrinter.java`, `AsciiTree.java`)
so everyone could branch off the same starting point instead of drifting
into inconsistent structures.

Each of us then created our own feature branch and began filling in our
first class:

- I started on `TreeNode.java` — the basic building block of the tree,
  holding a name and a list of child nodes.
- Krishna began `InputHandler.java`, reading the number of relationships
  and each `"Parent Child"` line from the user.
- Shashwat began `StackFrame.java`, the small wrapper class that bundles a
  node together with its printing context (prefix string, whether it's the
  last child in its group).
- Dhyan set up a placeholder `TreePrinter.java` shell, since his real logic
  would depend on Shashwat's traversal code being ready first.

---

## Core Takeaways

* **Shared skeleton first:** Starting from a common, empty baseline made it
  much easier to keep class names and method signatures consistent across
  four separate branches.
* **Dependency awareness:** Recognizing early that `TreePrinter` depends on
  `StackFrame`/`TreeTraversal` let Dhyan build a placeholder now and avoid
  blocking his own progress while waiting on a teammate.
* **Incremental commits:** Committing a stub class first, then filling it
  in over subsequent days, keeps each day's contribution small, reviewable,
  and clearly attributable in the Git history.
