package com.example.mteag.ui_finalproject;
import java.util.ArrayList;

public class Player {
    private int score;
    private ArrayList<Card> hand;
    Player(final Player other) {
        this.score = other.score;
        this.hand = new ArrayList<>(other.hand);
    }
    Player() {
        this.score = 0;
        this.hand = new ArrayList<>();
    }
    //function to get score
    public int getScore() {
        return this.score;
    }
    //function to increase winner's score
    public void addScore() {
        this.score++;
    }
    //function to add card value to card count
    protected int getHandSize() {
        return hand.size();
    }
    //add card to hand
    protected void addCard(Card newCard) {
        hand.add(newCard);
    }
    //get card count (card values added up)
    protected int getCardCount() {
        int count = 0;
        int aces = 0;
        for (int i = 0; i < hand.size(); i++) {
            count += hand.get(i).getValue();
            if (hand.get(i).getValue() == 1) {
                aces++;
            }
        }
        //changes ace from 1 to 11 if it wont cause you to bust.
        if (count <= 11 && aces > 0) {
            count += 10;
        }
        return count;
    }
    //used to reset hand
    protected void resetHand() {
        while (hand.size() != 0) {
            hand.remove(0);
        }
    }
}
