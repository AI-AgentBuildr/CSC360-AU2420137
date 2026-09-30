# Lecture 08 Reflection: Geometry, Linear Algebra, and Canvas UI Logic

**Session Date:** 01/09/26  
**Entry Date:** 02/09/26  

## 📋 TODO / Topics Covered (Revision Checklist)

- [ ] Review group project overviews (ASCII tree generators to interactive shape drawers) and JavaFX application structure
- [ ] Connect linear equations ($ax + by = c$) to lines drawn on a canvas
- [ ] Use matrix determinants to check whether two lines intersect at a unique point
- [ ] Apply the distance formula for point-in-circle hit-testing
- [ ] Use stacks (LIFO) for undo histories and mouse listeners for real-time previews

---

## ❓ Class Questions & Detailed Answers

### Q1: What did the group project overviews show?

* **Range of Projects:** Session 8 began with group project overviews ranging from ASCII tree generators to interactive shape drawers.
* **Takeaway:** They gave me a broader view of JavaFX application structure.

### Q2: How does linear algebra connect to drawing on a canvas?

* **Lines as Equations:** Connecting linear algebra ($ax + by = c$) to canvas lines made abstract equations concrete.
* **Systems as Shapes:** Two linear equations define intersecting lines, while three form a 2D triangle.
* **Determinants:** Using matrix determinants lets us programmatically check if two lines intersect at a unique point before drawing them — a non-zero determinant guarantees a single intersection point.

### Q3: How do you detect whether a click landed inside a circle?

We apply the Pythagorean distance formula:

$$d = \sqrt{(x_2 - x_1)^2 + (y_2 - y_1)^2}$$

* **Hit-Testing Rule:** If the calculated distance $d$ from a click to the center $(c_x, c_y)$ is $\le r$, the click landed inside the shape.
* **Takeaway:** Distance calculations offer a precise way to detect clicks inside circular boundaries.

### Q4: Which data structures and listeners support user interaction?

* **Stacks for Undo:** Stacks (LIFO) are ideal for undo histories because they remove the newest shape first — their Last-In, First-Out order aligns with user expectations.
* **Interactive Previews:** Combining mouse listeners (press, drag, release) enables real-time visual previews on a canvas.
