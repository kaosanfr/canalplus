package com.sandra;

/**
 * 
 * Class represents the finished state of a game, essentially a No Operation.
 * 
 * @author cachitos
 *
 */
public class FinishedGame implements GameDelegate {
	private String player;
	

    public FinishedGame(String player) {
    	this.player=player;
	}

	@Override
    public void pointWonBy(String player) {
    	
    }

    @Override
    public String score() {
    	//logger.info(player + " wins");
        return "";
    }
}
