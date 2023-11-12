package com.example.dormifydashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Personal_info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_info);
        ImageView backbutton = findViewById(R.id.PersonalInfoBackBtn);
        backbutton.setOnClickListener(v -> onBackPressed());

        TextView nameBtn = findViewById(R.id.name);
        nameBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Personal_info.this, "Under Maintenance", Toast.LENGTH_SHORT).show();
            }
        });

        TextView userBtn = findViewById(R.id.username);
        userBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Personal_info.this, "Under Maintenance", Toast.LENGTH_SHORT).show();
            }
        });
        TextView bioBtn = findViewById(R.id.bio);
        bioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Personal_info.this, "Under Maintenance", Toast.LENGTH_SHORT).show();
            }
        });
    }
}