package com.example.reto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Fin extends AppCompatActivity {
    public Button botonYes;
    public Button botnoNo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fin);
        botonYes = (Button) findViewById(R.id.btnSi);
        botnoNo = (Button) findViewById(R.id.btnNo);

        botonYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent u = new Intent(getApplicationContext(),himno.class);
                startActivity(u);
                finish();
            }
        });

        botnoNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
                finish();
            }
        });

    }
}