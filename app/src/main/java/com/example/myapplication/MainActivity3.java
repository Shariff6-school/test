package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    EditText text;
    Button button;
    SharedPreferences sp;
    String textStr;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        text = findViewById(R.id._text);
        t1 = findViewById(R.id.test);
        button = findViewById(R.id.saveButton);
        sp = getSharedPreferences("prefs", Context.MODE_PRIVATE);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textStr = text.getText().toString();

                SharedPreferences.Editor editor = sp.edit();
                editor.putString("text", textStr);
                editor.commit();
                Toast.makeText(MainActivity3.this, "Information Saved.", Toast.LENGTH_LONG).show();
                String text = sp.getString("text", "");
                t1.setText(text);


            }
        });
        //back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ////
        SharedPreferences sp = getApplicationContext().getSharedPreferences("prefs", Context.MODE_PRIVATE);
        String text = sp.getString("text", "");
        t1.setText(text);
        //Ts


    }
}