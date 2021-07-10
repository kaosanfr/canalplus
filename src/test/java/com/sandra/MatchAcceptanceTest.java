package com.sandra;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MatchAcceptanceTest {

    private static String playerOne = "player 1";
    private static String playerTwo = "player 2";

    private Match match;

    @Before
    public void setup() {
        match = new Match(playerOne, playerTwo);
    }

    @Test
    public void shouldBeAcceptable() {

        // Acceptance Test based on README.
        //
        // Note: Not every permutation of a Tennis Match is tested!
        // Firstly, the assignment suggested not spending too much time
        // on this, and secondly the 'acceptance tests are met'.
        //
        // HOWEVER - it is hoped the composition, patterns and
        // approach are be enough to demonstrate:
        // - Separation of concerns,
        // - Single responsibility
        // - Classes that echo the business (DDD)
        // - Simplest thing that can possibly work (and be read and maintained)

        match.pointWonBy(playerOne);
        assertEquals("0-0, 15-0", match.score());
        
        match.pointWonBy(playerTwo);

        assertEquals("0-0, 15-15", match.score());

        match.pointWonBy(playerOne);
        match.pointWonBy(playerOne);
        assertEquals("0-0, 40-15", match.score());

        match.pointWonBy(playerTwo);
        match.pointWonBy(playerTwo);
        assertEquals("0-0, Deuce", match.score());

        match.pointWonBy(playerOne);
        assertEquals("0-0, Advantage player 1", match.score());

        match.pointWonBy(playerOne);
        assertEquals("1-0", match.score());
        
        match.pointWonBy(playerOne); 
        match.score();
        
        match.pointWonBy(playerOne);
        match.score();
        
        match.pointWonBy(playerOne);
        match.score();

        match.pointWonBy(playerOne);
        match.score();
       
        match.pointWonBy(playerOne);
        match.score();
        
        match.pointWonBy(playerOne);
        match.score();
        
        match.pointWonBy(playerOne);
        match.score();

        match.pointWonBy(playerOne);
        match.score();
        
        match.pointWonBy(playerOne);
        match.score();
        
        match.pointWonBy(playerOne);
        match.score();
        
        match.pointWonBy(playerOne);
        match.score();

        match.pointWonBy(playerOne);
        match.score();
        
        match.pointWonBy(playerOne);
        match.score();
        
        match.pointWonBy(playerOne);
        match.score();
        
        match.pointWonBy(playerOne);
        match.score();

        match.pointWonBy(playerOne);
        match.score();

        match.pointWonBy(playerOne);
        match.score();
        
        match.pointWonBy(playerOne);
        match.score();
        
        match.pointWonBy(playerOne);
        match.score();

        match.pointWonBy(playerOne);
        match.score();

        //
        match.pointWonBy(playerOne);
        match.score();

        match.pointWonBy(playerOne);
        match.score();
        
        match.pointWonBy(playerOne);
        match.score();

        match.pointWonBy(playerOne);
        match.score();
        
        match.pointWonBy(playerOne);
        match.score();

        match.pointWonBy(playerOne);
        match.score();
        match.pointWonBy(playerTwo);
        match.score();
        match.pointWonBy(playerOne);
        match.score();
        match.pointWonBy(playerOne);
        match.score();
        match.pointWonBy(playerOne);
        match.score();

        match.pointWonBy(playerOne);
        match.score();
        match.pointWonBy(playerTwo);
        match.score();
        match.pointWonBy(playerOne);
        match.score();
        match.pointWonBy(playerOne);
        match.score();
        match.pointWonBy(playerOne);
        match.score();

        match.pointWonBy(playerOne);
        match.score();
        match.pointWonBy(playerTwo);
        match.score();
        match.pointWonBy(playerOne);
        match.score();
        match.pointWonBy(playerOne);
        match.score();
        match.pointWonBy(playerOne);
        match.score();
        match.pointWonBy(playerOne);
        match.score();
        match.pointWonBy(playerTwo);
        match.score();
        match.pointWonBy(playerOne);
        match.score();
        match.pointWonBy(playerOne);
        match.score();
        match.pointWonBy(playerOne);
        match.score();
        match.pointWonBy(playerOne);
        match.score();
        match.pointWonBy(playerTwo);
        match.score();
        match.pointWonBy(playerOne);
        match.score();
        match.pointWonBy(playerOne);
        match.score();
        match.pointWonBy(playerOne);
        match.score();

        match.pointWonBy(playerOne);
        match.score();
        match.pointWonBy(playerTwo);
        match.score();
        match.pointWonBy(playerOne);
        match.score();
        match.pointWonBy(playerOne);
        match.score();
        match.pointWonBy(playerOne);
        match.score();
        match.pointWonBy(playerOne);
        match.score();
        match.pointWonBy(playerTwo);
        match.score();
        match.pointWonBy(playerOne);
        match.score();
        match.pointWonBy(playerOne);
        match.score();
        match.pointWonBy(playerOne);
        match.score();
        match.pointWonBy(playerOne);
        match.score();
        match.pointWonBy(playerTwo);
        match.score();
        match.pointWonBy(playerOne);
        match.score();
        match.pointWonBy(playerOne);
        match.score();
        match.pointWonBy(playerOne);
        match.score();
        match.pointWonBy(playerOne);
        match.score();
        match.pointWonBy(playerTwo);
        match.score();
        match.pointWonBy(playerOne);
        match.score();
        match.pointWonBy(playerOne);
        match.score();
        match.pointWonBy(playerOne);
        match.score();
        match.pointWonBy(playerOne);
        match.score();
        match.pointWonBy(playerTwo);
        match.score();
        match.pointWonBy(playerOne);
        match.score();
        match.pointWonBy(playerOne);
        match.score();
        match.pointWonBy(playerOne);
        match.score();
        match.pointWonBy(playerOne);
        match.score();
        match.pointWonBy(playerTwo);
        match.score();
        match.pointWonBy(playerOne);
        match.score();
        match.pointWonBy(playerOne);
        match.score();
        return;

    }
}
