package com.example.group_decisionbasedgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ChoiceA extends AppCompatActivity implements View.OnClickListener{
    TextView text;
    Button nxtbtn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
        nxtbtn1 = findViewById(R.id.nextbtn1);
        text = findViewById(R.id.ChoiceAOutcome);

        String setting =
                "\nPrince Cyneric chose to further hone his abilities under the tutelage of his father whom he trusted the most as it's his father was the one who saved him from when the house was on fire and the one who he believe wants to save his mother the most. Since the King knows him best, he’ll be able to teach him what to do right and wrong during his training sessions. " +
                        "The week of harsh and strict training passed by and Prince Cyneric felt that his more confident and capable of holding his sword in a steady grip. His father the King gave him one final test, to explore the deepest part of the Labyrist headquarter dungeons and defeat the monster guarding their armory that held their best arms and armor that can be used in battling against enemies in the castle dungeons\n";

        nxtbtn1.setOnClickListener(this);
        text.setText(setting);

    }

    @Override
    public void onClick(View view) {
        int decision = 0;

        switch (view.getId()) {

            case R.id.nextbtn1:
                Intent i1 = new Intent(this, ChoiceAOutcome.class);
                startActivity(i1);
                break;
        }
    }
}
