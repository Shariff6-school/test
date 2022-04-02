package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String passwordInput;

    EditText insertPassword;

    String currentPassword = "123";
    Button enter;
    int counter = 3;
//password for homepage
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        insertPassword = (EditText) findViewById(R.id.draft);
        enter = (Button) findViewById(R.id.enter);
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                passwordInput = insertPassword.getText().toString();
                if(passwordInput.equals(currentPassword)) {
                    openMainScreen();
                }else{
                    Toast.makeText(getApplicationContext(), "Incorrect", Toast.LENGTH_SHORT).show();
                    counter--;
                    if(counter == 0){
                        enter.setEnabled(false);
                        Toast.makeText(getApplicationContext(), "Exit App", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }//sdaf
    public void openMainScreen(){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

}
