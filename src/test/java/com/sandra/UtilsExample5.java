package com.sandra;

import static org.junit.Assert.assertEquals;


/**
 * 
 * USE ONLY BY TestExample5
 * 
 * This class is used to play a set that will be need a TieBreak game
 * Then it plays a TieGame to give a final score of set of (5-7)
 * 
 * Then it plays the final set of the match for an score of (4-6)
 * 
 * 
 * @author cachitos
 *
 */

public class UtilsExample5 {
	
	public static void doASetForTieGame(Match match, String playerOne, String playerTwo) {
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
        

        //player two wins game 2
        match.pointWonBy(playerTwo);
        assertEquals("2-1, 0-15", match.score());

        match.pointWonBy(playerTwo);
        assertEquals("2-1, 0-30", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("2-1, 0-40", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("2-2", match.score());
        

        //player one wins game 3
        match.pointWonBy(playerOne);
        assertEquals("2-2, 15-0", match.score());

        match.pointWonBy(playerOne);
        assertEquals("2-2, 30-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("2-2, 40-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("3-2", match.score());

        
        match.pointWonBy(playerTwo);
        assertEquals("3-2, 0-15", match.score());

        match.pointWonBy(playerTwo);
        assertEquals("3-2, 0-30", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("3-2, 0-40", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("3-3", match.score());
        

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
        

        match.pointWonBy(playerOne);
        assertEquals("4-4, 15-0", match.score());

        match.pointWonBy(playerOne);
        assertEquals("4-4, 30-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("4-4, 40-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("5-4", match.score());
        

        match.pointWonBy(playerTwo);
        assertEquals("5-4, 0-15", match.score());

        match.pointWonBy(playerTwo);
        assertEquals("5-4, 0-30", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("5-4, 0-40", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("5-5", match.score());
        

        match.pointWonBy(playerOne);
        assertEquals("5-5, 15-0", match.score());

        match.pointWonBy(playerOne);
        assertEquals("5-5, 30-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("5-5, 40-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("6-5", match.score());
        

        match.pointWonBy(playerTwo);
        assertEquals("6-5, 0-15", match.score());

        match.pointWonBy(playerTwo);
        assertEquals("6-5, 0-30", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("6-5, 0-40", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("6-6", match.score());
        
        
        
        
	}
	
	public static void doTieGame(Match match, String playerOne, String playerTwo) {
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

        match.pointWonBy(playerTwo);
        assertEquals("6-6, 4-3", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("6-6, 5-3", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("6-6, 5-4", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("6-6, 5-5", match.score());
                
        match.pointWonBy(playerTwo);
        assertEquals("6-6, 5-6", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("0-0, 0-0", match.score());
		
	}
	
	/**
	 * This methods plays the final set of the Match related to Example5 (4-6)
	 * @param match
	 * @param playerOne
	 * @param player2
	 */
	public static void doFinalSetOFMatch(Match match, String playerOne, String playerTwo) {
        match.pointWonBy(playerTwo);
        assertEquals("0-0, 0-15", match.score());

        match.pointWonBy(playerTwo);
        assertEquals("0-0, 0-30", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("0-0, 0-40", match.score());

        match.pointWonBy(playerTwo);
        assertEquals("0-1", match.score());
        
        
        
        match.pointWonBy(playerOne);
        assertEquals("0-1, 15-0", match.score());

        match.pointWonBy(playerOne);
        assertEquals("0-1, 30-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("0-1, 40-0", match.score());

        match.pointWonBy(playerOne);
        assertEquals("1-1", match.score());
        

        match.pointWonBy(playerTwo);
        assertEquals("1-1, 0-15", match.score());

        match.pointWonBy(playerTwo);
        assertEquals("1-1, 0-30", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("1-1, 0-40", match.score());

        match.pointWonBy(playerTwo);
        assertEquals("1-2", match.score());
        
        
        match.pointWonBy(playerOne);
        assertEquals("1-2, 15-0", match.score());

        match.pointWonBy(playerOne);
        assertEquals("1-2, 30-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("1-2, 40-0", match.score());

        match.pointWonBy(playerOne);
        assertEquals("2-2", match.score());
        
        
        match.pointWonBy(playerTwo);
        assertEquals("2-2, 0-15", match.score());

        match.pointWonBy(playerTwo);
        assertEquals("2-2, 0-30", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("2-2, 0-40", match.score());

        match.pointWonBy(playerTwo);
        assertEquals("2-3", match.score());
        

        match.pointWonBy(playerOne);
        assertEquals("2-3, 15-0", match.score());

        match.pointWonBy(playerOne);
        assertEquals("2-3, 30-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("2-3, 40-0", match.score());

        match.pointWonBy(playerOne);
        assertEquals("3-3", match.score());
        
        
        match.pointWonBy(playerTwo);
        assertEquals("3-3, 0-15", match.score());

        match.pointWonBy(playerTwo);
        assertEquals("3-3, 0-30", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("3-3, 0-40", match.score());

        match.pointWonBy(playerTwo);
        assertEquals("3-4", match.score());
        

        match.pointWonBy(playerOne);
        assertEquals("3-4, 15-0", match.score());

        match.pointWonBy(playerOne);
        assertEquals("3-4, 30-0", match.score());
        
        match.pointWonBy(playerOne);
        assertEquals("3-4, 40-0", match.score());

        match.pointWonBy(playerOne);
        assertEquals("4-4", match.score());
        

        match.pointWonBy(playerTwo);
        assertEquals("4-4, 0-15", match.score());

        match.pointWonBy(playerTwo);
        assertEquals("4-4, 0-30", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("4-4, 0-40", match.score());

        match.pointWonBy(playerTwo);
        assertEquals("4-5", match.score());
        
        
        match.pointWonBy(playerTwo);
        assertEquals("4-5, 0-15", match.score());

        match.pointWonBy(playerTwo);
        assertEquals("4-5, 0-30", match.score());
        
        match.pointWonBy(playerTwo);
        assertEquals("4-5, 0-40", match.score());

        match.pointWonBy(playerTwo);
        assertEquals("", match.score());
        

	}
	

}
