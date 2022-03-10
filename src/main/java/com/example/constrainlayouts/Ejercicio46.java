package com.example.constrainlayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Ejercicio46 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio46);
    }

    public void onClickPaso52(View view){
        Intent cambio = new Intent(this, Ejercicio52.class);
        startActivity(cambio);
    }
    public void onClickPaso43(View view){
        Intent cambio = new Intent(this, ConstrainActivity.class);
        startActivity(cambio);
    }

}