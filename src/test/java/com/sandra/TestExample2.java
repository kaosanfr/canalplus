package com.sandra;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestExample2 {

    private static String playerOne = "Joueur 1";
    private static String playerTwo = "Joueur 2";

    private Match match;

    @Before
    public void setup() {
        match = new Match(playerOne, playerTwo);
    }

    /**
     * This test simulates Example2 from document
     */
    @Test
    public void shouldBeAcceptable() {

    	UtilsTests.doFirstPartOfMatch(match, playerOne, playerTwo);
    	
        // Do a Deuce
        match.pointWonBy(playerOne);
        assertEquals("0-0, 15-0", match.score());

        match.pointWonBy(playerTwo);
        assertEquals("0-0, 15-15", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("0-0, 30-15", match.score());

        match.pointWonBy(playerTwo);
        assertEquals("0-0, 30-30", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("0-0, 40-30", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("0-0, Deuce", match.score());
        
    }
}
