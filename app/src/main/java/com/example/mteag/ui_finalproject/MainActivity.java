package com.example.mteag.ui_finalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.TextView;
import android.view.*;

public class MainActivity extends AppCompatActivity {

    //deck with all cards
    private Deck deck = new Deck();

    private Player user = new Player();

    private Player cpu = new Player();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resetScreen();
        newGame();

        //DRAW BUTTON
        final Button draw = findViewById(R.id.button);
        draw.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //draw new card and update count value
                userDraw();
                updatePlayerCount();
                //if drew over 21, give CPU the win and start new game
                if (user.getCardCount() > 21) {
                    cpu.addScore();
                    resetScreen();
                    newGame();
                }
            }
        });

        //STAND BUTTON
        final Button stand = findViewById(R.id.button2);
        stand.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //loop until someone wins
                while (true) {
                    //if CPU is over 21, user wins
                    if (cpu.getCardCount() > 21) {
                        user.addScore();
                        resetScreen();
                        newGame();
                        break;
                        //if cpu is over your count but not over 21, they win
                    } else if (cpu.getCardCount() > user.getCardCount()) {
                        cpu.addScore();
                        resetScreen();
                        newGame();
                        break;
                    }
                    //if neither, draw until one is true
                    cpuDraw();
                    updateCpuCount();
                }
        }
        });
    }

    //draws card for user and updates visuals to show that card
    private Card userDraw() {
        Card drawnCard = deck.draw();
        if (user.getHandSize() == 0) {
            ImageView Me1 = findViewById(R.id.ME1);
            Me1.setImageResource(drawnCard.getImage());
        } else if (user.getHandSize() == 1) {
            ImageView Me2 = findViewById(R.id.ME2);
            Me2.setImageResource(drawnCard.getImage());
        } else if (user.getHandSize() == 2) {
            ImageView Me3 = findViewById(R.id.ME3);
            Me3.setImageResource(drawnCard.getImage());
        } else if (user.getHandSize() == 3) {
            ImageView Me4 = findViewById(R.id.ME4);
            Me4.setImageResource(drawnCard.getImage());
        } else if (user.getHandSize() == 4) {
            ImageView Me5 = findViewById(R.id.ME5);
            Me5.setImageResource(drawnCard.getImage());
        }
        user.addCard(drawnCard);
        return drawnCard;
    }

    //draws card for CPU and updates visuals to show that card
    private Card cpuDraw() {
        Card drawnCard = deck.draw();
        if (cpu.getHandSize() == 0) {
            ImageView Comp1 = findViewById(R.id.CPU1);
            Comp1.setImageResource(drawnCard.getImage());
        } else if (cpu.getHandSize() == 1) {
            ImageView Comp2 = findViewById(R.id.CPU2);
            Comp2.setImageResource(drawnCard.getImage());
        } else if (cpu.getHandSize() == 2) {
            ImageView Comp3 = findViewById(R.id.CPU3);
            Comp3.setImageResource(drawnCard.getImage());
        } else if (cpu.getHandSize() == 3) {
            ImageView Comp4 = findViewById(R.id.CPU4);
            Comp4.setImageResource(drawnCard.getImage());
        } else if (cpu.getHandSize() == 4) {
            ImageView Comp5 = findViewById(R.id.CPU5);
            Comp5.setImageResource(drawnCard.getImage());
        }
        cpu.addCard(drawnCard);
        return drawnCard;
    }

    //reset deck and Player hands after a game
    public void newGame() {
        deck.reset();
        user.resetHand();
        cpu.resetHand();
        userDraw();
        userDraw();
        cpuDraw();
        cpuDraw();
        updateCpuCount();
        updatePlayerCount();

    }

    //resets visuals for new game (count text and card pictures)
    public void resetScreen() {
        TextView playerCount = findViewById(R.id.playerCount);
        playerCount.setText("Count: 0");

        TextView cpuCount = findViewById(R.id.cpuCount);
        cpuCount.setText("Count: 0");

        TextView playerScore = findViewById(R.id.playerScore);
        String playerScoreText = "Your Score: " + user.getScore();
        playerScore.setText(playerScoreText);

        TextView cpuScore = findViewById(R.id.cpuScore);
        String cpuScoreText = "CPU Score: " + cpu.getScore();
        cpuScore.setText(cpuScoreText);

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
    }

    //updates text to show current card count for CPU
    public void updatePlayerCount() {
        TextView playerCount = findViewById(R.id.playerCount);

        String countText = "Count: " + user.getCardCount();
        if (user.getCardCount() > 21) {
            countText = "BUST";
        }
        playerCount.setText(countText);
    }

    //updates text to show current card count for CPU
    public void updateCpuCount() {
        TextView cpuCount = findViewById(R.id.cpuCount);

        String countText = "Count: " + user.getCardCount();
        if (cpu.getCardCount() > 21) {
            countText = "BUST";
        }
        cpuCount.setText(countText);
    }
}
