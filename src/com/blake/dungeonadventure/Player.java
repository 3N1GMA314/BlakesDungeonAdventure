package com.blake.dungeonadventure;

import java.util.ArrayList;

public class Player extends GameCharacter {

    private WeaponType weapon = WeaponType.SWORD;

    // Overrides Java's built-in toString() method.
    // Provides useful information about player.
    @Override
    public String toString() {
        return "Player's equipped weapon: " + weapon;
    }


    // Each player has their own inventory.
    private final Inventory inventory = new Inventory();

    @Override
    public void attack() {
        System.out.println("The player attacks with a " + weapon + "!");
    }

    public void setWeapon(WeaponType weapon) {
        this.weapon = weapon;
    }

    // Demonstrates inherited protected field access.
    // Player can access health from GameCharacter.
    public void showHealth() {
        System.out.println("Player health: " + health);
    }

    // Allows other classes to access the player's inventory.
    public Inventory getInventory() {
        return inventory;
    }

    // Nested class that stores the player's collected items.
    public class Inventory {

        private final ArrayList<String> items = new ArrayList<>();

        // Adds an item to the player's inventory.
        public void addItem(String item) {
            items.add(item);
            System.out.println(item + " added to inventory!");
        }

        // Demonstrates how an inner class can access
        // a private field from its outer Player class.
        public void showEquippedWeapon() {
            System.out.println("Equipped weapon: " + weapon);
        }

        // Displays everything the player has collected.
        public void showItems() {
            System.out.println("Player Inventory:");

            for (String item : items) {
                System.out.println("- " + item);
            }
        }
    }
}
