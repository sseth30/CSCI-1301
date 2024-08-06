// For an overview of the program and sample inputs, be sure to check out `StarGraph.md`

import java.util.Scanner;

public class StarGraph {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompts the user to enter a positive array
        System.out.print("Please enter the number of x values to process: ");
        int size = scanner.nextInt();
        if (size <= 0) {
            System.out.println("The number of x values must be an integer greater than 0.");
            scanner.close();
            return;
        }

        // Prompts the user to enter a minimum x and a double-valued increment
        System.out.print("Enter a minimum value for x: ");
        double xmin = scanner.nextDouble();

        System.out.print("Enter the amount to increment x: ");
        double increment = scanner.nextDouble();
        if (increment <= 0) {
            System.out.println("The increment must be a decimal number greater than 0.");
            scanner.close();
            return;
        }

        double[] xValues = new double[size];
        double[] yValues = new double[size];

        for (int i = 0; i < size; i++) {
            xValues[i] = xmin + (increment * i);
            yValues[i] = 20.0 * Math.abs(Math.sin(xValues[i]));
        }
        // Outputs values of x and y truncating it to 3 digits after the decimal
        System.out.println("\nValues");
        for (int i = 0; i < size; i++) {
            System.out.printf("x: %.3f, y: %.3f\n", xValues[i], yValues[i]);
        }

        // Outputs the ordered magnitude of the y-value using a star graph
        System.out.println("\nGraph");
        for (int i = 0; i < size; i++) {
            int stars = (int) yValues[i];
            System.out.print(":");
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
