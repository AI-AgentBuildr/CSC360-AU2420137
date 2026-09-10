# Personal Reflection: Session 10 – Java Collections, Event Hierarchy, and UI Patterns

**Session Date:** 08/09/26  
**Entry Date:** 10/09/26  

---

## What I Learned & Key Takeaways

Session 10 connected core Java mechanisms with UI design principles. We reviewed exception handling, generics, and the Collections Framework, focusing on unmodifiable collection wrappers. These create read-only views that protect internal state from unintended modifications.

We also analyzed event propagation across the JavaFX scene graph, which occurs in two phases:

1. **Capturing Phase:** The event travels downward from root to target, where event filters can intercept it.
2. **Bubbling Phase:** The event travels upward from target back to root, where event handlers process it.

Understanding this route simplifies debugging when nested UI elements trigger unexpected behavior.

We then covered UI controls as intentional design affordances: sliders handle relative adjustments (e.g., volume), checkboxes allow multi-selection, radio buttons enforce single choices, and modal dialogs pause workflow for user input.

Finally, we examined the Master-Detail pattern, which displays a summary list in one pane and lazy-loads item details in another, keeping the interface clean and responsive.

---

## Core Takeaways

* **Data Protection:** Unmodifiable collection wrappers provide safe, read-only access to shared application data.
* **Event Propagation Path:** JavaFX events travel down through capturing (intercepted by filters) and up through bubbling (processed by handlers).
* **Affordance-Based Design:** Choose UI controls based on user intent—sliders for relative tuning, radio buttons for strict single selection.
* **Master-Detail Efficiency:** Master-Detail layouts improve interface performance by loading detailed data on demand.
