# Java GUI Architecture and Geometric Constraints

## Table of Contents
1. [Creating Frames and Adding Buttons](#1-creating-frames-and-adding-buttons)
2. [Anonymous Classes and Inline Implementation](#2-anonymous-classes-and-inline-implementation)
3. [The Role of `super` and Heavy Objects](#3-the-role-of-super-and-heavy-objects)
4. [Rectangle Geometry & Dimensions](#4-rectangle-geometry--dimensions)
5. [Triangle Inequality Condition](#5-triangle-inequality-condition)

---

## 1. Creating Frames and Adding Buttons

To create a basic window in Java Swing and attach an interactive button:

java
import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("App Window"); // Create frame container
        JButton button = new JButton("Submit");   // Create button component

        frame.add(button);                       // Add button to frame
        frame.setSize(550, 400);                 // Define width and height
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

## 2. Anonymous Classes and Inline Implementation
Definition: An anonymous class is a local class defined without a name, instantiated at the exact location where it is required.
Inline Implementation: Commonly used when implementing functional interfaces or event listeners on UI elements without creating a separate .java file:
Java
button.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button clicked!");
    }
});

## 3. The Role of super and Heavy Objects
When extending classes like JFrame, the child class relies on the parent's constructor and methods to execute underlying windowing logic.
Calling super() or super.methodName() delegates foundational setup to the superclass.
JFrame is a heavy object that allocates native OS resources (peer components, title bars, and display buffers). The parent class handles this heavy lifting before child modifications are applied.

## 4. Rectangle Geometry & Dimensions
In methods like frame.setSize(550, 400):
550 → Width (W): Horizontal pixel distance from the left edge to the right edge.
400 → Height (H): Vertical pixel distance from the top edge to the bottom edge.
In a 2D Cartesian / screen coordinate space, specifying (x,y) as the starting position alongside W and H gives the four bounding vertices of the rectangle:
Top-Left: (x,y)
Top-Right: (x+W,y)
Bottom-Left: (x,y+H)
Bottom-Right: (x+W,y+H)

## 5. Triangle Inequality Condition
To guarantee that three lengths a, b, and c form a valid non-degenerate triangle in geometric space, the length of side c must satisfy:
∣a−b∣<c<a+b
Algorithm for Generation:
Choose positive numbers for side a and side b.
Compute the lower bound: minVal=∣a−b∣.
Compute the upper bound: maxVal=a+b.
Pick any value for c such that minVal<c<maxVal.
