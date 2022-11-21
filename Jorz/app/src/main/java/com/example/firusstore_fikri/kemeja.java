package com.example.firusstore_fikri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class kemeja extends AppCompatActivity {

    View baju, hoodie, celana, kemeja1, kemeja2, kemeja3, kemeja4, home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kemeja);

        home = (View) findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kemeja.this, MainActivity.class);
                startActivity(intent);
            }
        });

        baju = (View) findViewById(R.id.baju);
        baju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kemeja.this, baju.class);
                startActivity(intent);
            }
        });
        hoodie = (View) findViewById(R.id.hoodie);
        hoodie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kemeja.this, hoodie.class);
                startActivity(intent);
            }
        });
        celana = (View) findViewById(R.id.celana);
        celana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kemeja.this, celana.class);
                startActivity(intent);
            }
        });
        kemeja1 = (View) findViewById(R.id.kemeja1);
        kemeja1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kemeja.this, kemeja1.class);
                startActivity(intent);
            }
        });
        kemeja2 = (View) findViewById(R.id.kemeja2);
        kemeja2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kemeja.this, kemeja2.class);
                startActivity(intent);
            }
        });
        kemeja3 = (View) findViewById(R.id.kemeja3);
        kemeja3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kemeja.this, kemeja3.class);
                startActivity(intent);
            }
        });
        kemeja4 = (View) findViewById(R.id.kemeja4);
        kemeja4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kemeja.this, kemeja4.class);
                startActivity(intent);
            }
        });
    }
}