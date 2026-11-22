package com.blake.dungeonadventure;

// I chose an immutable class because these settings should
// stay the same while the game runs. This makes the settings
// easier to manage and prevents accidental changes.
//
// Performance: The class is simple and only stores two numbers.
// Reading the values is fast, and no extra code is needed
// to manage changes after the object is created.

// Immutable class that stores settings for the game.
// Once a GameSettings object is created, its values
// cannot be changed.
public final class GameSettings {

    // Private fields prevent direct access from other classes.
    // Final means the values can only be assigned once.
    private final int startingHealth;
    private final int maxRooms;

    // Constructor sets the values when the object is created.
    public GameSettings(int startingHealth, int maxRooms) {
        this.startingHealth = startingHealth;
        this.maxRooms = maxRooms;
    }

    // Returns the starting health.
    // No setter is provided because the value should not change.
    public int getStartingHealth() {
        return startingHealth;
    }

    // Returns the maximum number of rooms.
    // No setter is provided because the value should not change.
    public int getMaxRooms() {
        return maxRooms;
    }
}