package com.sandra;

import java.util.Arrays;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



 
/**
 * Class provides a default state of a game, where scores go 0, 15, 30, 40.
 *  
 * @param player
 * @return
 */


class DefaultGame implements GameDelegate {
	
	private static final Logger logger = LogManager.getLogger(DefaultGame.class);

    private final List<String> scoreRepresentations = Arrays.asList("0", "15", "30", "40", "e");

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
    DefaultGame(Game game, String player1, String player2) {
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
        } else if (isDeuce()) {
            game.notifyGameDeuce();
        }
        
    }
    
    @Override
    public String score() {
        String player1Score = formatScore(player1Score());
        String player2Score = formatScore(player2Score());

        return String.format("%s-%s", player1Score, player2Score);
    }

    /**
     * A normal game is won when one of the two players scores game-winning point and when the difference
	 * between the score is 2
     * @return true/false
     */
    private boolean isGameWon() {
        return scoreDifference(2) && (score[0] == 4 || score[1] == 4);
    }

    /**
     * Computes the difference of score at the end of the game. It should be
     * equal to the parameter <code>difference</code>   
     * @param difference
     * @return
     */
    private boolean scoreDifference(int difference) {
        return Math.max(score[0], score[1]) - Math.min(score[0], score[1]) >= difference;
    }

    private String winningPlayer() {
        return score[0] > score[1] ? player1 : player2;
    }

    private boolean isDeuce() {
        return (score[0] == 3 && score[1] == 3);
    }
    

    private String formatScore(int score) {
        return scoreRepresentations.get(score);
    }

    private int playerIndexFor(String player) {
        return player1.equals(player) ? 0 : 1;
    }

    private int player1Score() {
        return playerScore(player1);
    }

    private int player2Score() {
        return playerScore(player2);
    }

    private int playerScore(String player) {
        int playerIndex = playerIndexFor(player);
        return score[playerIndex];
    }
}
