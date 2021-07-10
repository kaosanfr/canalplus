package com.sandra;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestScoreSetsGagnants {

    private static String playerOne = "Joueur 1";
    private static String playerTwo = "Joueur 2";

    private Match match;

    @Before
    public void setup() {
        match = new Match(playerOne, playerTwo);
    }

    /**
     * Ce test vérifie que les sets se contabilisent correctement
     */
    @Test
    public void shouldBeAcceptable() {

    	//game 1 win by
        match.pointWonBy(playerOne);
        assertEquals("0-0, 15-0", match.score());

        match.pointWonBy(playerOne);
        assertEquals("0-0, 30-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("0-0, 40-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("1-0", match.score());

        
        // game 2
        match.pointWonBy(playerOne);
        assertEquals("1-0, 15-0", match.score());

        match.pointWonBy(playerOne);
        assertEquals("1-0, 30-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("1-0, 40-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("2-0", match.score());

        // game 3
        match.pointWonBy(playerOne);
        assertEquals("2-0, 15-0", match.score());

        match.pointWonBy(playerOne);
        assertEquals("2-0, 30-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("2-0, 40-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("3-0", match.score());

        // game 4
        match.pointWonBy(playerOne);
        assertEquals("3-0, 15-0", match.score());

        match.pointWonBy(playerOne);
        assertEquals("3-0, 30-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("3-0, 40-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("4-0", match.score());
        
        // game 5
        match.pointWonBy(playerOne);
        assertEquals("4-0, 15-0", match.score());

        match.pointWonBy(playerOne);
        assertEquals("4-0, 30-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("4-0, 40-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("5-0", match.score());
        
        // game 6
        match.pointWonBy(playerOne);
        assertEquals("5-0, 15-0", match.score());

        match.pointWonBy(playerOne);
        assertEquals("5-0, 30-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("5-0, 40-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("0-0, 0-0", match.score());
        
        // game 7
        match.pointWonBy(playerTwo);
        assertEquals("0-0, 0-15", match.score());

        match.pointWonBy(playerTwo);
        assertEquals("0-0, 0-30", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("0-0, 0-40", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("0-1", match.score());
        
        // game 8
        match.pointWonBy(playerTwo);
        assertEquals("0-1, 0-15", match.score());

        match.pointWonBy(playerTwo);
        assertEquals("0-1, 0-30", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("0-1, 0-40", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("0-2", match.score());
        
        // game 9
        match.pointWonBy(playerTwo);
        assertEquals("0-2, 0-15", match.score());

        match.pointWonBy(playerTwo);
        assertEquals("0-2, 0-30", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("0-2, 0-40", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("0-3", match.score());
        
        // game 10
        match.pointWonBy(playerTwo);
        assertEquals("0-3, 0-15", match.score());

        match.pointWonBy(playerTwo);
        assertEquals("0-3, 0-30", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("0-3, 0-40", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("0-4", match.score());

        // game 11
        match.pointWonBy(playerTwo);
        assertEquals("0-4, 0-15", match.score());

        match.pointWonBy(playerTwo);
        assertEquals("0-4, 0-30", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("0-4, 0-40", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("0-5", match.score());
        
        // game 12
        match.pointWonBy(playerTwo);
        assertEquals("0-5, 0-15", match.score());

        match.pointWonBy(playerTwo);
        assertEquals("0-5, 0-30", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("0-5, 0-40", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("0-0, 0-0", match.score());
        

    }
}
