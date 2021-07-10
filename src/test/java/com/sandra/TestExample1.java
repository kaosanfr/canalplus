package com.sandra;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestExample1 {

    private static String playerOne = "Joueur 1";
    private static String playerTwo = "Joueur 2";

    private Match match;

    @Before
    public void setup() {
        match = new Match(playerOne, playerTwo);
    }

    /**
     * This test shows Exmaple1 from document 
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

       
        match.pointWonBy(playerTwo);
        assertEquals("1-0, 0-15", match.score());

        match.pointWonBy(playerTwo);
        assertEquals("1-0, 0-30", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("1-0, 15-30", match.score());
        
    }
}
