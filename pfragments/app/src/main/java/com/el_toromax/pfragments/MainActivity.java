package com.el_toromax.pfragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btnF1,btnF2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnF1=findViewById(R.id.btnA1Frg1);
        btnF2=findViewById(R.id.btnA1Frg2);

        Fragment funo= new primerFragment();
        Fragment fdos= new segundoFragment();

        btnF1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction f1= getSupportFragmentManager().beginTransaction();
                f1.replace(R.id.contenedorFragment,funo).commit();

            }
        });

        btnF2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction f2= getSupportFragmentManager().beginTransaction();
                f2.replace(R.id.contenedorFragment,fdos).commit();
            }
        });
    }
}