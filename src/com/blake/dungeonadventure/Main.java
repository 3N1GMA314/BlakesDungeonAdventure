package com.blake.dungeonadventure;

public class Main {

     public static void main(String[] args) {

         Player player = new Player();
         Enemy enemy = new Enemy();

         // Test the player's attack.
         player.attack();

         // Change the player's weapon.
         player.setWeapon(WeaponType.BOW);
         player.attack();

         // Test the enemy's attack.
         enemy.attack();

         // Add items to the player's inventory.
         player.getInventory().addItem("Health Potion");
         player.getInventory().addItem("Gold Key");
         player.getInventory().addItem("Magic Scroll");

         // Display all collected items.
         player.getInventory().showItems();

         // Display equipped weapon.
         player.getInventory().showEquippedWeapon();

         // Test custom toString() override.
         // Java automatically calls toString() when printing the player.
         System.out.println(player);


         // Create a dungeon room.
         Room dungeon = new Room(
                 "Dark Dungeon",
                 "A cold room filled with shadows."
         );

         // Add our existing enemy to the room.
         dungeon.addEnemy(enemy);

         // Create two items for the dungeon.
         Item potion = new Item("Health Potion", "Restores health.");
         Item key = new Item("Gold Key", "Opens a locked door.");

         // Place both items inside the room.
         dungeon.addItem(potion);
         dungeon.addItem(key);

         // Display the room's information.
         dungeon.describeRoom();


         // ------------------------------------------
         // Project 1: Access Modifier Demonstration
         // ------------------------------------------

         System.out.println("\n=== Access Modifier Demonstration ===");

         // PUBLIC: Can access this field directly.
         System.out.println("Character: " + player.characterType);

         // PROTECTED: Accessible because Main is in
         // the same package as GameCharacter.
         System.out.println("Health: " + player.health);

         // PACKAGE-PRIVATE: Accessible because Main
         // is in the same package.
         System.out.println("Level: " + player.level);

         // PRIVATE: Must use a public getter.
         System.out.println("Experience: " + player.getExperience());

         // Demonstrates accessing an inherited protected
         // field through a method in the Player class.
         player.showHealth();
     }
}

