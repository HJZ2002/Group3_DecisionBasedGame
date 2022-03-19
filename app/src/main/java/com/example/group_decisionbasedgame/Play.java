package com.example.group_decisionbasedgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Play extends AppCompatActivity {
    EditText username;
    Button button;

    String Name ="admin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        username =findViewById(R.id.Info);
        button =findViewById(R.id.Enter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(username.getText().toString())){
                    Toast.makeText(Play.this,"Empty data Provided",Toast.LENGTH_LONG).show();
                }else if (username.getText().toString().equals(Name)){
                    if (username.getText().toString().equals(Name));
                    Toast.makeText(Play.this,"Sucessfully login",Toast.LENGTH_LONG);

                }else{
                    Toast.makeText(Play.this,"Invalid Username",Toast.LENGTH_LONG);
                }
                Intent intent =new Intent(Play.this,Choices.class);
                startActivity(intent);
            }
        });

    }
}