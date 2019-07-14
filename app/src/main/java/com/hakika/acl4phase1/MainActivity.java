package com.hakika.acl4phase1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button aboutAlcButton;
    private Button myProfileButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Get buttons references
        aboutAlcButton = findViewById(R.id.about_alc_btn);
        myProfileButton = findViewById(R.id.my_profile_btn);

        // Set on click listener event for aboutAlcButton button
        // Stats AboutALC activity
        aboutAlcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AboutAlcActivity.class));
            }
        });

        // Set on click listener event for myProfile button
        // Stats MyProfile Activity
        myProfileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MyProfileActivity.class));
            }
        });
    }
}
