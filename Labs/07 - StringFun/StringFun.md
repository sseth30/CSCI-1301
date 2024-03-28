
# `StringFun.java` Program

>[!IMPORTANT]
The `StringFun.java` Java program is designed for various string manipulations, including reversing the string, replacing characters, removing a single or all instances of a character, and quitting the program. It prompts the user for a string and then asks for a command to manipulate the string according to the user's choice.

## Program Description

The program starts by asking the user to enter a string to be manipulated. Following the input, it continuously prompts for commands to manipulate the string in various ways until the user decides to quit. The available commands include reverse, replace first, replace last, remove, remove all, and quit.

## Key Features

- **Dynamic String Manipulation:** Offers a variety of string manipulation options.
- **User Interaction:** Uses console input to receive the original string and manipulation commands, and outputs the modified string.
- **Flexibility:** Allows multiple manipulations on the same string, enhancing user interaction and experience.

## Example -
>[!NOTE]
The commands include `reverse` `replace first` `replace last` `remove` `remove all` and `quit.` This is displayed in the program after each prompt, however it is omitted here in order to enhance readability.

- **Enter the string to be manipulated:** `hello world`
- **Enter your command:** `reverse`
>- **The new sentence is:** `dlrow olleh`
- **Enter your command:** `replace first`
- **Enter the character to replace:** `d`
- **Enter the new character:** `z`
>- **The new sentence is:** `zlrow olleh`
- **Enter your command:** `replace last`
- **Enter the character to replace:** `l`
- **Enter the new character:** `f`
>- **The new sentence is:** `zlrow olfeh`
- **Enter your command:** `remove`
- **Enter the character to remove:** `o`
- **Enter the "o" you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):** `2`
>- **The new sentence is:** `zlrow lfeh`
- **Enter your command:** `remove all`
- **Enter the character to remove:** `e`
>- **The new sentence is:** `zlrow lfh`
- **Enter your command:** `quit`
>- **...Execution Ends...**
