package com.example.realview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class sofaCate extends AppCompatActivity {

    TextView txtsofadef,txtsofablack;
    ImageView sofa_default, sofa_black;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sofa_cate);

        //typecasting
        txtsofadef = (TextView) findViewById(R.id.txtsofadef);
        sofa_default = (ImageView)findViewById(R.id.sofa_default);
        txtsofablack = (TextView) findViewById(R.id.txtsofablack);
        sofa_black = (ImageView) findViewById(R.id.sofa_black);

        //sofa default
        txtsofadef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),HomeAR.class);
                String str = "sofa.sfb";
                //create the bundle
                Bundle bundle = new Bundle();
                //add data to bundle
                bundle.putString("name",str);
                //add bundle to intent
                i.putExtras(bundle);
                startActivity(i);
            }
        });
        sofa_default.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),HomeAR.class);
                String str = "sofa.sfb";
                //create the bundle
                Bundle bundle = new Bundle();
                //add data to bundle
                bundle.putString("name",str);
                //add bundle to intent
                i.putExtras(bundle);
                startActivity(i);
            }
        });

        //sofa black
        txtsofablack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),HomeAR.class);
                String str = "sofablack.sfb";
                //create the bundle
                Bundle bundle = new Bundle();
                //add data to bundle
                bundle.putString("name",str);
                //add bundle to intent
                i.putExtras(bundle);
                startActivity(i);
            }
        });
        sofa_black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),HomeAR.class);
                String str = "sofablack.sfb";
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
