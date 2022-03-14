package com.example.reto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class himno extends AppCompatActivity {
    public TextView letra;
    MediaPlayer himno;
    public Button salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_himno);
        letra = findViewById(R.id.txtLetra);
        salir = (Button) findViewById(R.id.btnSalir);
        himno = MediaPlayer.create(this,R.raw.himno_ugb);
        himno.start();
        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                himno.pause();
                himno = null;
                finish();

            }
        });



        Handler hi = new Handler();
       Runnable ru = new Runnable() {
           @Override
           public void run() {
               //la acción
               letra.setText(R.string.parte1);

           }
       };
       // se jecuta


        Handler hi2 = new Handler();
        Runnable ru2 = new Runnable() {
            @Override
            public void run() {
                letra.setText(R.string.parte2);
            }
        };


        Handler hi3 = new Handler();
        Runnable ru3 = new Runnable() {
            @Override
            public void run() {
                letra.setText(R.string.parte3);
            }
        };

        Handler hi4 = new Handler();
        Runnable ru4 = new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(getApplicationContext(),Fin.class);
                startActivity(i);
                finish();
            }
        };

        hi.postDelayed(ru,5000);
        hi2.postDelayed(ru2,24000);
        hi3.postDelayed(ru3,62000);
        hi4.postDelayed(ru4,110000);
    }

}