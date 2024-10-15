package com.example.contadores

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class ContadorActivity3 : AppCompatActivity() {
    private val contadorViewModel: ContadorViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Asegúrate de tener un layout diferente si es necesario

        val textViewContador = findViewById<TextView>(R.id.textViewContador)
        val buttonIncrementar = findViewById<Button>(R.id.buttonIncrementar)
        val buttonDecrementar = findViewById<Button>(R.id.buttonDecrementar)
        val buttonResetear = findViewById<Button>(R.id.buttonResetear)

        // Observamos el valor del contador en el ViewModel
        contadorViewModel.contador.observe(this) { valor ->
            textViewContador.text = valor.toString()
        }

        // Botones para incrementar, decrementar y resetear
        buttonIncrementar.setOnClickListener {
            contadorViewModel.incrementar()
        }

        buttonDecrementar.setOnClickListener {
            contadorViewModel.decrementar()
        }

        buttonResetear.setOnClickListener {
            contadorViewModel.resetear()
        }

        // Si la actividad se recrea (cambio de orientación), restaurar el valor del contador
        if (savedInstanceState != null) {
            val contadorGuardado = savedInstanceState.getInt("contador_valor", 0)
            contadorViewModel.resetear()
            repeat(contadorGuardado) {
                contadorViewModel.incrementar()
            }
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        // Guardamos el valor actual del contador en el estado de la instancia
        outState.putInt("contador_valor", contadorViewModel.contador.value ?: 0)
    }
}
