package com.example.mteag.ui_finalproject;

public class Player {
    private int score;
    private int cardCount;
    Player(final Player other) {
        score = other.score;
        cardCount = other.cardCount;
    }
    Player() {
        score = 0;
        cardCount = 0;
    }

    public int getScore() {
        return score;
    }
    public void addScore() {
        score++;
    }
    public void resetCardCount() {
        cardCount = 0;
    }
    public void addCardCount(final int setAdd) {
        cardCount += setAdd;
    }
    public int getCardCount() {
        return cardCount;
    }
}
