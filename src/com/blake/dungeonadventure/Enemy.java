package com.blake.dungeonadventure;

public class Enemy extends GameCharacter {

    // Enemies attack differently than players.
    @Override
    public void attack() {
        System.out.println("The enemy attacks with its CLAWS!");
    }
}
