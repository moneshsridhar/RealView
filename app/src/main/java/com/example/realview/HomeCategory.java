package com.example.realview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeCategory extends AppCompatActivity {

    ImageView imgfur, imgelec, imgtoy;
    TextView txtfur, txtelec, txttoy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_home);

        txtfur = (TextView) findViewById(R.id.txtfur);
        txtelec = (TextView) findViewById(R.id.txtelec);
        txttoy = (TextView) findViewById(R.id.txttoy);

        imgfur = (ImageView) findViewById(R.id.imgfur);
        imgelec = (ImageView) findViewById(R.id.imgelec);
        imgtoy = (ImageView) findViewById(R.id.imgtoy);

        //Furniture
        txtfur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ListFurniture.class);
                startActivity(i);
            }
        });
        imgfur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ListFurniture.class);
                startActivity(i);
            }
        });

        //Electronics
        txtelec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        imgelec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //Toys
        txttoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        imgtoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }
}