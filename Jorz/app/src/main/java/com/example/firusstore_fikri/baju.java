package com.example.firusstore_fikri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class baju extends AppCompatActivity {

    View bajuhoodie, bajukemeja, bajucelana, baju1, baju2, baju3, baju4, home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baju);

        bajuhoodie = (View) findViewById(R.id.bajuhoodie);
        bajuhoodie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(baju.this, hoodie.class);
                startActivity(intent);
            }
        });
        bajukemeja = (View) findViewById(R.id.bajukemeja);
        bajukemeja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(baju.this, kemeja.class);
                startActivity(intent);
            }
        });
        bajucelana = (View) findViewById(R.id.bajucelana);
        bajucelana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(baju.this, celana.class);
                startActivity(intent);
            }
        });
        baju1 = (View) findViewById(R.id.baju1);
        baju1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(baju.this, baju1.class);
                startActivity(intent);
            }
        });
        baju2 = (View) findViewById(R.id.baju2);
        baju2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(baju.this, baju2.class);
                startActivity(intent);
            }
        });
        baju3 = (View) findViewById(R.id.baju3);
        baju3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(baju.this, baju3.class);
                startActivity(intent);
            }
        });
        baju4 = (View) findViewById(R.id.baju4);
        baju4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(baju.this, baju4.class);
                startActivity(intent);
            }
        });
        home = (View) findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(baju.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}