package com.example.p2pasoparametro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Contacts;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btsig, btnPasar;
    EditText txtNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btsig = findViewById(R.id.button1);
        btnPasar = findViewById(R.id.button2);
        txtNombre = findViewById(R.id.editTextText);

        btnPasar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                android:pasoParametro(view);
            }
        });
        
        btsig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sigPantalla(view);
            }
        });

    }

    public void sigPantalla(View v){
        Intent intent = new Intent(this, pantalla2.class);
        startActivity(intent);
    }

    public void pasoParametro(View v){
        Intent intent = new Intent(this, pantalla3.class);
        intent.putExtra("nombre", txtNombre.getText().toString());
        startActivity(intent);
    }

}