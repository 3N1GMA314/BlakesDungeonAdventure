package com.blake.dungeonadventure;

public class Item {

    private final String name;
    private final String description;

    // Creates an item with a name and description.
    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Returns the item's name.
    public String getName() {
        return name;
    }

    // Returns the item's description.
    public String getDescription() {
        return description;
    }
}
