package com.sandra;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestExample4 {

    private static String playerOne = "Joueur 1";
    private static String playerTwo = "Joueur 2";

    private Match match;

    @Before
    public void setup() {
        match = new Match(playerOne, playerTwo);
    }

    /**
     * This test simulates Exmaple4 from document
     */
    @Test
    public void shouldBeAcceptable() {

    	UtilsTests.doFirstPartOfMatch(match, playerOne, playerTwo);
    	
        match.pointWonBy(playerOne);
        assertEquals("0-0, 15-0", match.score());

        match.pointWonBy(playerOne);
        assertEquals("0-0, 30-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("0-0, 40-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("1-0", match.score());

        match.pointWonBy(playerOne);
        assertEquals("1-0, 15-0", match.score());

        match.pointWonBy(playerOne);
        assertEquals("1-0, 30-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("1-0, 40-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("2-0", match.score());

        match.pointWonBy(playerOne);
        assertEquals("2-0, 15-0", match.score());

        match.pointWonBy(playerOne);
        assertEquals("2-0, 30-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("2-0, 40-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("3-0", match.score());

        match.pointWonBy(playerOne);
        assertEquals("3-0, 15-0", match.score());

        match.pointWonBy(playerOne);
        assertEquals("3-0, 30-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("3-0, 40-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("4-0", match.score());

        match.pointWonBy(playerOne);
        assertEquals("4-0, 15-0", match.score());

        match.pointWonBy(playerOne);
        assertEquals("4-0, 30-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("4-0, 40-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("5-0", match.score());

        match.pointWonBy(playerOne);
        assertEquals("5-0, 15-0", match.score());

        match.pointWonBy(playerOne);
        assertEquals("5-0, 30-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("5-0, 40-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("", match.score());
        
        
    }
}
