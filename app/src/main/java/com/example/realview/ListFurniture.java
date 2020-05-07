package com.example.realview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ListFurniture extends AppCompatActivity {

    TextView txtbc,txtsofa,txtchair,txtcrib;
    ImageView imgbc,imgsofa,imgchair,imgcrib;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.furniture_list);

        txtbc = (TextView) findViewById(R.id.txtbc);
        imgbc = (ImageView) findViewById(R.id.imgbc);
        txtsofa = (TextView) findViewById(R.id.txtsofa);
        imgsofa = (ImageView) findViewById(R.id.imgsofa);
        txtcrib = (TextView) findViewById(R.id.txtcrib);
        imgcrib = (ImageView) findViewById(R.id.imgcrib);

        //sofa
        txtsofa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),sofaCate.class);
                startActivity(i);
            }
        });

        imgsofa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),sofaCate.class);
                startActivity(i);
            }
        });

        //bookcase
        txtbc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),HomeAR.class);
                String str = "model.sfb";
                //create the bundle
                Bundle bundle = new Bundle();
                //add data to bundle
                bundle.putString("name",str);
                //add bundle to intent
                i.putExtras(bundle);
                startActivity(i);
            }
        });
        imgbc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),HomeAR.class);
                String str = "model.sfb";
                //create the bundle
                Bundle bundle = new Bundle();
                //add data to bundle
                bundle.putString("name",str);
                //add bundle to intent
                i.putExtras(bundle);
                startActivity(i);
            }
        });
        //crib
        txtcrib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),HomeAR.class);
                String str = "Crib.sfb";
                //create the bundle
                Bundle bundle = new Bundle();
                //add data to bundle
                bundle.putString("name",str);
                //add bundle to intent
                i.putExtras(bundle);
                startActivity(i);
            }
        });
        imgcrib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),HomeAR.class);
                String str = "Crib.sfb";
                //create the bundle
                Bundle bundle = new Bundle();
                //add data to bundle
                bundle.putString("name",str);
                //add bundle to intent
                i.putExtras(bundle);
                startActivity(i);
            }
        });
    }
}
