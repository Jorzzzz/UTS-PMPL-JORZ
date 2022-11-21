package com.example.jorzvapestore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class celana2 extends AppCompatActivity {

    ImageButton back, btn;
    private ImageSlider imageSlider;
    Spinner jumlah,ukuran;
    int harga = 40000;
    String itemJumlah,itemUkuran;
    int itemHarga = 0;
    String nama = "COTTON BACON";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celana2);

        jumlah = findViewById(R.id.jumlah);

        imageSlider = findViewById(R.id.imageSlider);
        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel(R.drawable.celana21, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.celana22, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.celana23, ScaleTypes.FIT));

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


        back = (ImageButton) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(celana2.this, celana.class);
                startActivity(intent);
            }
        });
        btn = (ImageButton) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(celana2.this, checkout.class);
                intent.putExtra("hrg",""+itemHarga);
                intent.putExtra("jml",itemJumlah);
                intent.putExtra("ukr",itemUkuran);
                intent.putExtra("nama",nama);
                startActivity(intent);
            }
        });

    }
}