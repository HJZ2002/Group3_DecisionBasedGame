package com.group3_decisionbasedgame.group3_decisionbasedgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

public class MainStory extends AppCompatActivity implements View.OnClickListener {

    TextView text;
    Button btn1,btn2,btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_story);

        btn1 = findViewById(R.id.Choice1);
        btn2 = findViewById(R.id.Choice2);
        btn3 = findViewById(R.id.Choice3);
        btn4 = findViewById(R.id.Choice4);
        text = findViewById(R.id.choices);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);

    }
    @Override
    public void onClick(View v){

        int decision=0;

        String choice;

        switch (v.getId()){

            case R.id.Choice1:
                decision = 1;

                if(decision==1){
                }

                Intent i1 = new Intent(this,ChoiceA.class);
                startActivity(i1);
                break;
            case R.id.Choice2:
                decision = 2;

                if(decision==2){
                }

                Intent i2 = new Intent(this,ChoiceB.class);
                startActivity(i2);
                break;
            case R.id.Choice3:
                decision = 3;

                if(decision==3){
                }

                Intent i3 = new Intent(this,ChoiceC.class);
                startActivity(i3);
                break;
            case R.id.Choice4:
                decision = 4;

                if(decision==4){
                }

                Intent i4 = new Intent(this,ChoiceD.class);
                startActivity(i4);
                break;
        }
    }

}