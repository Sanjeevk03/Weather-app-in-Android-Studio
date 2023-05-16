package com.example.weatherapptutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;

public class UserNewScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_new_screen);
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        boolean isFirstTime = preferences.getBoolean("is_first_time", true);

        if (isFirstTime) {
            // If it's the first time, set the flag to false
            SharedPreferences.Editor editor = preferences.edit();
            editor.putBoolean("is_first_time", false);
            editor.apply();

            // Show the activity_user_new_screen.xml layout
            setContentView(R.layout.activity_user_new_screen);

            // Add a button click listener to navigate to MainActivity
            Button nextButton = findViewById(R.id.button);
            nextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(UserNewScreen.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            });
        } else {
            // If it's not the first time, directly navigate to MainActivity
            Intent intent = new Intent(UserNewScreen.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
    }
}

