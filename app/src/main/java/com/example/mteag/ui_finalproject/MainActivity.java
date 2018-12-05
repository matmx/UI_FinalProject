package com.example.mteag.ui_finalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import java.util.ArrayList;
import android.widget.Button;
import android.widget.TextView;
import android.view.*;

public class MainActivity extends AppCompatActivity {

    //deck with all cards
    private Deck deck = new Deck();
    //ArrayList containing cards the player has drawn
    private ArrayList<Card> yourCards = new ArrayList<>();

    private int playerScore = 0;
    private int cpuScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView playerCount = (TextView) findViewById(R.id.playerCount);
        playerCount.setText("Count: 0");

        ImageView Comp1 = findViewById(R.id.CPU1);
        Comp1.setImageResource(R.drawable.ace_of_hearts);

        ImageView Comp2 = findViewById(R.id.CPU2);
        Comp2.setImageResource(R.drawable.ace_of_hearts);

        ImageView Comp3 = findViewById(R.id.CPU3);
        Comp3.setImageResource(R.drawable.ace_of_hearts);

        ImageView Comp4 = findViewById(R.id.CPU4);
        Comp4.setImageResource(R.drawable.ace_of_hearts);

        ImageView Comp5 = findViewById(R.id.CPU5);
        Comp5.setImageResource(R.drawable.ace_of_hearts);

        ImageView Me1 = findViewById(R.id.ME1);
        Me1.setImageResource(R.drawable.ace_of_hearts);

        ImageView Me2 = findViewById(R.id.ME2);
        Me2.setImageResource(R.drawable.ace_of_hearts);

        ImageView Me3 = findViewById(R.id.ME3);
        Me3.setImageResource(R.drawable.ace_of_hearts);

        ImageView Me4 = findViewById(R.id.ME4);
        Me4.setImageResource(R.drawable.ace_of_hearts);

        ImageView Me5 = findViewById(R.id.ME5);
        Me5.setImageResource(R.drawable.ace_of_hearts);

        final Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                draw();
                String countText = "Count: " + getPlayerCount();
                playerCount.setText(countText);
            }
        });
    }
    //draws a card, adds to players hand, updates card images
    public void draw() {
        Card drawnCard = deck.draw();
        if (yourCards.size() == 0) {
            ImageView Me1 = findViewById(R.id.ME1);
            Me1.setImageResource(drawnCard.getImage());
        } else if(yourCards.size() == 1) {
            ImageView Me2 = findViewById(R.id.ME2);
            Me2.setImageResource(drawnCard.getImage());
        } else if(yourCards.size() == 2) {
            ImageView Me3 = findViewById(R.id.ME3);
            Me3.setImageResource(drawnCard.getImage());
        } else if(yourCards.size() == 3) {
            ImageView Me4 = findViewById(R.id.ME4);
            Me4.setImageResource(drawnCard.getImage());
        } else if(yourCards.size() == 4) {
            ImageView Me5 = findViewById(R.id.ME5);
            Me5.setImageResource(drawnCard.getImage());
        }
        yourCards.add(drawnCard);
    }

    //gets score for player's hand
    public int getPlayerCount() {
        int count = 0;
        int aces = 0;
        for (int i = 0; i < yourCards.size(); i++) {
            count += yourCards.get(i).getValue();
            if (yourCards.get(i).getValue() == 1) {
                aces++;
            }
        }
        //changes ace from 1 to 11 if it wont cause you to bust.
        if (count <= 11 && aces > 0) {
            count += 10;
        }
        return count;
    }
}
