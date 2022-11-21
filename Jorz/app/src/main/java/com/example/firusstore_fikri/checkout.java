package com.example.firusstore_fikri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class checkout extends AppCompatActivity {

    View back;
    EditText alamat,nama,nomor;
    Spinner kurir;
    TextView total,ongkir,waktu,totalall;
    String pilihKurir,Tongki;
    String Tjml,Tukr,Thrg,Tnama;
    Button bayar;


    NumberFormat formatter = new DecimalFormat("###,###,###");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        back = findViewById(R.id.COBack);
        alamat = findViewById(R.id.COAlamat);
        nama = findViewById(R.id.CONama);
        nomor = findViewById(R.id.CONomor);
        kurir = findViewById(R.id.kurir);
        total = findViewById(R.id.COTotal);
        ongkir = findViewById(R.id.COOngkir);
        waktu = findViewById(R.id.COEstimasi);
        totalall = findViewById(R.id.COTotalall);
        bayar = findViewById(R.id.COBayar);

        Intent data = getIntent();
        Tjml = data.getStringExtra("jml");
        Tukr = data.getStringExtra("ukr");
        Thrg = data.getStringExtra("hrg");
        Tnama = data.getStringExtra("nama");

        total.setText("Rp. "+formatter.format(Integer.parseInt(Thrg)));

        kurir.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                pilihKurir = (String) parent.getItemAtPosition(position);
                //Toast.makeText(mukena1.this,""+item,Toast.LENGTH_LONG).show();
                if(pilihKurir.equals("JNE")){
                    Tongki = "15000";
                    ongkir.setText("Rp. 15.000");
                    waktu.setText("3 - 5 Hari");
                    int Ihrg = Integer.parseInt(Thrg);
                    int Iong = Integer.parseInt(Tongki);
                    totalall.setText("Rp. "+formatter.format(Ihrg+Iong));
                } else if(pilihKurir.equals("JNT")){
                    Tongki = "25000";
                    ongkir.setText("Rp. 25.000");
                    waktu.setText("1 - 2 Hari");
                    int Ihrg = Integer.parseInt(Thrg);
                    int Iong = Integer.parseInt(Tongki);
                    totalall.setText("Rp. "+formatter.format(Ihrg+Iong));
                }
            }
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(checkout.this, MainActivity.class);
                startActivity(intent);
            }
        });

        bayar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(checkout.this, Pembayaran.class);
                intent.putExtra("nama",nama.getText().toString());
                intent.putExtra("nomor",nomor.getText().toString());
                intent.putExtra("alamat",alamat.getText().toString());
                intent.putExtra("waktu",waktu.getText().toString());
                intent.putExtra("via",pilihKurir);
                intent.putExtra("total",totalall.getText().toString());
                intent.putExtra("ukuran",Tukr);
                intent.putExtra("jumlah",Tjml);
                intent.putExtra("baju",Tnama);
                startActivity(intent);
            }
        });

    }
}