package com.example.p3_7s12_bundleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nombre, correo, telefono;
    Button enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = findViewById(R.id.txtnombre);
        correo = findViewById(R.id.txtcorreo);
        telefono = findViewById(R.id.txttelefono);

        enviar = findViewById(R.id.button);


        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                botonparcel(view);
            }
        });

        }

    public void botonparcel(View v) {
        Datos datos = new Datos(nombre.getText().toString(), correo.getText().toString(), telefono.getText().toString());
        Intent intent = new Intent(this, vistaBundle.class);
        intent.putExtra("datosParce", datos);
        startActivity(intent);
    }
}