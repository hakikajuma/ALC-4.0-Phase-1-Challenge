package com.hakika.acl4phase1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MyProfileActivity extends AppCompatActivity {
    private final String TRACK = "Android";
    private final String NAME = "Juma Hakika";
    private final String COUNTRY = "Tanzania";
    private final String EMAIL = "hakikajuma@gmail.com";
    private final String PHONE_NUMBER = "+255 654958040";
    private final String SLACK_USERNAME = "Juma Hakika";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("My Profile");

        TextView textTrack = findViewById(R.id.text_track);
        TextView textName = findViewById(R.id.text_name);
        TextView textCountry = findViewById(R.id.text_country);
        TextView textEmail = findViewById(R.id.text_email);
        TextView textPhoneNumber = findViewById(R.id.text_phone_number);
        TextView textSlackUsername = findViewById(R.id.text_username);

        textName.setText(NAME);
        textTrack.setText(TRACK);
        textCountry.setText(COUNTRY);
        textEmail.setText(EMAIL);
        textPhoneNumber.setText(PHONE_NUMBER);
        textSlackUsername.setText(SLACK_USERNAME);
    }
}
