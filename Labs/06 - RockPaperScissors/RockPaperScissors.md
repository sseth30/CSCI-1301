# RockPaperScissors.java Program 

>[!IMPORTANT]
The `RockPaperScissors.java` Java program allows a user to play the classic game of Rock, Paper, Scissors against the computer. The user is first prompted with the number of rounds that both the user and the computer would like to play. Both the user and computer take turns selecting moves, with the game continuing until either the user or the computer wins the specified number of points. The computer moves are dictated by the `ComputerOpponent.java` file. 

## Program Functionality

- The program begins by asking the user to input the number of points required to win the game. It ensures that the input is a valid integer greater than 0.
- The user is then prompted to choose between rock, paper, or scissors in each round of the game.
- If the user inputs an invalid choice (anything other than rock, paper, or scissors), the program asks the user to try again.
- The computer's move is determined through the `ComputerOpponent.getMove()` method (not shown in the provided code snippet).
- If the variable `static boolean TESTING_MODE = false;` in `ComputerOpponent.java` is set to `false`, the computer will generate moves randomly via `Math.random()`. Else, if it is set to `true`, the computer's moves will be set in a fixed order _(rock, paper, scissors, rock, paper, scissors, etc.)_
- The program compares the user's and the computer's choices to determine the winner of each round and updates the scores accordingly.
- The game continues until either the user or the computer reaches the specified points to win.
- The program announces the winner at the end of the game.

>[!WARNING]
>Make sure to correctly input your move. For example, `scissor`, `scisors`, or `s` will output an **invalid input.** All user inputs are case-insensitive.

## Example Game Session -
- **Points to win:** `4`
- **Rock, paper, or scissors?** `paper`
>- **The computer chose rock, so you win!** (1-0)
- **Rock, paper, or scissors?** `scisor`
>- **Invalid input. Please try again with 'rock', 'paper', or 'scissors'.**
- **Rock, paper, or scissors?** `scissors`
>- **The computer chose paper, so you win!** (2-0)
- **Rock, paper, or scissors?** `sciSSoRs`
>- **The computer chose scissors, so it's a tie** (2-0)
- **Rock, paper, or scissors?** `scIssoRS`
>- **The computer chose rock, so you lose.** (2-1)
- **Rock, paper, or scissors?** `SCIssors`
>- **The computer chose paper, so you win!** (3-1)
- **Rock, paper, or scissors?** `Rock`
>- **The computer chose scissors, so you win!** (4-1)
>- **Congratulations! You won!**

