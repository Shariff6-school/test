package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button entry = (Button) findViewById(R.id.entry);
        entry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNewEntry();
            }
        });
        //settings
        Button settings = (Button) findViewById(R.id.settings);
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSettings();
            }
        });
        //back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void openNewEntry(){
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
    public void openSettings(){
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }
}