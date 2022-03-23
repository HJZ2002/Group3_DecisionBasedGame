package com.example.group_decisionbasedgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Choices extends AppCompatActivity {
private Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choices);
        getSupportActionBar().hide();

        ProgressBar progressBar =findViewById(R.id.loading);
        TextView textView =findViewById(R.id.press);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Please wait");
                progressBar.setVisibility(View.VISIBLE);

                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        textView.setText("Loading Complete");
                        progressBar.setVisibility(View.INVISIBLE);
                        textView.setTextColor(Color.parseColor("#FF03DAC5"));
                        finish();
                        startActivity(new Intent(getApplicationContext(),MainStory.class));

                    }
                },3000);
            }
        });
    }
}