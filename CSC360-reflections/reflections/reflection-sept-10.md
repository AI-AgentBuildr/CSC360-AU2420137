# Personal Reflection: ASCII Tree Project – Planning & Design

**Session Date:** 10/09/26  
**Entry Date:** 10/09/26  

---

## What I Learned & Key Takeaways

Today the team planned out our ASCII tree printer project before writing any
code. We decided on the core data structure — a `TreeNode` class holding a
name and a list of child nodes — and chose to print the tree using an
**iterative, stack-based traversal** instead of recursion, so the printing
logic would stay easy to follow and debug as a group.

We also divided the work across the four of us so each person's
contribution would be roughly equal in size and complexity:

- Tree Construction (`TreeNode`, `TreeBuilder`)
- Input Handling (`InputHandler`)
- Stack Traversal Logic (`StackFrame`, `TreeTraversal`)
- Printing & Formatting (`TreePrinter`)

We set up the GitHub repository and agreed on a branching workflow: each
person works on their own feature branch and opens a pull request into
`main` once their module is ready, rather than everyone pushing directly to
`main`. Getting everyone's local Git authentication working (GitHub no
longer accepts plain passwords, so we had to set up Personal Access Tokens)
took some initial troubleshooting.

---

## Core Takeaways

* **Design before code:** Deciding on the `TreeNode` structure and the
  stack-based traversal approach up front gave everyone a shared mental
  model before any implementation started.
* **Even work distribution:** Splitting the project into four clearly
  separated modules (construction, input, traversal, printing) let each
  person own a distinct, testable piece of the codebase.
* **Git workflow matters:** Agreeing on a feature-branch + pull-request
  process early avoided merge chaos later, since everyone knew exactly
  which files belonged to them.
* **Authentication setup:** Personal Access Tokens are required for GitHub
  HTTPS pushes now — a small but important setup step for every team
  member.
