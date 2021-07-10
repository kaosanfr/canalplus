package com.sandra;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestExample5 {

    private static String playerOne = "Joueur 1";
    private static String playerTwo = "Joueur 2";

    private Match match;

    @Before
    public void setup() {
        match = new Match(playerOne, playerTwo);
    }

    /**
     * This test simulates Exmaple5 from document
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

       
        match.pointWonBy(playerTwo);
        assertEquals("2-0, 0-15", match.score());

        match.pointWonBy(playerTwo);
        assertEquals("2-0, 0-30", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("2-0, 0-40", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("2-1", match.score());

        
        match.pointWonBy(playerTwo);
        assertEquals("2-1, 0-15", match.score());

        match.pointWonBy(playerTwo);
        assertEquals("2-1, 0-30", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("2-1, 0-40", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("2-2", match.score());
        

        match.pointWonBy(playerTwo);
        assertEquals("2-2, 0-15", match.score());

        match.pointWonBy(playerTwo);
        assertEquals("2-2, 0-30", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("2-2, 0-40", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("2-3", match.score());
        

        match.pointWonBy(playerTwo);
        assertEquals("2-3, 0-15", match.score());

        match.pointWonBy(playerTwo);
        assertEquals("2-3, 0-30", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("2-3, 0-40", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("2-4", match.score());

        
        match.pointWonBy(playerTwo);
        assertEquals("2-4, 0-15", match.score());

        match.pointWonBy(playerTwo);
        assertEquals("2-4, 0-30", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("2-4, 0-40", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("2-5", match.score());

        
        match.pointWonBy(playerTwo);
        assertEquals("2-5, 0-15", match.score());

        match.pointWonBy(playerTwo);
        assertEquals("2-5, 0-30", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("2-5, 0-40", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("0-0, 0-0", match.score());
        
        UtilsExample5.doASetForTieGame(match, playerOne, playerTwo);
        
        UtilsExample5.doTieGame(match, playerOne, playerTwo);
        
        UtilsExample5.doFinalSetOFMatch(match, playerOne, playerTwo);
        
    }
}
