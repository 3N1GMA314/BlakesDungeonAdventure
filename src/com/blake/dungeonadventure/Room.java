package com.blake.dungeonadventure;

import java.util.ArrayList;

public class Room {

    private final String name;
    private final String description;

    private final ArrayList<Item> items = new ArrayList<>();
    private final ArrayList<Enemy> enemies = new ArrayList<>();

    // Creates a room with a name and description.
    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Adds an item to this room.
    public void addItem(Item item) {
        items.add(item);
    }

    // Adds an enemy to this room.
    public void addEnemy(Enemy enemy) {
        enemies.add(enemy);
    }

    // Displays the room's name, description,
    // items, and number of enemies.
    public void describeRoom() {

        System.out.println("\n=== " + name + " ===");
        System.out.println(description);

        // Display the items inside the room.
        System.out.println("\nItems found:");

        if (items.isEmpty()) {
            System.out.println("There are no items in this room.");
        } else {
            for (Item item : items) {
                System.out.println("- " + item.getName());
            }
        }

        // Display the number of enemies.
        System.out.println("\nEnemies nearby: " + enemies.size());
    }
}
