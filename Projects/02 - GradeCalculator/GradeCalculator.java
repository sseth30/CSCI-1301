// For an overview of the program and sample inputs, be sure to check out `GradeCalculator.md`

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
public class GradeCalculator {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double grade = 0;
        
     // Display grading scale
        System.out.println("Grading Scale: \nA\t 90 - 100\nB\t 80 - 89\nC\t 70 - 79\nD\t 60 - 69\nF\t below 60");
        System.out.print("What letter grade do you want to achieve for this course?");
        
     // Prompt for the desired letter grade
        String desiredcurrentGrade = keyboard.nextLine();
        if (desiredcurrentGrade.equalsIgnoreCase("A")) {
            grade = 90;
        } else if (desiredcurrentGrade.equalsIgnoreCase("B")) {
            grade = 80;
        } else if (desiredcurrentGrade.equalsIgnoreCase("C")) {
            grade = 70;
        } else if (desiredcurrentGrade.equalsIgnoreCase("D")) {
            grade = 60;
        } else {
            System.out.println("The input is invalid.");
            System.exit(0);
        }
        System.out.println("Enter percentage weights below.");
        System.out.print("Exam 1:\t\t");
        
     // Declares weights using array which stores 7 integers
        int weight[] = new int[7];
        
     // Initializing these two arrays
        int score[] = {0,0,0,0,0,0,0};
        int provided[] = {0,0,0,0,0,0,0};
        
        weight[0] = keyboard.nextInt();
        System.out.print("Exam 2:\t\t");
        weight[1] = keyboard.nextInt();
        System.out.print("Final Exam:\t");
        weight[2] = keyboard.nextInt();
        System.out.print("Labs:\t\t");
        weight[3] = keyboard.nextInt();
        System.out.print("Projects:\t");
        weight[4] = keyboard.nextInt();
        System.out.print("Participation:\t");
        weight[5] = keyboard.nextInt();
        System.out.print("Quizzes:\t");
        weight[6] = keyboard.nextInt();
        
     // Check if the weights equals to 100
        int sumWeights = 0;
        for (int a = 0; a < 7; a++)
            sumWeights += weight[a];
        if (sumWeights != 100) {
            System.out.println("Weights don't add up to 100, program exiting...");
        } else {
            System.out.print("Do you know your exam 1 score?");
            String exam1 = keyboard.next();

            if (exam1.equalsIgnoreCase("yes") || exam1.equalsIgnoreCase("y")) {
                System.out.print("Score received on exam 1:");
                score[0] = keyboard.nextInt();
                provided[0] = 1;
                System.out.print("Do you know your exam 2 score?");
                String exam2 = keyboard.next();
                if (exam2.equalsIgnoreCase("yes") ||
                    exam2.equalsIgnoreCase("y")) {
                    System.out.print("Score received on exam 2:");
                    score[1] = keyboard.nextInt();
                    provided[1] = 1;
                    System.out.print("Do you know your final exam score?");
                    String fexam1 = keyboard.next();
                    if (fexam1.equalsIgnoreCase("yes") ||
                        fexam1.equalsIgnoreCase("y")) {
                        System.out.print("Score received on final exam:");
                        score[2] = keyboard.nextInt();
                        provided[2] = 1;
                    }
                }
            }
            // Prompts the user for the questions (skips above if user doesn't have exam 1/2 or final exam)
            System.out.print("Do you know your lab average?");
            String lab = keyboard.next();
            if (lab.equalsIgnoreCase("yes") || lab.equalsIgnoreCase("y")) {
                System.out.print("Average lab grade:");
                score[3] = keyboard.nextInt();
                provided[3] = 1;
            }
            System.out.print("Do you know your project average?");
            String project = keyboard.next();
            if (project.equalsIgnoreCase("yes") ||
                project.equalsIgnoreCase("y")) {
                System.out.print("Average project grade:");
                score[4] = keyboard.nextInt();
                provided[4] = 1;
            }
            System.out.print("Do you know your participation average?");
            String participation = keyboard.next();
            if (participation.equalsIgnoreCase("yes") ||
                participation.equalsIgnoreCase("y")) {
                System.out.print("Average participation grade:");
                score[5] = keyboard.nextInt();
                provided[5] = 1;
            }
            System.out.print("Do you know your quiz average?");
            String quizzes = keyboard.next();
            if (quizzes.equalsIgnoreCase("yes") ||
                quizzes.equalsIgnoreCase("y")) {
                System.out.print("Average quiz grade:");
                score[6] = keyboard.nextInt();
                provided[6] = 1;
            }
            
            double weightscore = 0.00;
            double totalprovided = 0.00;
            for (int a = 0; a < 7; a++) {
                weightscore += provided[a] * weight[a] * score[a];
                totalprovided += weight[a] * provided[a];
            }
            double finalcurrentGrade = (100.00 * (weightscore / totalprovided)) / 100.00;

         // Convert FGrade to BigDecimal for precise rounding
         BigDecimal bd = new BigDecimal(finalcurrentGrade);

         // Set scale to 4 digits, rounding half up if necessary
         bd = bd.setScale(2, RoundingMode.HALF_UP);

         // Convert back to double if needed, or directly use bd.toString() for output
         finalcurrentGrade = bd.doubleValue();

         System.out.println("Current grade score: " + bd); // Using bd.toString() directly
            String currentGrade = "";
            if (90 < finalcurrentGrade && finalcurrentGrade < 101) {
                currentGrade = ("A");
            } else if (80 < finalcurrentGrade && finalcurrentGrade < 90) {
                currentGrade = ("B");
            } else if (70 < finalcurrentGrade && finalcurrentGrade < 80) {
                currentGrade = ("C");
            } else if (60 < finalcurrentGrade && finalcurrentGrade < 70) {
                currentGrade = ("D");
            } else if (60 > finalcurrentGrade) {
                currentGrade = ("F");
            }
            
            // Displays the grades, if it was attained, what more is needed to score if not, and what grade is guaranteed
            System.out.println("Your current letter grade:" + currentGrade);
            if (desiredcurrentGrade.equalsIgnoreCase(currentGrade.toUpperCase()))
                System.out.println("Congratulations! You received the " + currentGrade.toUpperCase() + " that you wanted!");
            else {
                double AvgFinal = ((100 * grade) - weightscore) / (100 - totalprovided);
                if (AvgFinal > 100) {
                    System.out.println("Unfortunately, a grade of " + desiredcurrentGrade + " is not possible.");
                } else if (AvgFinal < 0) {
                    System.out.println("You will receive at least a grade of " + desiredcurrentGrade + ".");
                } else if (AvgFinal <= 100) {
                    System.out.printf("In order to receive a grade of %s", desiredcurrentGrade.toUpperCase());
                    System.out.printf(",\nyou need to score an average greater than\nor equal to %.2f ", AvgFinal);
                    System.out.println("in the rest of the grade items.");
                    
                    keyboard.close();
                }
            }
        }
    }
}
