package com.group3_decisionbasedgame.group3_decisionbasedgame;

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
        nxtbtn1.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.nextbtn1:
                Intent i1 = new Intent(this, Ending1.class);
                startActivity(i1);
                break;
        }
    }
}
