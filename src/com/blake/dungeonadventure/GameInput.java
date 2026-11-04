
package com.blake.dungeonadventure;

public class GameInput {

    // Converts player input into a number.
    // Handles errors if the input is not a valid number.
    public int getPlayerChoice(String input) {

        try {
            // Attempt to convert the input to an integer.
            int choice = Integer.parseInt(input);

            System.out.println("Player selected option: " + choice);
            return choice;

        } catch (NumberFormatException e) {

            // Handles invalid input, such as letters.
            System.out.println("Invalid input! Please enter a number.");
            return -1;

        } finally {

            // Always runs whether input succeeds or fails.
            System.out.println("Input validation completed.");
        }
    }
}
