// For an overview of the program and sample inputs, be sure to check out `StringFun.md`

import java.util.Scanner;

public class StringFun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string to be manipulated");
        String sentence = scanner.nextLine();

        // Main loop that runs until "quit"
        while (true) {
            System.out.println("Enter your command (reverse, replace first, replace last, remove, remove all, quit)");
            String command = scanner.nextLine();

            if ("quit".equalsIgnoreCase(command)) {
                System.out.println("...Execution Ends...");
                scanner.close();
                return;
            } else if ("reverse".equalsIgnoreCase(command)) {
                sentence = reverseString(sentence);
                System.out.println("The new sentence is: " + sentence);
            } else if ("replace first".equalsIgnoreCase(command)) {
                sentence = replaceCharacter(sentence, true, scanner);
            } else if ("replace last".equalsIgnoreCase(command)) {
                sentence = replaceCharacter(sentence, false, scanner);
            } else if ("remove".equalsIgnoreCase(command)) {
                sentence = removeCharacter(sentence, scanner, false);
            } else if ("remove all".equalsIgnoreCase(command)) {
                sentence = removeCharacter(sentence, scanner, true);
            } else {
                System.out.println("Command invalid. Try again.");
            }
        }
    }

    // Reverses and updates the null String
    private static String reverseString(String sentence) {
        String reversed = "";
        for (int i = sentence.length() - 1; i >= 0; i--) {
            reversed += sentence.charAt(i);
        }
        return reversed;
    }

    // Replaces either the first or last instance in the String with a chosen char
    private static String replaceCharacter(String sentence, boolean first, Scanner scanner) {
        System.out.println("Enter the character to replace");
        char toReplace = scanner.nextLine().charAt(0);
        System.out.println("Enter the new character");
        char newChar = scanner.nextLine().charAt(0);

        String result = "";
        boolean replaced = false;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == toReplace && (!replaced || !first)) {
                if (first && !replaced) {
                    result += newChar;
                    replaced = true;
                } else if (!first) {
                    int lastIndex = findLastIndex(sentence, toReplace);
                    if (i == lastIndex) {
                        result += newChar;
                        replaced = true;
                    } else {
                        result += sentence.charAt(i);
                    }
                } else {
                    result += sentence.charAt(i);
                }
            } else {
                result += sentence.charAt(i);
            }
        }


        if (!replaced) {
            System.out.println("The letter was not found in the word");
            return sentence;
        } else {
            System.out.println("The new sentence is: " + result);
            return result;
        }
    }

    // Finds the last indexed character of the String
    private static int findLastIndex(String sentence, char toFind) {
        for (int i = sentence.length() - 1; i >= 0; i--) {
            if (sentence.charAt(i) == toFind) {
                return i;
            }
        }
        return -1;
    }

    // Measures the instance of the String, also is able to remove char if needed
    private static String removeCharacter(String sentence, Scanner scanner, boolean removeAll) {
        System.out.println("Enter the character to remove");
        char toRemove = scanner.nextLine().charAt(0);

        if (removeAll) {
            String result = "";
            boolean characterRemoved = false;

            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) != toRemove) {
                    result += sentence.charAt(i);
                } else {
                    characterRemoved = true;
                }
            }

            sentence = result;
            if (characterRemoved) {
                System.out.println("The new sentence is: " + sentence);
            }
        } else {
            System.out.println("Enter the " + toRemove + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");

            int instanceToRemove = scanner.nextInt();
            scanner.nextLine();

            String result = "";
            int count = 0;

            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == toRemove) {
                    count++;
                    if (count != instanceToRemove) {
                        result += sentence.charAt(i);
                    }
                } else {
                    result += sentence.charAt(i);
                }
            }

            // Check if the specific instance was removed
            if (count >= instanceToRemove) {
                System.out.println("The new sentence is: " + result);
                sentence = result;
            } else {
                System.out.println("Error: the letter you are trying to remove does not exist");
            }
        }
        return sentence;
    }
}
