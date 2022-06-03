package com.generation.diceplay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //findViewById(id)

        val buttonD6 = findViewById<Button>(R.id.buttonD6)
        val buttonD12 = findViewById<Button>(R.id.buttonD12)
        val buttonD20 = findViewById<Button>(R.id.buttonD20)

        buttonD6.setOnClickListener {
            //Mensagem flutuante - Toast
            //Toast.makeText(this, "Clicou!", Toast.LENGTH_LONG).show()
            rolarDados(6)
        }
        buttonD12.setOnClickListener {
            //Mensagem flutuante - Toast
            //Toast.makeText(this, "Clicou!", Toast.LENGTH_LONG).show()
            rolarDados(12)
        }

        buttonD20.setOnClickListener {
            //Mensagem flutuante - Toast
            //Toast.makeText(this, "Clicou!", Toast.LENGTH_LONG).show()
            rolarDados(20)
        }



    }

    private fun rolarDados(lados: Int){
        val rolagem = (1..lados).random()

        val textDado = findViewById<TextView>(R.id.textDado)

        textDado.text = rolagem.toString()

        val image = findViewById<ImageView>(R.id.imageLados)

        when(rolagem){
            1 -> image.setImageResource(R.drawable.d10_1)
            2 -> image.setImageResource(R.drawable.d10_2)
            3 -> image.setImageResource(R.drawable.d10_3)
            4 -> image.setImageResource(R.drawable.d10_4)
            5 -> image.setImageResource(R.drawable.d10_5)
            6 -> image.setImageResource(R.drawable.d10_6)
            7 -> image.setImageResource(R.drawable.d10_7)
            8 -> image.setImageResource(R.drawable.d10_8)
            9 -> image.setImageResource(R.drawable.d10_9)
            10 -> image.setImageResource(R.drawable.d20_10)
            11 -> image.setImageResource(R.drawable.d20_11)
            12 -> image.setImageResource(R.drawable.d20_12)
            13 -> image.setImageResource(R.drawable.d20_13)
            14 -> image.setImageResource(R.drawable.d20_14)
            15 -> image.setImageResource(R.drawable.d20_15)
            16 -> image.setImageResource(R.drawable.d20_16)
            17 -> image.setImageResource(R.drawable.d20_17)
            18 -> image.setImageResource(R.drawable.d20_18)
            19 -> image.setImageResource(R.drawable.d20_19)
            20 -> image.setImageResource(R.drawable.d20_20)


        }

    }

}


