# Lecture 04 Reflection

## Table of Contents
1. [Topics Covered (TODO Checklist)](#topics-covered-todo-checklist)
2. [Questions Discussed & Key Concepts](#questions-discussed--key-concepts)

---

## Topics Covered (TODO Checklist)

- [ ] Understand how to create a frame and attach buttons to it
- [ ] Master anonymous classes and inline implementations in Java
- [ ] Understand the role of `super` calls in subclass constructors (e.g., handling heavy objects like `JFrame`)
- [ ] Identify the two crucial dimensions of a rectangle in `frame.setSize(550, 400)` (width and height)
- [ ] Master the Triangle Inequality Theorem to generate three valid side lengths: $|a - b| < c < a + b$
- [ ] Work with the Cartesian coordinate system

---

## Questions Discussed & Key Concepts

### Q1: How do you create a Frame and add a Button to it?
* Instantiate a `JFrame` container (e.g., `JFrame frame = new JFrame();`).
* Instantiate a `JButton` (e.g., `JButton button = new JButton("Click Me");`).
* Add the button component to the frame container using `frame.add(button);`.
* Configure size using `frame.setSize(550, 400)` and set visibility with `frame.setVisible(true)`.

### Q2: What are Anonymous Classes and Inline Implementations?
* An anonymous class is an inner class declared and instantiated in a single step without a formal class name.
* Often used for inline event handling (e.g., `button.addActionListener(new ActionListener() { ... });`) to implement listener interfaces directly where needed.

### Q3: Why do we call `super()` in subclasses like `JFrame`?
* `super()` invokes the constructor/methods of the parent class.
* `JFrame` is a heavy object responsible for interacting with native OS window managers, borders, buffers, and event loops. Calling `super()` ensures the parent class performs essential initialization work.

### Q4: What do the values in `frame.setSize(550, 400)` represent?
* `550` is the **width** (horizontal span in pixels along the X-axis).
* `400` is the **height** (vertical span in pixels along the Y-axis).
* Together with the top-left origin $(x, y)$, width and height define the boundary coordinates of the rectangular frame.

### Q5: How do you generate three values that can always form a triangle?
* By applying the Triangle Inequality Theorem:
  $$|a - b| < c < a + b$$
* Any third side $c$ must be strictly greater than the absolute difference $|a - b|$ and strictly less than the sum $a + b$.

---

