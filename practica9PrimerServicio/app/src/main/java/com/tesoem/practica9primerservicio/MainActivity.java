package com.tesoem.practica9primerservicio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button lanzar, detener;
    TextView lblcronometro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lblcronometro = findViewById(R.id.cronometro);
        lanzar = findViewById(R.id.btnA1Iniciar);
        detener = findViewById(R.id.btnA1Terminar);
        Cronometro cronometro = new Cronometro(getApplicationContext());
        lanzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cronometro.setView(lblcronometro);          //Para ver en pantalla
                //cronometro.nuevo();                         //Para ver en logs
            }
        });

        detener.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cronometro.onDestroy();
            }
        });
    }
}