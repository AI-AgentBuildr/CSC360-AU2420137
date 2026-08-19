# Maven & JavaFX Setup (explained simply)

## What is Maven?
Maven is a build automation and dependency management tool for Java. Instead of manually downloading `.jar` files and configuring build paths, Maven manages external libraries (like JavaFX) and standardizes how projects are compiled and executed.

## JavaFX Shape Rendering: Fill vs. Stroke

When drawing 2D shapes in JavaFX (such as a `Rectangle`):

* **Filled Shape:** The inner area is colored using `setFill(...)`.
* **Hollow Shape (Outline Only):** Set the fill to transparent (`Color.TRANSPARENT`) and define the boundary color using `setStroke(...)`.
* **Border Thickness:** Controlled via `setStrokeWidth(...)`.
* **Position & Dimensions:** Positioning is adjusted using `setLayoutX(...)` and `setLayoutY(...)`, while geometry is sized via `setWidth(...)` and `setHeight(...)`.

---
*Reference: CSC360 Lab Setup & Hands-on Session*