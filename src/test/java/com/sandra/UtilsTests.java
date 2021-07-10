package com.sandra;

import static org.junit.Assert.assertEquals;

/**
 * This class is used to generate the first 2  tests of Examples given on the documentation
 * (6 -1) (7-5)
 * 
 * @author cachitos
 *
 */
public class UtilsTests {
	
	public static void doFirstPartOfMatch(Match match, String playerOne, String playerTwo) {
    	//player one wins game 1
        match.pointWonBy(playerOne);
        assertEquals("0-0, 15-0", match.score());

        match.pointWonBy(playerOne);
        assertEquals("0-0, 30-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("0-0, 40-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("1-0", match.score());

        //player two wins game 2
        match.pointWonBy(playerTwo);
        assertEquals("1-0, 0-15", match.score());

        match.pointWonBy(playerTwo);
        assertEquals("1-0, 0-30", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("1-0, 0-40", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("1-1", match.score());

        //player one wins game 3
        match.pointWonBy(playerOne);
        assertEquals("1-1, 15-0", match.score());

        match.pointWonBy(playerOne);
        assertEquals("1-1, 30-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("1-1, 40-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("2-1", match.score());
        
        
        //player two wins game 4
        match.pointWonBy(playerOne);
        assertEquals("2-1, 15-0", match.score());

        match.pointWonBy(playerOne);
        assertEquals("2-1, 30-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("2-1, 40-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("3-1", match.score());
        

        //player one wins game 5
        match.pointWonBy(playerOne);
        assertEquals("3-1, 15-0", match.score());

        match.pointWonBy(playerOne);
        assertEquals("3-1, 30-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("3-1, 40-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("4-1", match.score());
        
        
        //player one wins game 7
        match.pointWonBy(playerOne);
        assertEquals("4-1, 15-0", match.score());

        match.pointWonBy(playerOne);
        assertEquals("4-1, 30-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("4-1, 40-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("5-1", match.score());
        


        //player one wins game 9
        match.pointWonBy(playerOne);
        assertEquals("5-1, 15-0", match.score());

        match.pointWonBy(playerOne);
        assertEquals("5-1, 30-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("5-1, 40-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("0-0, 0-0", match.score());
        

        // until here first set score is (6-1)
        // start second set
    	//player one wins game 1
        match.pointWonBy(playerOne);
        assertEquals("0-0, 15-0", match.score());

        match.pointWonBy(playerOne);
        assertEquals("0-0, 30-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("0-0, 40-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("1-0", match.score());
        
        //player two wins game 2
        match.pointWonBy(playerTwo);
        assertEquals("1-0, 0-15", match.score());

        match.pointWonBy(playerTwo);
        assertEquals("1-0, 0-30", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("1-0, 0-40", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("1-1", match.score());

        //player one wins game 3
        match.pointWonBy(playerOne);
        assertEquals("1-1, 15-0", match.score());

        match.pointWonBy(playerOne);
        assertEquals("1-1, 30-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("1-1, 40-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("2-1", match.score());

        //player two wins game 4
        match.pointWonBy(playerTwo);
        assertEquals("2-1, 0-15", match.score());

        match.pointWonBy(playerTwo);
        assertEquals("2-1, 0-30", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("2-1, 0-40", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("2-2", match.score());

        //player one wins game 5
        match.pointWonBy(playerOne);
        assertEquals("2-2, 15-0", match.score());

        match.pointWonBy(playerOne);
        assertEquals("2-2, 30-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("2-2, 40-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("3-2", match.score());

        //player two wins game 6
        match.pointWonBy(playerTwo);
        assertEquals("3-2, 0-15", match.score());

        match.pointWonBy(playerTwo);
        assertEquals("3-2, 0-30", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("3-2, 0-40", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("3-3", match.score());

        //player one wins game 7
        match.pointWonBy(playerOne);
        assertEquals("3-3, 15-0", match.score());

        match.pointWonBy(playerOne);
        assertEquals("3-3, 30-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("3-3, 40-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("4-3", match.score());

        match.pointWonBy(playerTwo);
        assertEquals("4-3, 0-15", match.score());

        match.pointWonBy(playerTwo);
        assertEquals("4-3, 0-30", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("4-3, 0-40", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("4-4", match.score());

        //player one wins game 9
        match.pointWonBy(playerOne);
        assertEquals("4-4, 15-0", match.score());

        match.pointWonBy(playerOne);
        assertEquals("4-4, 30-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("4-4, 40-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("5-4", match.score());


        //player two wins game 10
        match.pointWonBy(playerTwo);
        assertEquals("5-4, 0-15", match.score());

        match.pointWonBy(playerTwo);
        assertEquals("5-4, 0-30", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("5-4, 0-40", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("5-5", match.score());
        
        
        //player one wins game 11
        match.pointWonBy(playerOne);
        assertEquals("5-5, 15-0", match.score());

        match.pointWonBy(playerOne);
        assertEquals("5-5, 30-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("5-5, 40-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("6-5", match.score());
        

        //player two wins game 12
        match.pointWonBy(playerTwo);
        assertEquals("6-5, 0-15", match.score());

        match.pointWonBy(playerTwo);
        assertEquals("6-5, 0-30", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("6-5, 0-40", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("6-6", match.score());
        
        doTieGame(match, playerOne, playerTwo);
	}	
	
	
	public static void doTieGame(Match match, String playerOne, String playerTwo) {
        // Final score until here 6-6
        // start tie game
        // play set according to TieGames Rules
        match.pointWonBy(playerOne);
        assertEquals("6-6, 1-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("6-6, 2-0", match.score());

        match.pointWonBy(playerTwo);
        assertEquals("6-6, 2-1", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("6-6, 2-2", match.score());

        match.pointWonBy(playerOne);
        assertEquals("6-6, 3-2", match.score());

        match.pointWonBy(playerOne);
        assertEquals("6-6, 4-2", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("6-6, 5-2", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("6-6, 5-3", match.score());

        match.pointWonBy(playerOne);
        assertEquals("6-6, 6-3", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("6-6, 6-4", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("6-6, 6-5", match.score());

        match.pointWonBy(playerOne);
        assertEquals("0-0, 0-0", match.score());
        // end tie break game
		
	}
}
