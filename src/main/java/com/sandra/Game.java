package com.sandra;


/**
 *
 *  Class provides a proxy to a GameDelegate instance that
 * handles the rules for a particular state of the Game.
 *	
 * GameDelegates call back on this proxy to notify it of
 * game state changes which in turn change the GameDelegate.
 * For example, see notifyGameDeuce()
 * @author cachitos
 *
 */
class Game {

    private final MatchSet matchSet;
    private final String player1;
    private final String player2;
    
    private boolean tieGame;
    
    private int[] tieSetScore;

	private GameDelegate delegate;

	/**
	 * Constructor
	 * @param matchSet
	 * @param player1
	 * @param player2
	 * @param iHaveATieSet
	 */
    Game(MatchSet matchSet, String player1, String player2, boolean iHaveATieSet) {
        this.player1 = player1;
        this.player2 = player2;
        this.matchSet = matchSet;
        
        if (!iHaveATieSet) {
        	delegate = new DefaultGame(this, player1, player2);
        }
        else {
        	this.tieGame=iHaveATieSet;
        	
        	delegate = new TieBreakGame(this, player1, player2);
        }
    }

    public boolean isTieGame() {
		return tieGame;
	}

	public void setTieGame(boolean tieGame) {
		this.tieGame = tieGame;
	}

    public void pointWonBy(String player, boolean iHaveATieSet) {
    	
        delegate.pointWonBy(player);
    }

    public String score() {
        return delegate.score();
    }

    public void notifyGameOver(String winningPlayer, boolean tieGame) {
        matchSet.notifyGameWon(winningPlayer);
        if (!tieGame) {
        	delegate = new FinishedGame(winningPlayer);
        }
        else {
        	delegate = new DefaultGame(this, player1, player2);
        }
    }

    public void notifyGameDeuce() {
        delegate = new DeuceGame(this, player1, player2);
    }
    
    public void setSetScore(int[] finalScoreSet) {
    	this.tieSetScore=finalScoreSet;
    }
    
	public int[] getTieSetScore() {
		return tieSetScore;
	}

    
}
