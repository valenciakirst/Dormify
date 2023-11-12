package com.example.dormifydashboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public CardView card1, card2, card3, card4, card5, card6;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        card1 = (CardView) findViewById(R.id.home);
        card2 = (CardView) findViewById(R.id.Profile);
        card3 = (CardView) findViewById(R.id.Search);
        card4 = (CardView) findViewById(R.id.Settings);
//        card5 = (CardView) findViewById(R.id.Chat);
//        card6 = (CardView) findViewById(R.id.Help);


        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
//        card5.setOnClickListener(this);
//        card6.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i = null;

        if (v.getId() == R.id.home) {
            i = new Intent(this, home.class);
        } else if (v.getId() == R.id.Profile) {
            i = new Intent(this, Profile.class);
        }else if (v.getId() == R.id.Search) {
            i = new Intent(this, Chat.class);
        }else if (v.getId() == R.id.Settings) {
            i = new Intent(this, Settings.class);
        }

        if (i != null) {
            startActivity(i);
        }


    }
}