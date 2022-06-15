package com.generation.activitieseintents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         val buttonNext = findViewById<Button>(R.id.buttonNext)
        val intenteSegunda = Intent(this, SegundaAcitivity::class.java)
        buttonNext.setOnClickListener {
          startActivity(intenteSegunda)
        }
    }
}