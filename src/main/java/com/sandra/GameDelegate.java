package com.sandra;

// Defines the contract for each type of Game state.
// Implementors are concrete Game states, eg: DeuceGame.
//
interface GameDelegate {

    void pointWonBy(String player);
    String score();
}
