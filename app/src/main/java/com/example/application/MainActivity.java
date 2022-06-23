package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "Hello", Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), "kumar", Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), "kumar", Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), "kumar", Toast.LENGTH_SHORT).show();
    }
}