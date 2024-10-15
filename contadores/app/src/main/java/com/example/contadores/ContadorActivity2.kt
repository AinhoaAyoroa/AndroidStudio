package com.example.contadores

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class ContadorActivity2 : AppCompatActivity() {
    private val contadorViewModel: ContadorViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Asegúrate de tener un layout diferente si es necesario

        val textViewContador = findViewById<TextView>(R.id.textViewContador)
        val buttonIncrementar = findViewById<Button>(R.id.buttonIncrementar)
        val buttonDecrementar = findViewById<Button>(R.id.buttonDecrementar)
        val buttonResetear = findViewById<Button>(R.id.buttonResetear)

        contadorViewModel.contador.observe(this) { valor ->
            textViewContador.text = valor.toString()
        }

        buttonIncrementar.setOnClickListener {
            contadorViewModel.incrementar()
        }

        buttonDecrementar.setOnClickListener {
            contadorViewModel.decrementar()
        }

        buttonResetear.setOnClickListener {
            contadorViewModel.resetear()
        }
    }
}
