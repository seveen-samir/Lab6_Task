package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText name, email;
    Button button, button1;
    SharedPreferences sp;
    String nameStr, emailStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.ET1);
        email = findViewById(R.id.ET2);
        button = findViewById(R.id.B1);
        button1 = findViewById(R.id.B2);

        sp = getSharedPreferences("MyUserPrefs", Context.MODE_PRIVATE);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nameStr = name.getText().toString();
                emailStr = email.getText().toString();

                SharedPreferences.Editor editor = sp.edit();
                editor.putString("name", nameStr);
                editor.putString("email", emailStr);
                editor.apply();

                Toast.makeText(MainActivity.this, "Information Saved", Toast.LENGTH_SHORT).show();
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(i);
            }



        });
    }
}
