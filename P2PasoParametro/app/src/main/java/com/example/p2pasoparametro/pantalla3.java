package com.example.p2pasoparametro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class pantalla3 extends AppCompatActivity {
    TextView nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla3);

        nombre = findViewById(R.id.textView3);

        //Recuperar dato del intent
        Bundle parametro = getIntent().getExtras();
        nombre.setText("Bienvenido " + parametro.getString("nombre"));
    }
}