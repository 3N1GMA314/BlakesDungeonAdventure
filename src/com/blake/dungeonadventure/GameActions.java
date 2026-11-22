package com.blake.dungeonadventure;

// Defines actions that a game character can perform.
// Classes that implement this interface must provide
// code for each method.
public interface GameActions {

    void attack();

    void defend();

    void explore();

    void rest();
}
