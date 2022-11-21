package com.example.firusstore_fikri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    View mainbaju, mainhoodie, maincelana, mainkemeja, mainbaju1, mainkemeja2, maincelana1, mainhoodie4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainbaju = (View) findViewById(R.id.mainbaju);
        mainbaju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, baju.class);
                startActivity(intent);
            }
        });
        mainhoodie = (View) findViewById(R.id.mainhoodie);
        mainhoodie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, hoodie.class);
                startActivity(intent);
            }
        });
        mainkemeja = (View) findViewById(R.id.mainkemeja);
        mainkemeja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, kemeja.class);
                startActivity(intent);
            }
        });
        maincelana = (View) findViewById(R.id.maincelana);
        maincelana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, celana.class);
                startActivity(intent);
            }
        });
        mainbaju1 = (View) findViewById(R.id.mainbaju1);
        mainbaju1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, baju1.class);
                startActivity(intent);
            }
        });
        mainkemeja2 = (View) findViewById(R.id.mainkemeja2);
        mainkemeja2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, kemeja2.class);
                startActivity(intent);
            }
        });
        maincelana1 = (View) findViewById(R.id.maincelana1);
        maincelana1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, celana1.class);
                startActivity(intent);
            }
        });
        mainhoodie4 = (View) findViewById(R.id.mainhoodie4);
        mainhoodie4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, hoodie4.class);
                startActivity(intent);
            }
        });
    }
}