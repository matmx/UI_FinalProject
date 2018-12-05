package com.example.mteag.ui_finalproject;

public class Player {
    private int score;
    private int cardCount;
    Player(final Player other) {
        this.score = other.score;
        this.cardCount = other.cardCount;
    }
    Player() {
        this.score = 0;
        this.cardCount = 0;
    }
    //function to get score
    public int getScore() {
        return this.score;
    }
    //function to increase winner's score
    public void addScore() {
        this.score++;
    }
    //function to call when game is over so card count resets
    public void resetCardCount() {
        this.cardCount = 0;
    }
    //function to add card value to card count
    public void addCardCount(final int setAdd) {
        this.cardCount += setAdd;
    }
    //function to get card count
    public int getCardCount() {
        return this.cardCount;
    }
}
