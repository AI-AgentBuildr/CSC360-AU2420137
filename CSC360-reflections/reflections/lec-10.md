# Lecture 10 Reflection: Java Collections, Event Hierarchy, and UI Patterns

**Session Date:** 08/09/26  
**Entry Date:** 10/09/26  

## 📋 TODO / Topics Covered (Revision Checklist)

- [ ] Review exception handling, generics, and the Java Collections Framework
- [ ] Understand unmodifiable collection wrappers and why they protect internal state
- [ ] Learn the two phases of JavaFX event propagation (capturing and bubbling)
- [ ] Choose UI controls based on design affordances (sliders, checkboxes, radio buttons, modal dialogs)
- [ ] Understand the Master-Detail pattern and lazy-loading of item details

---

## ❓ Class Questions & Detailed Answers

### Q1: What are unmodifiable collection wrappers, and why use them?

* **Context:** The session connected core Java mechanisms — exception handling, generics, and the Collections Framework — with UI design principles.
* **Read-Only Views:** Unmodifiable collection wrappers create read-only views that protect internal state from unintended modifications.
* **Takeaway:** They provide safe, read-only access to shared application data.

### Q2: How do events propagate through the JavaFX scene graph?

Event propagation occurs in two phases:

1. **Capturing Phase:** The event travels downward from root to target, where **event filters** can intercept it.
2. **Bubbling Phase:** The event travels upward from target back to root, where **event handlers** process it.

* **Why It Matters:** Understanding this route simplifies debugging when nested UI elements trigger unexpected behavior.

### Q3: How should UI controls be chosen?

UI controls are intentional design affordances — choose them based on user intent:

* **Sliders:** Handle relative adjustments (e.g., volume).
* **Checkboxes:** Allow multi-selection.
* **Radio Buttons:** Enforce strict single choices.
* **Modal Dialogs:** Pause the workflow for user input.

### Q4: What is the Master-Detail pattern?

* **Layout:** Displays a summary list in one pane and lazy-loads item details in another.
* **Benefit:** Keeps the interface clean and responsive, improving performance by loading detailed data on demand.
