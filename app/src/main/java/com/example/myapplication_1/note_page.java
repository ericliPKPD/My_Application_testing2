package com.example.myapplication_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public abstract class note_page extends AppCompatActivity implements SelectListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_page);
    }
}
