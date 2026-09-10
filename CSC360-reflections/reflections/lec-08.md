# Personal Reflection: Session 8 – Geometry, Linear Algebra, and Canvas UI Logic

**Session Date:** 01/09/26  
**Entry Date:** 02/09/26  

---

## What I Learned & Key Takeaways

Session 8 began with group project overviews ranging from ASCII tree generators to interactive shape drawers, giving me a broader view of JavaFX application structure.

Applying math directly to graphics was particularly practical. Connecting linear algebra ($ax + by = c$) to canvas lines made abstract equations concrete. Two linear equations define intersecting lines, while three form a 2D triangle. Using matrix determinants lets us programmatically check if two lines intersect at a unique point before drawing them.

We also applied the Pythagorean distance formula:

$$d = \sqrt{(x_2 - x_1)^2 + (y_2 - y_1)^2}$$

This powers point-in-circle hit-testing: if the calculated distance $d$ from a click to the center $(c_x, c_y)$ is $\le r$, the click landed inside the shape.

Finally, we covered data structures for user interaction. Stacks (LIFO) are ideal for undo histories because they remove the newest shape first. Combining mouse listeners (press, drag, release) enables real-time visual previews on canvas.

---

## Core Takeaways

* **Linear Systems as Shapes:** Systems of linear equations represent 2D lines; non-zero determinants guarantee a single intersection point.
* **Hit-Testing Logic:** Distance calculations ($d \le r$) offer a precise way to detect clicks inside circular boundaries.
* **State Management:** Stacks are ideal for undo histories because their Last-In, First-Out order aligns with user expectations.
* **Interactive Previews:** Combining mouse drag and release listeners enables real-time visual feedback on a canvas.
