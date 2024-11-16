package com.example.p3_7s12_bundleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class vistaBundle extends AppCompatActivity {
TextView nombre, correo, telefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_bundle);

        nombre = findViewById(R.id.textView5);
        correo = findViewById(R.id.textView6);
        telefono = findViewById(R.id.textView7);

        Datos datos = getIntent().getParcelableExtra("datosParce");

        nombre.setText(datos.getNombre());
        correo.setText(datos.getCorreo());
        telefono.setText(datos.getTelefono());
    }
}