package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView t1, t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    t1 =findViewById(R.id.t3);

    t2 =findViewById(R.id.t4);

    SharedPreferences sp = getApplicationContext().getSharedPreferences("MyUserPrefs",Context.MODE_PRIVATE);
    String name = sp.getString("name","");
    String email = sp.getString("email","");
t1.setText(name);
t2.setText(email);
}}