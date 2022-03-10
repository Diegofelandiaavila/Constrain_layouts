package com.example.constrainlayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ejercicio45 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio45);
    }

    public void onClickPaso46(View view){
        Intent cambio = new Intent(this, Ejercicio46.class);
        startActivity(cambio);
    }
}