# `DrawingShapes.java` Program

>[!IMPORTANT]
The `DrawingShapes.java` Java program is designed to allow users to draw various shapes based on user input. The shapes include rectangles, triangles, hexagons, octagons, and pentagons. This lab focuses on utilizing loops, nested loops, decision statements, and user input to draw the specified shapes.

## Program Description

The program defines a `DrawingShapes` class that interacts with the user to get the desired shape and dimensions, then draws the shape using asterisks (`*`). The shapes and their dimensions must match the user's input exactly, handling any invalid inputs appropriately.

## Key Features

- **Shapes**: Rectangle, Triangle, Hexagon, Octagon, Pentagon
- **Methods**: `handleRectangle()`, `handleTriangle()`, `handleHexagon()`, `handleOctagon()`, `handlePentagon()`, `drawRectangle()`, `drawTriangle()`, `drawHexagon()`, `drawOctagon()`, `drawPentagon()`
- **Error Handling**: Ensures valid dimensions and shape choices

## Example Usage

### DrawingShapes.java

```java
// Name: [Your Name]
// Date: [Date]
// Program Purpose: Draw various shapes based on user input
// Statement of Academic Honesty: [Your statement]

import java.util.Scanner;

public class DrawingShapes {

    private static Scanner scanner = new Scanner(System.in);

    // Based on the user input, the according method is invoked
    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter a shape: r t h o p");
            String shape = scanner.next();

            if ("r".equals(shape)) {
                handleRectangle();
                return;
            } else if ("t".equals(shape)) {
                handleTriangle();
                return;
            } else if ("h".equals(shape)) {
                handleHexagon();
                return;
            } else if ("o".equals(shape)) {
                handleOctagon();
                return;
            } else if ("p".equals(shape)) {
                handlePentagon();
                return;
            } else {
                System.out.println("Invalid shape\nGoodbye!");
                return;
            }
        }
    }

    // All handleShape methods ensure that the length > 1 and height (if asked) is also > 1
    private static void handleRectangle() {
        int length = promptForDimension("length");
        if (length <= 1) {
            System.out.println("Length must be greater than 1\nGoodbye!");
            return;
        }

        int height = promptForDimension("height");
        if (height <= 1) {
            System.out.println("Height must be greater than 1\nGoodbye!");
            return;
        }

        drawRectangle(length, height);
    }

    // Draws rectangle
    private static void drawRectangle(int length, int height) {
        System.out.println("Below is a " + length + " by " + height + " rectangle of *");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void handleTriangle() {
        int length = promptForDimension("length");
        if (length <= 1) {
            System.out.println("Length must be greater than 1\nGoodbye!");
            return;
        }
        drawTriangle(length);
    }

    // Draws triangle
    private static void drawTriangle(int length) {
        System.out.println("Below is a triangle with two side lengths of " + length + " *");
        for (int i = 0; i < length; i++) {
            for (int j = length - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void handleHexagon() {
        int length = promptForDimension("length");
        if (length <= 1) {
            System.out.println("Length must be greater than 1\nGoodbye!");
            return;
        }
        drawHexagon(length);
    }

    // Draws hexagon
    private static void drawHexagon(int length) {
        System.out.println("Below is a hexagon with side lengths of " + length + " *");
        for (int i = 0; i < length; i++) {
            for (int j = length - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < length + 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = length - 2; i >= 0; i--) {
            for (int j = length - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < length + 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void handleOctagon() {
        int length = promptForDimension("length");
        if (length <= 1) {
            System.out.println("Length must be greater than 1\nGoodbye!");
            return;
        }
        drawOctagon(length);
    }

    // Draws octagon
    private static void drawOctagon(int length) {
        int middleStars = length * 3 - 2; // Middle width
        int spacesBefore = length - 1; // Spaces before the stars begin
        System.out.println("Below is an octagon with side lengths of " + length + " *");
        // Print the tapered top part
        for (int i = 0; i < spacesBefore; i++) {
            for (int s = 0; s < spacesBefore - i; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < middleStars - (2 * (spacesBefore - i)); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Print the middle part
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < middleStars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Print the tapered bottom part
        for (int i = spacesBefore - 1; i >= 0; i--) {
            for (int s = 0; s < spacesBefore - i; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < middleStars - (2 * (spacesBefore - i)); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void handlePentagon() {
        int length = promptForDimension("length");
        if (length <= 1) {
            System.out.println("Length must be greater than 1\nGoodbye!");
            return;
        }
        drawPentagon(length);
    }

    // Draws pentagon
    private static void drawPentagon(int length) {
        int maxStars = length * 2 - 1; 
        int totalRows = length * 2 - 1; 
        System.out.println("Below is a pentagon with 4 side lengths of " + length + " *");
        for (int row = 1; row <= length; row++) {
            for (int space = length - row; space > 0; space--) {
                System.out.print(" ");
            }
            for (int star = 1; star <= (row * 2) - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int row = length + 1; row <= totalRows; row++) {
            for (int star = 1; star <= maxStars; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Asks for the length and possibly the height
    private static int promptForDimension(String dimension) {
        System.out.println("Enter a " + dimension);
        return scanner.nextInt();
    }
}
