package com.tesoem.p5spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Spinner splista;
    List<String> Milista = new ArrayList<>(Arrays.asList("Estado de Mexico", "CDMX", "Puebla", "Morelos", "Veracruz", "Guerrero"));
    ArrayAdapter<String> adaptador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        splista = findViewById(R.id.apA1Estado);
        splista.setOnItemSelectedListener((new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String valor = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(MainActivity.this, "Se selecciono: "+ valor, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        }));
        adaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Milista);
        splista.setAdapter(adaptador);
    }
}