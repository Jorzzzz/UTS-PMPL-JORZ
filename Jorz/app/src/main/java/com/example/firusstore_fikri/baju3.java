package com.example.firusstore_fikri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.Spinner;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import java.util.ArrayList;

public class baju3 extends AppCompatActivity {

    ImageButton back, btn;
    private ImageSlider imageSlider;
    Spinner jumlah,ukuran;
    int harga = 200000;
    String itemJumlah,itemUkuran;
    int itemHarga = 0;
    String nama = "ChinaTown";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baju3);

        jumlah = findViewById(R.id.jumlah);
        ukuran = findViewById(R.id.ukuran);

        imageSlider = findViewById(R.id.imageSlider);
        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel(R.drawable.baju31, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.baju32, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.baju33, ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

        jumlah.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                itemJumlah = (String) parent.getItemAtPosition(position);
                //Toast.makeText(baju1.this,""+item,Toast.LENGTH_LONG).show();
                int jml = Integer.parseInt(itemJumlah);
                itemHarga = harga * jml;
            }
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        ukuran.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                itemUkuran = (String) parent.getItemAtPosition(position);
                //Toast.makeText(beju1.this,""+item,Toast.LENGTH_LONG).show();
            }
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        back = (ImageButton) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(baju3.this, baju.class);
                startActivity(intent);
            }
        });
        btn = (ImageButton) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(baju3.this, checkout.class);
                intent.putExtra("hrg",""+itemHarga);
                intent.putExtra("jml",itemJumlah);
                intent.putExtra("ukr",itemUkuran);
                intent.putExtra("nama",nama);
                startActivity(intent);
            }
        });

    }
}