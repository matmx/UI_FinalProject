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

    private Player user = new Player();

    private Player cpu = new Player();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView playerCount = findViewById(R.id.playerCount);
        playerCount.setText("Count: 0");

        ImageView Comp1 = findViewById(R.id.CPU1);
        Comp1.setImageResource(R.drawable.cardback);

        ImageView Comp2 = findViewById(R.id.CPU2);
        Comp2.setImageResource(R.drawable.cardback);

        ImageView Comp3 = findViewById(R.id.CPU3);
        Comp3.setImageResource(R.drawable.cardback);

        ImageView Comp4 = findViewById(R.id.CPU4);
        Comp4.setImageResource(R.drawable.cardback);

        ImageView Comp5 = findViewById(R.id.CPU5);
        Comp5.setImageResource(R.drawable.cardback);

        ImageView Me1 = findViewById(R.id.ME1);
        Me1.setImageResource(R.drawable.cardback);

        ImageView Me2 = findViewById(R.id.ME2);
        Me2.setImageResource(R.drawable.cardback);

        ImageView Me3 = findViewById(R.id.ME3);
        Me3.setImageResource(R.drawable.cardback);

        ImageView Me4 = findViewById(R.id.ME4);
        Me4.setImageResource(R.drawable.cardback);

        ImageView Me5 = findViewById(R.id.ME5);
        Me5.setImageResource(R.drawable.cardback);

        final Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Card drawnCard = deck.draw();
                if (user.getHandSize() == 0) {
                    ImageView Me1 = findViewById(R.id.ME1);
                    Me1.setImageResource(drawnCard.getImage());
                } else if(user.getHandSize() == 1) {
                    ImageView Me2 = findViewById(R.id.ME2);
                    Me2.setImageResource(drawnCard.getImage());
                } else if(user.getHandSize() == 2) {
                    ImageView Me3 = findViewById(R.id.ME3);
                    Me3.setImageResource(drawnCard.getImage());
                } else if(user.getHandSize() == 3) {
                    ImageView Me4 = findViewById(R.id.ME4);
                    Me4.setImageResource(drawnCard.getImage());
                } else if(user.getHandSize() == 4) {
                    ImageView Me5 = findViewById(R.id.ME5);
                    Me5.setImageResource(drawnCard.getImage());
                }
                user.addCard(drawnCard);
                String countText = "Count: " + user.getCardCount();
                if (user.getCardCount() > 21) {
                    countText = "BUST";
                }
                playerCount.setText(countText);
            }
        });
    }
}
