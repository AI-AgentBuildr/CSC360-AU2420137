# Lecture 11 Reflection: ASCII Tree Project – Planning & Design

**Session Date:** 10/09/26  
**Entry Date:** 10/09/26  

## 📋 TODO / Topics Covered (Revision Checklist)

- [ ] Design the core `TreeNode` data structure (a name plus a list of child nodes)
- [ ] Understand why an iterative, stack-based traversal was chosen over recursion
- [ ] Divide the project into four evenly sized modules
- [ ] Set up the GitHub repository with a feature-branch + pull-request workflow
- [ ] Configure Git authentication with Personal Access Tokens

---

## ❓ Class Questions & Detailed Answers

### Q1: What data structure and traversal approach did we choose for the ASCII tree printer?

* **Design Before Code:** The team planned the project before writing any code.
* **Data Structure:** A `TreeNode` class holding a name and a list of child nodes.
* **Traversal:** An **iterative, stack-based traversal** instead of recursion, so the printing logic would stay easy to follow and debug as a group.
* **Takeaway:** Deciding on the `TreeNode` structure and the stack-based approach up front gave everyone a shared mental model before any implementation started.

### Q2: How was the work divided across the team?

The work was split across the four of us so each person's contribution would be roughly equal in size and complexity:

* **Tree Construction:** `TreeNode`, `TreeBuilder`
* **Input Handling:** `InputHandler`
* **Stack Traversal Logic:** `StackFrame`, `TreeTraversal`
* **Printing & Formatting:** `TreePrinter`

* **Takeaway:** Four clearly separated modules let each person own a distinct, testable piece of the codebase.

### Q3: What Git workflow did we agree on?

* **Feature Branches:** Each person works on their own feature branch.
* **Pull Requests:** Open a pull request into `main` once the module is ready, rather than everyone pushing directly to `main`.
* **Takeaway:** Agreeing on this process early avoided merge chaos later, since everyone knew exactly which files belonged to them.

### Q4: What setup was needed for GitHub authentication?

* **Problem:** GitHub no longer accepts plain passwords for HTTPS pushes, so getting everyone's local Git authentication working took some initial troubleshooting.
* **Solution:** Set up **Personal Access Tokens** — a small but important setup step for every team member.
