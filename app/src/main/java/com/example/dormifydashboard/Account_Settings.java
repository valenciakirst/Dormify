package com.example.dormifydashboard;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Account_Settings extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_settings);

        ImageView backbutton = findViewById(R.id.AccountSettingsBackBtn);
        backbutton.setOnClickListener(v -> onBackPressed());

        TextView userInfoBtn = findViewById(R.id.UserInfoSettings);
        userInfoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Toast.makeText(Account_Settings.this, "Under Maintenance", Toast.LENGTH_SHORT).show();
            }
        });

        TextView passBtn = findViewById(R.id.AccPasswordSettings);
        passBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Account_Settings.this, "Under Maintenance", Toast.LENGTH_SHORT).show();;
            }
        });
        TextView subsBtn = findViewById(R.id.SubscriptionSettings);
        subsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Account_Settings.this, "Under Maintenance", Toast.LENGTH_SHORT).show();;
            }
        });
    }
}