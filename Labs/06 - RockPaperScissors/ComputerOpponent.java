// For an overview of the program and sample inputs, be sure to check out `ComputerOpponent.md`

import java.util.Scanner;
import java.util.InputMismatchException;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userScore = 0, computerScore = 0, pointsToWin = 0;
        String userMove, computerMove;
        boolean validInput = false;

        // Executes only when the user does not give a valid input for the number of points
        while (!validInput) {
            try {
                System.out.print("Points to win: ");
                pointsToWin = scanner.nextInt();
                scanner.nextLine();
                if (pointsToWin < 1) { // if the user inputs any integer under 1
                    System.out.println("Please enter an integer that is greater than 0.");
                } else {
                    validInput = true;
                }
            } catch (InputMismatchException nonInteger) { // if the user inputs anything that isn't an integer
                System.out.println("Invalid input, please try again by entering an integer.");
                scanner.nextLine();
            }
        }

        // Allows for a case-insensitive and whitespace input by the user 
        while (userScore < pointsToWin && computerScore < pointsToWin) {
            System.out.print("Rock, paper, or scissors? ");
            userMove = scanner.nextLine().toLowerCase().replaceAll("\\s+", "");

            if (!userMove.equals("rock") && !userMove.equals("paper") && !userMove.equals("scissors")) { // if the user inputs anything besides the given 3 options
                continue; // continues with the next iteration, which asks the query again
            }

            computerMove = ComputerOpponent.getMove();

            // Compares user and computer inputs to determine the correct output, as well as incrementing the points
            if (userMove.equals(computerMove)) {
                System.out.print(", so it's a tie.");
            } else if ((userMove.equals("rock") && computerMove.equals("scissors")) ||
                (userMove.equals("paper") && computerMove.equals("rock")) ||
                (userMove.equals("scissors") && computerMove.equals("paper"))) {
                System.out.print(", so you win!");
                userScore++;
            } else {
                System.out.print(", so you lose.");
                computerScore++;
            }

            // Outputs the score as it occurs
            System.out.print(" (" + userScore + "-" + computerScore + ") ");
            System.out.println();
        }

        // Determines the winner, outputs message accordingly
        if (userScore > computerScore) {
            System.out.println("Congratulations! You won!");
        } else {
            System.out.println("Sorry, you lost. Better luck next time!");
        }

        scanner.close();
    }
}
