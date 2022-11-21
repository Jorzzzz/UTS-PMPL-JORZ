package com.example.firusstore_fikri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class slippembayaran extends AppCompatActivity {

    String nm,nmr,almt,wkt,via,bank,ttl,baju,ukuran,jumlah;

    TextView slip,wa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slippembayaran);

        slip = findViewById(R.id.SPrint);
        wa = findViewById(R.id.wa);
        wa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String wpurl = "https://wa.me/+6281344631582?text=Assalamualaikum Kak berikut bukti pembayaran yang sudah saya Screeenshoot ?";

                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(wpurl));
                startActivity(intent);

            }
        });

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

        slip.setText("SLIP PEMBAYARAN \n"+
                "\n"+
                "\n"+
                "\n"+
                "Nama : "+nm+"\n"+
                "Nomer : "+nmr+"\n"+
                "Alamat : "+almt+"\n"+
                "Waktu : "+wkt+"\n"+
                "VIA : "+via+"\n"+
                "Bank : "+bank+"\n"+
                "Total : "+ttl+"\n"+
                "Baju : "+baju+"\n"+
                "Ukuran : "+ukuran+"\n"+
                "Jumlah : "+jumlah);
    }
}