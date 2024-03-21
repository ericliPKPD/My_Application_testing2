package com.example.myapplication_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class setting_activity extends AppCompatActivity {

    Switch night_switch;
    Button back_btn;
    Button info_btn;
    Switch notification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_activity);

        // initialize variable
        back_btn = (Button) findViewById(R.id.cancel_button); // backward button
        info_btn = (Button) findViewById(R.id.info_button); // information page button
        night_switch = findViewById(R.id.night_mode_switch); // night mode switch
        notification = (Switch) findViewById(R.id.notification_main_column); // notification switch

        // Button for back to main page
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // jump from setting page to home page
                Intent settings = new Intent(setting_activity.this, activity_main.class);
                startActivity(settings);
            }
        });

        // Button for information page
        info_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // jump from setting page to home page
                Intent settings = new Intent(setting_activity.this, information.class);
                startActivity(settings);
            }
        });

        // Night Switch
        night_switch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                if (night_switch.isChecked()) {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                } else {
                  AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                }
            }
        });

        // Notification on
        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                String notification_on;
                if (notification.isChecked()){
                    notification_on = notification.getTextOn().toString();
                }
                else{
                    notification_on = notification.getTextOff().toString();
                }
                Toast.makeText(getApplicationContext(), "Notification :" + notification_on, Toast.LENGTH_LONG).show();
            }
        }
        );
    }
}

