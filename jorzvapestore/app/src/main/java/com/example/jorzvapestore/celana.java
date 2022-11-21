package com.example.jorzvapestore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class celana extends AppCompatActivity {

    View hoodie, kemeja, baju, celana1, celana2, home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celana);

        home = (View) findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(celana.this, MainActivity.class);
                startActivity(intent);
            }
        });

        hoodie = (View) findViewById(R.id.hoodie);
        hoodie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(celana.this, hoodie.class);
                startActivity(intent);
            }
        });
        kemeja = (View) findViewById(R.id.kemeja);
        kemeja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(celana.this, kemeja.class);
                startActivity(intent);
            }
        });
        baju = (View) findViewById(R.id.baju);
        baju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(celana.this, baju.class);
                startActivity(intent);
            }
        });
        celana1 = (View) findViewById(R.id.celana1);
        celana1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(celana.this, celana1.class);
                startActivity(intent);
            }
        });
        celana2 = (View) findViewById(R.id.celana2);
        celana2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(celana.this, celana2.class);
                startActivity(intent);
            }
        });
    }
}