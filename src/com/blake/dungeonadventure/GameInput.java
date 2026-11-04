package com.blake.dungeonadventure;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GameInput {

    private static final Logger logger =
            LogManager.getLogger(GameInput.class);

    // Converts player input into a number.
    // Handles errors if the input is not a valid number.
    public int getPlayerChoice(String input) {

        try {
            // Attempt to convert the input to an integer.
            int choice = Integer.parseInt(input);

            logger.info("Player selected option: {}", choice);
            System.out.println("Player selected option: " + choice);

            return choice;

        } catch (NumberFormatException e) {

            logger.warn("Invalid player input: {}", input);
            logger.error("Could not convert input to a number", e);

            // Handles invalid input, such as letters.
            System.out.println("Invalid input! Please enter a number.");
            return -1;

        } finally {

            logger.info("Input validation completed.");
            // Always runs whether input succeeds or fails.
            System.out.println("Input validation completed.");
        }
    }
}
