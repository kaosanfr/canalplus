package com.sandra;

import java.util.Arrays;
import java.util.List;

// Class provides a default state of a Ticked Break game, where scores go "0", "1", "2", "3", "4", "5", "6", "7".
//
//
class TieBreakGame implements GameDelegate {

    private final List<String> scoreRepresentations = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7");

    private final Game game;
    private final String player1;
    private final String player2;
    private  int[] score;


	TieBreakGame(Game game, String player1, String player2) {
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
            game.setSetScore(this.score);
            game.notifyGameOver(winningPlayer, true);
        } 
    }

    @Override
    public String score() {
        String player1Score = formatScore(player1Score());
        String player2Score = formatScore(player2Score());
        //logger.info("Current game status: " + String.format("%s-%s", player1Score, player2Score));
        return String.format("%s-%s", player1Score, player2Score);
    }

    private boolean isGameWon() {
        return scoreDifference(2) && (score[0] == 7 || score[1] == 7);
    }

    private boolean scoreDifference(int difference) {
        return Math.max(score[0], score[1]) - Math.min(score[0], score[1]) >= difference;
    }

    private String winningPlayer() {
        return score[0] > score[1] ? player1 : player2;
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
    
    public int[] getScore() {
		return score;
	}

	public void setScore(int[] score) {
		this.score = score;
	}

}
