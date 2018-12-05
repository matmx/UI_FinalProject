package com.example.mteag.ui_finalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import java.util.ArrayList;
import android.widget.Button;
import android.view.*;

public class MainActivity extends AppCompatActivity {

    private Deck deck = new Deck();
    private ArrayList<Card> yourCards = new ArrayList<Card>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
            }
        });
    }

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
    //test commit
}
