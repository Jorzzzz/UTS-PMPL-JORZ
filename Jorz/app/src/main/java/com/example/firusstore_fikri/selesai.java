package com.example.firusstore_fikri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class selesai extends AppCompatActivity {

    LinearLayout ok;

    String nm,nmr,almt,wkt,via,bank,ttl,baju,ukuran,jumlah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selesai);

        ok = findViewById(R.id.SOK);

        Intent data = getIntent();
        nm = data.getStringExtra("nama");
        nmr = data.getStringExtra("nomor");
        almt = data.getStringExtra("alamat");
        wkt = data.getStringExtra("waktu");
        via = data.getStringExtra("via");
        bank = data.getStringExtra("bank");
        ttl = data.getStringExtra("total");
        baju = data.getStringExtra("baju");
        ukuran = data.getStringExtra("ukuran");
        jumlah = data.getStringExtra("jumlah");

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(selesai.this, slippembayaran.class);
                intent.putExtra("nama",nm);
                intent.putExtra("nomor",nmr);
                intent.putExtra("alamat",almt);
                intent.putExtra("waktu",wkt);
                intent.putExtra("via",via);
                intent.putExtra("bank",bank);
                intent.putExtra("total",ttl);
                intent.putExtra("baju",baju);
                intent.putExtra("ukuran",ukuran);
                intent.putExtra("jumlah",jumlah);
                startActivity(intent);
            }
        });

    }
}