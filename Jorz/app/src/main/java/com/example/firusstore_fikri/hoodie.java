package com.example.firusstore_fikri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class hoodie extends AppCompatActivity {

    View baju, kemeja, celana, hoodie1, hoodie2, hoodie3, hoodie4, home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoodie);

        home = (View) findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hoodie.this, MainActivity.class);
                startActivity(intent);
            }
        });

        baju = (View) findViewById(R.id.baju);
        baju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hoodie.this, baju.class);
                startActivity(intent);
            }
        });
        kemeja = (View) findViewById(R.id.kemeja);
        kemeja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hoodie.this, kemeja.class);
                startActivity(intent);
            }
        });
        celana = (View) findViewById(R.id.celana);
        celana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hoodie.this, celana.class);
                startActivity(intent);
            }
        });
        hoodie1 = (View) findViewById(R.id.hoodie1);
        hoodie1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hoodie.this, hoodie1.class);
                startActivity(intent);
            }
        });
        hoodie2 = (View) findViewById(R.id.hoodie2);
        hoodie2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hoodie.this, hoodie2.class);
                startActivity(intent);
            }
        });
        hoodie3 = (View) findViewById(R.id.hoodie3);
        hoodie3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hoodie.this, hoodie3.class);
                startActivity(intent);
            }
        });
        hoodie4 = (View) findViewById(R.id.hoodie4);
        hoodie4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hoodie.this, hoodie4.class);
                startActivity(intent);
            }
        });
    }
}