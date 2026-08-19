# Study Notes: Drawing Shapes, Maven Architecture, and Java Fundamentals

---

## 1. Drawing a Centered Square

### Coordinate Units & Canvas Parameters
* **Unit of Length:** In 2D computer graphics and display buffers, the fundamental unit of measurement is the **pixel**.
* **Canvas Parameters:** Positioning a shape requires the dimensions of the canvas area (Width $W$, Height $H$) and the side length $L$ of the square.
* **Center Alignment:** The center of the canvas area is used directly as the center of the square:
  $$c_x = \frac{W}{2}, \quad c_y = \frac{H}{2}$$


---

### Deriving the 4 Corner Coordinates from Center $(c_x, c_y)$
Screen coordinates use a top-left origin $(0, 0)$ where the X-axis increases to the right and the Y-axis increases downward. Using the center point $(c_x, c_y)$ and side length $L$, the four corner positions are calculated as:

* **Top-Left (Starting Draw Point):**
  $$\left(c_x - \frac{L}{2}, \; c_y - \frac{L}{2}\right)$$

* **Top-Right:**
  $$\left(c_x + \frac{L}{2}, \; c_y - \frac{L}{2}\right)$$

* **Bottom-Left:**
  $$\left(c_x - \frac{L}{2}, \; c_y + \frac{L}{2}\right)$$

* **Bottom-Right:**
  $$\left(c_x + \frac{L}{2}, \; c_y + \frac{L}{2}\right)$$


---

### Pseudocode

```text
FUNCTION drawCenteredSquare(canvasWidth, canvasHeight, sideLength):
    // 1. Compute the center coordinates of the canvas area
    centerX = canvasWidth / 2
    centerY = canvasHeight / 2

    // 2. Derive starting top-left coordinates using (center - length/2)
    startX = centerX - (sideLength / 2)
    startY = centerY - (sideLength / 2)[cite: 8]

    // 3. Render the square with equal width and height
    drawRectangle(x = startX, y = startY, width = sideLength, height = sideLength)[cite: 8]
END FUNCTION