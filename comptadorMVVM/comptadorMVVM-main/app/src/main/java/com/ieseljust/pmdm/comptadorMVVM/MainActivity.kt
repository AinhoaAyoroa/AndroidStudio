package com.ieseljust.pmdm.comptadorMVVM

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer

class MainActivity : AppCompatActivity() {

    private val contadorViewModel: ComptadorViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val textViewContador = findViewById<TextView>(R.id.textViewComptador)
        val btIncrementar = findViewById<Button>(R.id.btAdd)
        val btAbrir = findViewById<Button>(R.id.btOpen)
        val btDecrementar = findViewById<Button>(R.id.btRes)
        val btResetear = findViewById<Button>(R.id.btReset)

        contadorViewModel.contador.observe(this, Observer { contador ->
            textViewContador.text = contador.toString()
        })

        btIncrementar.setOnClickListener {
            contadorViewModel.incrementar()
        }

        btAbrir.setOnClickListener {
            Intent(this, MostraComptadorActivity::class.java).apply {
                putExtra("contador", contadorViewModel.contador.value)
                startActivity(this)
            }
        }

        btDecrementar.setOnClickListener {
            contadorViewModel.decrementar()
        }

        btResetear.setOnClickListener {
            contadorViewModel.resetear()
        }
    }
}
