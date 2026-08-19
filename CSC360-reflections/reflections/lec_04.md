# Lecture 03 Reflection

## 📋 TODO / Topics Covered (Revision Checklist)

- [ ] Write pseudocode to draw a centered square on a canvas using pixel units
- [ ] Understand the coordinate formulas for deriving all 4 corners from the center $(c_x \pm L/2, c_y \pm L/2)$
- [ ] Learn the standard Maven directory structure (`pom.xml`, `src/main/java`, `src/main/resources`)
- [ ] Understand what `JFrame` is in Java Swing and its role as a top-level window container
- [ ] Differentiate between `static` (class-level) and instance (object-level) fields

---

## ❓ Class Questions & Detailed Answers

### Q1: How do you draw a square centered on a canvas using pseudocode and coordinate formulas?

* **Unit of Length:** In 2D computer graphics, the basic unit of length is the **pixel**.
* **Canvas and Shape Arguments:** To position the square, we need the canvas dimensions (Width $W$, Height $H$) to determine the center point $(c_x, c_y)$, along with the side length $L$ of the square.

#### Coordinate Formulas (Using Center $(c_x, c_y)$ and Length $L$):
Because computer screen coordinates place $(0,0)$ at the top-left (with $+X$ moving right and $+Y$ moving down), the four corners are derived as:
* **Top-Left (Starting Point for rendering):**
  $$\left(c_x - \frac{L}{2}, \; c_y - \frac{L}{2}\right)$$
* **Top-Right:**
  $$\left(c_x + \frac{L}{2}, \; c_y - \frac{L}{2}\right)$$
* **Bottom-Left:**
  $$\left(c_x - \frac{L}{2}, \; c_y + \frac{L}{2}\right)$$
* **Bottom-Right:**
  $$\left(c_x + \frac{L}{2}, \; c_y + \frac{L}{2}\right)$$

#### Pseudocode:
```text
FUNCTION drawCenteredSquare(canvasWidth, canvasHeight, sideLength):
    // 1. Calculate the center of the canvas area
    c_x = canvasWidth / 2
    c_y = canvasHeight / 2

    // 2. Calculate top-left starting coordinates from center
    startX = c_x - (sideLength / 2)
    startY = c_y - (sideLength / 2)

    // 3. Render the square
    drawRectangle(x = startX, y = startY, width = sideLength, height = sideLength)
END FUNCTION