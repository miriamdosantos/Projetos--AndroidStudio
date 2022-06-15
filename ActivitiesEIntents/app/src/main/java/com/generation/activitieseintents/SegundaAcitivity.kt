package com.generation.activitieseintents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SegundaAcitivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_acitivity)
        val buttonVoltat = findViewById<Button>(R.id.buttonVoltar)
        buttonVoltat.setOnClickListener {
            finish()
        }
    }
}