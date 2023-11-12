package com.example.dormifydashboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Profile extends AppCompatActivity implements View.OnClickListener {

    public Button buttonBookmark, buttonAccount, buttonInfo, buttonNotif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ImageView backbutton = findViewById(R.id.profileBackBtn);
        backbutton.setOnClickListener(v -> onBackPressed());

       buttonBookmark = (Button) findViewById(R.id.ProfileBookmarksBtn);
       buttonAccount = (Button) findViewById(R.id.AccountSettingsBtn);
       buttonInfo = (Button) findViewById(R.id.ProfilePersonalInfoBtn);
       buttonNotif = (Button) findViewById(R.id.ProfileNotifBtn);

        buttonBookmark.setOnClickListener(this);
        buttonAccount.setOnClickListener(this);
        buttonInfo.setOnClickListener(this);
        buttonNotif.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i = null;

        if (v.getId() == R.id.ProfileBookmarksBtn) {
            i = new Intent(this, Bookmarks.class);
        } else if (v.getId() == R.id.AccountSettingsBtn) {
            i = new Intent(this, Account_Settings.class);
        }else if (v.getId() == R.id.ProfilePersonalInfoBtn) {
            i = new Intent(this, Personal_info.class);
        }else if (v.getId() == R.id.ProfileNotifBtn) {
            i = new Intent(this, Notifications_profile.class);
        }

        if (i != null) {
            startActivity(i);
        }

    }
}