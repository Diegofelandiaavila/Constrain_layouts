package com.example.constrainlayouts

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickPaso45(view: View?) {
        val cambio = Intent(this, ejercicio45::class.java)
        startActivity(cambio)
    }
}