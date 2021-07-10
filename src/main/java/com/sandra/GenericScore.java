package com.sandra;

// This class represents the informations necessary for a Set or Game

public class GenericScore {
    private  String player1;
    private  String player2;
    private  int[] score; 
    
    
    GenericScore(String player1, String player2, int[] score) {
        this.player1 = player1;
        this.player2 = player2;
        this.score = score;
    }


	public String getPlayer1() {
		return player1;
	}


	public void setPlayer1(String player1) {
		this.player1 = player1;
	}


	public String getPlayer2() {
		return player2;
	}


	public void setPlayer2(String player2) {
		this.player2 = player2;
	}


	public int[] getScore() {
		return score;
	}


	public void setScore(int[] score) {
		this.score = score;
	}


}
