package com.blake.dungeonadventure;

public abstract class GameCharacter {

    // PUBLIC: Accessible from other classes.
    public String characterType = "Unknown";

    // PROTECTED: Accessible within this package
    // and through inheritance.
    protected int health = 100;

    // PACKAGE-PRIVATE: Accessible to classes
    // within com.blake.dungeonadventure.
    int level = 1;

    // PRIVATE: Accessible only inside GameCharacter.
    private int experience = 0;

    // Public method that returns the private field.
    public int getExperience() {
        return experience;
    }

    // Every concrete character must implement attack().
    public abstract void attack();
}
