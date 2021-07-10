package com.sandra;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// Class provides public interface to Domain model.
//
public class Match {
	private static final Logger logger = LogManager.getLogger(Match.class);	

    private  MatchSet matchSet;
    private final String player1;
    private final String player2;    

    
    private ArrayList<SetScore> scorePlayedSets = new ArrayList<SetScore>();    
    
    private GenericScore finalMatchScore = null;
    
    private boolean iHaveATieSet;
    
    


	public Match(String player1, String player2) {
    	this.player1=player1;
    	this.player2=player2;
        matchSet = new MatchSet(player1, player2, this.iHaveATieSet);
    }
    
    public void pointWonBy(String player) {
        matchSet.pointWonBy(player, iHaveATieSet);
    }

    public String score() {
//    	logger.info(matchSet.score());    	
    	
    	boolean setFinalized = this.matchSet.isSetFinished(iHaveATieSet);    	
    	
    	logger.info("Player 1:" + this.player1);
    	logger.info("Player 2:" + this.player2);

    	SetScore finalScoreSet = this.matchSet.getCurrentFinalScoreSet();
    	

		if (this.matchSet.isTieBreakSet()) {
			this.iHaveATieSet = true;	
			setFinalized=false;

		}
    	
    	if (setFinalized) {
    		
    		
				scorePlayedSets.add(finalScoreSet);

    		
      	}
      	
    	
    	StringBuffer myScores = new StringBuffer("Score:");
    	if ( finalScoreSet == null) {
        	myScores.append("(0-0)");
    	}
    	else {
    		for (SetScore s:scorePlayedSets) {
    			
    			myScores.append("("  + s.getScore()[0] + "-" + s.getScore()[1] + ") ");
    	    }

    		// current set results
    		if (!setFinalized) {
    			myScores.append("("  + finalScoreSet.getScore()[0] + "-" + finalScoreSet.getScore()[1] + ") ");
    		}
    		else {
    			this.iHaveATieSet = false;
    			this.matchSet=new MatchSet(player1, player2, this.iHaveATieSet);
    		}
    	}
    	logger.info(myScores);

    	boolean matchFinished = isMatchFinished();
    	if (matchFinished) {
//        	logger.info("\n");
    		logger.info("Match Status:" + (finalScoreSet.getScore()[0] == 6 ? "Player 1 wins" : "Player 2 wins"));
    	}
    	else {
    		
    		if (this.iHaveATieSet) {
    	        logger.info("Current game status: " + (this.matchSet.getCurrentGame().score().isEmpty() ? "Need a TieGame" : this.matchSet.getCurrentGame().score()));    			
    		}
    		else {
    	        logger.info("Current game status: " + (this.matchSet.getCurrentGame().score().isEmpty() ? "Won" : this.matchSet.getCurrentGame().score()));    			
    		}


    		logger.info("Match Status: in progress");
    	}
    	
    	logger.info("\n");
    	
    	
    	if (matchFinished) {
    		return "";
    	}
    	
        return matchSet.score();
    }
    
    public boolean isMatchFinished() {
    	boolean finished = false;
    	
    	ArrayList<SetScore> listScores = this.scorePlayedSets;
    	
    	int[] pointToSet = new int[]{ 0, 0 };
    	
    	int nombreWin1=0;
    	int nombreWin2=0;
    	for(SetScore setScore:listScores) {
    		
    		if (setScore.getScore()[0] > setScore.getScore()[1]) {
    			nombreWin1 += 1;
    		}
    		else {
    			nombreWin2 += 1;    			
    		}
    	}    
    	
    	if (nombreWin1 > 2) {
    		pointToSet[0]=1;
    		finished=true;
    	}
    	
    	if (nombreWin2 > 2) {
    		finished=true;
    		pointToSet[1]=1;
    	}
    			
    	if (finished) {
    		this.finalMatchScore = new GenericScore(this.player1,  this.player2, pointToSet); 
    	}
    	
    	
    	return finished;
    	
    }
    
    private int sumScorePlayer(String playerName, ArrayList<SetScore> listScores) {
    	int totalPointsGame = 0;

		for (SetScore s:listScores) {    	
	    	if (playerName.equals(this.player1)) {
	    			totalPointsGame =+ s.getScore()[0];
	    		}
	    }
    
    	return totalPointsGame;
    }
    
    public GenericScore getFinalMatchScore() {
		return finalMatchScore;
	}

    
}
