package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.example.application.Modal.RecyclerViewActivity;

import com.example.application.Modal.RecyclerViewActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreate MainActivity", Toast.LENGTH_SHORT).show();
        Button button=findViewById(R.id.send);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(), RecyclerViewActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        Toast.makeText(this, "onStart MainActivity", Toast.LENGTH_SHORT).show();
        super.onStart();
    }


    @Override
    protected void onResume() {
        Toast.makeText(this, "onResume MainActivity", Toast.LENGTH_SHORT).show();
        super.onResume();



    }


    @Override
    protected void onPause() {

        Toast.makeText(this, "onPause MainActivity", Toast.LENGTH_SHORT).show();
        super.onPause();
    }

    @Override
    protected void onStop() {

        Toast.makeText(this, "onStop MainActivity", Toast.LENGTH_SHORT).show();
        super.onStop();
    }


    @Override
    protected void onRestart() {

        Toast.makeText(this, "onRestart MainActivity", Toast.LENGTH_SHORT).show();
        super.onRestart();
    }

    @Override
    protected void onDestroy() {

        Toast.makeText(this, "onDestroy MainActivity", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }


}