package com.example.mteag.ui_finalproject;
import java.util.ArrayList;

public class Game {
    private int score;
    private ArrayList<Card> yourCards;
    private Deck deck;
    public Game() {
        score = 0;
        yourCards = new ArrayList<>();
        deck = new Deck();
    }
    public void draw() {
        Card drawnCard = deck.draw();
        if (yourCards.size() == 1) {


        }
    }


}
