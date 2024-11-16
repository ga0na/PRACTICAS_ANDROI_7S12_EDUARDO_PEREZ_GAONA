package com.example.practica7imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    ImageView contenedor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contenedor = findViewById(R.id.ivA1imagen);
        Glide.with(this).load("https://images3.memedroid.com/images/UPLOADED937/6733e5e9d5560.webp").into(contenedor);
    }
}