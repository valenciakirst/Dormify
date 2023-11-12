package com.example.dormifydashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class Bookmarks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookmarks);
        ImageView backbtn = findViewById(R.id.BookmarksBackBtn);
        backbtn.setOnClickListener(v -> onBackPressed());
    }
}