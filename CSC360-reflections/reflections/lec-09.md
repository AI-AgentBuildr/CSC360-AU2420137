# Lecture 09 Reflection — Sept 3, 2026

## 📋 TODO / Topics Covered (Revision Checklist)

- [ ] Understand the difference between console ASCII printing (character layout) and JavaFX canvas rendering (coordinate mapping)
- [ ] Sketch a project's tree structure on paper before coding, to save time later
- [ ] Understand what a headless server is and why cloud infrastructure runs headlessly
- [ ] Understand why SSH key authentication is used for headless command-line access
- [ ] Learn the Test-Driven Development (TDD) Red-Green-Refactor cycle
- [ ] Understand safe thread cancellation vs. force-stopping active threads

---

## ❓ Class Questions & Detailed Answers

### Q1: What's the difference between console ASCII printing and JavaFX canvas rendering?

* **Console ASCII printing** is about character layout — placing text characters (like `├──`, `└──`) in the correct order and indentation to represent structure.
* **JavaFX canvas rendering** is about coordinate mapping — placing shapes and pixels at specific `(x, y)` positions on screen.
* These require fundamentally different programming approaches, even when representing the same underlying data (e.g., a tree structure).
* **Practical tip:** sketching the project's tree structure on paper first, before writing any code, saves significant time by clarifying the layout logic in advance.

### Q2: What is a headless server, and why does it matter?

* A **headless system** is a server that operates without a physical display or GUI.
* Since cloud infrastructure runs headlessly, direct command-line access is required instead of a remote desktop.
* **SSH key authentication** is the standard way to securely access a headless server's command line, without needing the overhead of remote desktop software.

### Q3: What is Test-Driven Development (TDD), and what is the Red-Green-Refactor cycle?

* TDD is a development approach where tests are written *before* the implementation code.
* The cycle has three steps:
  1. **RED:** Write a failing test before writing any implementation code.
  2. **GREEN:** Write the minimal code needed to make that test pass.
  3. **REFACTOR:** Clean up the code while keeping all tests passing.
* Writing tests first acts as a functional specification, clarifying requirements early in the process.

### Q4: Why shouldn't you force-stop an active thread?

* Force-stopping a thread while it's running risks corrupting shared memory, since the thread may be mid-update on data other threads depend on.
* The safer approach is using **graceful cancellation flags** — a shared flag that signals a background task to check at predefined checkpoints and stop itself safely, rather than being killed abruptly.

---

## Course Context

Session 9 also included project reviews across the class, giving visibility into different approaches — from ASCII tree generators to interactive JavaFX shape drawers — reinforcing that Q1 above (text vs. pixel rendering) applies differently depending on each project's chosen output format.
