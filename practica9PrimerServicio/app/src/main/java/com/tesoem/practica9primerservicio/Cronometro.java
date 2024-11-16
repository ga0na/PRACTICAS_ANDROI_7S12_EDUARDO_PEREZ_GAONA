package com.tesoem.practica9primerservicio;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.CountDownTimer;
import android.os.IBinder;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class Cronometro extends Service {
    private Context ctx = null;
    TextView texto;
    Timer temporizador = new Timer();
    private double cronometro = 0.0;
    private static final long INTERVALO_ACTUALIZACION = 100;

    public Cronometro() {
    }

    public Cronometro(Context c){
        super();
        this.ctx = ctx;
    }
    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void nuevo(){
        new CountDownTimer(30000 , 100){
            public void onTick(long l){
                Log.i("CCONTADOR", "oNtICK: "+ l/1000);
            }

            @Override
            public void onFinish(){
                Toast.makeText(ctx, "Se TERMINO:...!", Toast.LENGTH_LONG).show();
            }
        }.start();
    }

    public void IniciarCronometro(){
        temporizador.schedule(new TimerTask() {
            @Override
            public void run() {
                cronometro += 0.01;
                texto.setText(String.valueOf(cronometro));
            }
        },0,INTERVALO_ACTUALIZACION);
    }

    public void onDestroy(){
        if(temporizador != null){
            temporizador.cancel();
        }
    }

    public void setView(TextView v){
        texto = v;
        texto.setText("Pasando por el servicio");
        IniciarCronometro();
    }
}