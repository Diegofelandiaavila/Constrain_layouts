package com.example.constrainlayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;

import android.os.Bundle;

public class ConstrainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constrain);
    }

    public void onClickPaso44(View view){
    Intent cambio = new Intent(this, MainActivity.class);
    startActivity(cambio);
    }
}
