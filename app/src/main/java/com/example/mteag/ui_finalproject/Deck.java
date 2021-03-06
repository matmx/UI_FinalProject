package com.example.mteag.ui_finalproject;
import java.util.ArrayList;

public class Deck {
    //all cards not drawn yet
    private ArrayList<Card> deck;
    //all cards drawn
    private ArrayList<Card> drawnCards;
    //fills deck with default 52 cards
    protected Deck() {
        deck = new ArrayList<>();
        drawnCards = new ArrayList<>();
        deck.add(new Card(R.drawable.ace_of_clubs, 1));
        deck.add(new Card(R.drawable.ace_of_diamonds, 1));
        deck.add(new Card(R.drawable.ace_of_hearts, 1));
        deck.add(new Card(R.drawable.ace_of_spades, 1));
        deck.add(new Card(R.drawable.two_clubs, 2));
        deck.add(new Card(R.drawable.two_diamonds, 2));
        deck.add(new Card(R.drawable.two_hearts, 2));
        deck.add(new Card(R.drawable.two_spades, 2));
        deck.add(new Card(R.drawable.three_clubs, 3));
        deck.add(new Card(R.drawable.three_diamonds, 3));
        deck.add(new Card(R.drawable.three_hearts, 3));
        deck.add(new Card(R.drawable.three_spades, 3));
        deck.add(new Card(R.drawable.four_clubs, 4));
        deck.add(new Card(R.drawable.four_diamonds, 4));
        deck.add(new Card(R.drawable.four_hearts, 4));
        deck.add(new Card(R.drawable.four_spades, 4));
        deck.add(new Card(R.drawable.five_clubs, 5));
        deck.add(new Card(R.drawable.five_diamonds, 5));
        deck.add(new Card(R.drawable.five_hearts, 5));
        deck.add(new Card(R.drawable.five_spades, 5));
        deck.add(new Card(R.drawable.six_clubs, 6));
        deck.add(new Card(R.drawable.six_diamonds, 6));
        deck.add(new Card(R.drawable.six_hearts, 6));
        deck.add(new Card(R.drawable.six_spades, 6));
        deck.add(new Card(R.drawable.seven_clubs, 7));
        deck.add(new Card(R.drawable.seven_diamonds, 7));
        deck.add(new Card(R.drawable.seven_hearts, 7));
        deck.add(new Card(R.drawable.seven_spades, 7));
        deck.add(new Card(R.drawable.eight_clubs, 8));
        deck.add(new Card(R.drawable.eight_diamonds, 8));
        deck.add(new Card(R.drawable.eight_hearts, 8));
        deck.add(new Card(R.drawable.eight_spades, 8));
        deck.add(new Card(R.drawable.nine_clubs, 9));
        deck.add(new Card(R.drawable.nine_diamonds, 9));
        deck.add(new Card(R.drawable.nine_hearts, 9));
        deck.add(new Card(R.drawable.nine_spades, 9));
        deck.add(new Card(R.drawable.ten_clubs, 10));
        deck.add(new Card(R.drawable.ten_diamonds, 10));
        deck.add(new Card(R.drawable.ten_hearts, 10));
        deck.add(new Card(R.drawable.ten_spades, 10));
        deck.add(new Card(R.drawable.jack_of_clubs2, 10));
        deck.add(new Card(R.drawable.jack_of_diamonds2, 10));
        deck.add(new Card(R.drawable.jack_of_hearts2, 10));
        deck.add(new Card(R.drawable.jack_of_spades2, 10));
        deck.add(new Card(R.drawable.queen_of_clubs2, 10));
        deck.add(new Card(R.drawable.queen_of_diamonds2, 10));
        deck.add(new Card(R.drawable.queen_of_hearts2, 10));
        deck.add(new Card(R.drawable.queen_of_spades2, 10));
        deck.add(new Card(R.drawable.king_of_clubs2, 10));
        deck.add(new Card(R.drawable.king_of_diamonds2, 10));
        deck.add(new Card(R.drawable.king_of_hearts2, 10));
        deck.add(new Card(R.drawable.king_of_spades2, 10));
    }
    //picks random card, removes from deck list, adds to drawnCards arraylist, returns card.
    protected Card draw() {
        int index = (int) (Math.random() * deck.size());
        Card drawnCard = deck.get(index);
        deck.remove(index);
        drawnCards.add(drawnCard);
        return drawnCard;
    }
    //resets deck to 52 cards, adding back cards that have been drawn.
    protected void reset() {
        while (drawnCards.size() != 0) {
            deck.add(drawnCards.get(0));
            drawnCards.remove(0);
        }
    }
}
