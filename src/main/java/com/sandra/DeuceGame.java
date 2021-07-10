package com.sandra;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Class provides a deuce/advantage state of a game. 
 * @author cachitos
 *
 */
class DeuceGame implements GameDelegate {

	private static final Logger logger = LogManager.getLogger(DeuceGame.class);
	
    private final Game game;
    private final String player1;
    private final String player2;
    private final int[] score;

    /**
     * Constructor
     * @param game
     * @param player1
     * @param player2
     */
    DeuceGame(Game game, String player1, String player2) {
        this.game = game;
        this.player1 = player1;
        this.player2 = player2;
        this.score = new int[]{ 0, 0 };
    }

    @Override
    public void pointWonBy(String player) {
        int playerIndex = playerIndexFor(player);
        score[playerIndex] += 1;
        if (isGameWon()) {
            String winningPlayer = winningPlayer();
            game.notifyGameOver(winningPlayer, false);
        }
    }

    @Override
    public String score() {
        if (isDeuce()) {
            return "Deuce";
        }
        //logger.info("Current game status: " + String.format("Advantage %s", advantagedPlayer()));
        return String.format("Advantage %s", advantagedPlayer());
    }

    private boolean isGameWon() {
        return scoreDifference(2);
    }

    private boolean scoreDifference(int difference) {
        return Math.max(score[0], score[1]) - Math.min(score[0], score[1]) >= difference;
    }

    private String winningPlayer() {
        return score[0] > score[1] ? player1 : player2;
    }

    private String advantagedPlayer() {
        return score[0] > score[1] ? player1 : player2;
    }

    private boolean isDeuce() {
        return score[0] == score[1];
    }

    private int playerIndexFor(String player) {
        return player1.equals(player) ? 0 : 1;
    }
}
