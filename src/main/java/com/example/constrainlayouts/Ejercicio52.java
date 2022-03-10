package com.example.constrainlayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Ejercicio52 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio52);

    }

    public void onClickPasomateriales(View view) {
        Intent cambio = new Intent(this, materiales.class);
        startActivity(cambio);
    }
}