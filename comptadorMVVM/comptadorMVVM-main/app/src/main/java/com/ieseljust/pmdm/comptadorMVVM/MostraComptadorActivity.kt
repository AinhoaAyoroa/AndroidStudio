package com.ieseljust.pmdm.comptadorMVVM

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MostraComptadorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_mostra_comptador)

        val textViewContador = findViewById<TextView>(R.id.textViewMostraComptador)
        val btVolver = findViewById<Button>(R.id.btBack)

        val contador = intent.getIntExtra("contador", 0)
        textViewContador.text = contador.toString()

        btVolver.setOnClickListener {
            finish()
        }
    }
}
