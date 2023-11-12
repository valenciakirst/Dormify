package com.example.dormifydashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class Chat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        ImageView backbutton = findViewById(R.id.imageView4);
        backbutton.setOnClickListener(v -> onBackPressed());
    }
}