package com.gael.practica4_personaltoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnLanzar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLanzar = findViewById(R.id.btnA1Lanzar);

        btnLanzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lanzarToast();

            }
        });
    }
    private void lanzarToast(){
        LayoutInflater l = this.getLayoutInflater();
        View v = l.inflate(R.layout.plantilla,(ViewGroup) this.findViewById(R.id.grupo_temp));
        Toast t = new Toast(getApplicationContext());
        t.setGravity(Gravity.CENTER_HORIZONTAL, 10,0);
        t.setDuration(Toast.LENGTH_LONG);
        t.setView(v);
        t.show();
    }
}