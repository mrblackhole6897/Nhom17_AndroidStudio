package com.example.bai3;


import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

import java.io.FileInputStream;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {
    RadioButton chim, meo, cho, tho, heo;
    ImageView hinhanh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
        xuli();
    }


    public void anhxa() {
        chim = findViewById(R.id.bird);
        meo = findViewById(R.id.cat);
        cho = findViewById(R.id.dog);
        tho = findViewById(R.id.rabbit);
        heo = findViewById(R.id.pig);
        hinhanh = findViewById(R.id.hinhanh);
    }

    public void xuli() {

        chim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hinhanh.setImageResource(R.drawable.chim);
            }
        });
        meo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hinhanh.setImageResource(R.drawable.meo);
            }
        });
        cho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hinhanh.setImageResource(R.drawable.cho);
            }
        });
        tho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hinhanh.setImageResource(R.drawable.tho);
            }
        });
        heo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hinhanh.setImageResource(R.drawable.heo);
            }
        });

    }
}
