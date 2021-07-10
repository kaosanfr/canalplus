package com.sandra;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// Class provides Match Set functionality.
//
//
class MatchSet {

	private static final Logger logger = LogManager.getLogger(MatchSet.class);
	
    private  Game currentGame;
 
  
	private int[] score;
    private final String player1;
    private final String player2;
    
    private SetScore currentFinalScoreSet;
    
    private boolean tieBreakSet;
    private boolean matchWithTieGames;
    
	private ArrayList<GameScore> scorePlayedGames; 


	MatchSet(String player1, String player2, boolean iHaveATieSet) {
        this.player1 = player1;
        this.player2 = player2;
        this.score = new int[]{ 0, 0 };
        

        this.currentGame = new Game(this, player1, player2, iHaveATieSet);
        
        this.currentFinalScoreSet = null;
        this.tieBreakSet=false;
        this.scorePlayedGames = new ArrayList<GameScore>();

    }

	
    public void setCurrentFinalScoreSet(SetScore currentFinalScoreSet) {
		this.currentFinalScoreSet = currentFinalScoreSet;
	}

	public ArrayList<GameScore> getScorePlayedGames() {
    	return this.scorePlayedGames;
    }

    public void setScorePlayedGames(ArrayList<GameScore> scorePlayedGames) {
		this.scorePlayedGames = scorePlayedGames;
	}

    public SetScore getCurrentFinalScoreSet() {
		return currentFinalScoreSet;
	}

    void pointWonBy(String player, boolean iHaveATieSet) {
    	this.matchWithTieGames = iHaveATieSet;
        currentGame.pointWonBy(player, iHaveATieSet);
        
    }
    

    
    public Game getCurrentGame() {
  		return currentGame;
  	}

    String score() {
        String gameScore = currentGame.score();
        if (haveGameScore(gameScore)) {
            gameScore = ", " + gameScore;
        }
        else {

        	if (this.tieBreakSet) {
        		this.matchWithTieGames=true;
        	}
        	
        	this.currentGame =  new Game(this, player1, player2, this.matchWithTieGames);
        }

        return String.format("%s-%s%s", score[0], score[1], gameScore);
    }

    private boolean haveGameScore(String gameScore) {
        return !"".equals(gameScore);
        
    }

    public void notifyGameWon(String winningPlayer) {
        int playerIndex = player1.equals(winningPlayer) ? 0 : 1;
        score[playerIndex] += 1;
        
    	GameScore ss = new GameScore(this.player1, this.player2, score); 

        this.getScorePlayedGames().add(ss);
        
     }
    
    public boolean isSetFinished(boolean iHaveATieSet) {
    	boolean finished = false;
    	
    	ArrayList<GameScore> listScores = this.getScorePlayedGames();
    	
    	int sum1 = sumScorePlayer(this.player1, listScores);
    	int sum2 = sumScorePlayer(this.player2, listScores);
    	
    	int[] pointToSet = new int[]{ 0, 0 };
    	
    	if (iHaveATieSet) {

    		if (sum1 > 6) {
	    		finished = (Math.abs((sum1 - sum2)) > 0);
	
	    	}	
	        else if (sum2 > 6) {
	        		finished = (Math.abs((sum1 - sum2)) > 0);
	
	        }
    		
    		if (finished) {
    			int[] tieScore = this.currentGame.getTieSetScore();
    			sum1=tieScore[0];
    			sum2=tieScore[1];
    			
    			 finished = (Math.abs((sum1 - sum2)) > 0);
    			
    			//this.currentGame.setSetScore(new int[] {0,0});
    		}
    	}
    	else {
	    	if (sum1 == 6 && sum2 == 6) {
	    		// this set needs a tie break game
	    		this.setTieBreakSet(true);
	    		finished=false;
	    	}
	    	else if (sum1 >= 6) {
	    		finished = (Math.abs((sum1 - sum2)) > 1);
	
	    	}	
	        else if (sum2 >= 6) {
	        		finished = (Math.abs((sum1 - sum2)) > 1);
	
	        }
    	}
    	pointToSet[0]=sum1;
    	pointToSet[1]=sum2;
    	
    	if (finished) {
    		this.setScorePlayedGames(new ArrayList<GameScore>());
    		this.setTieBreakSet(false);
    		this.getCurrentGame().setTieGame(false); 
    		
    	}
    			

    	this.currentFinalScoreSet = new SetScore(this.player1,  this.player2, pointToSet); 
    	    	
    	return finished;
    	
    }
    
    private int sumScorePlayer(String playerName, ArrayList<GameScore> listScores) {
    	int totalPointsGame = 0;

		for (GameScore s:listScores) {    	
	    	if (playerName.equals(this.player1)) {
	    			totalPointsGame =+ s.getScore()[0];
	    	}
	    	
	    	if (playerName.equals(this.player2)) {
    			totalPointsGame =+ s.getScore()[1];
    	}
	    	
	    }
    
    	return totalPointsGame;
    }

	public boolean isTieBreakSet() {
		return tieBreakSet;
	}

	public void setTieBreakSet(boolean tieBreakSet) {
		this.tieBreakSet = tieBreakSet;
	}
    
}
