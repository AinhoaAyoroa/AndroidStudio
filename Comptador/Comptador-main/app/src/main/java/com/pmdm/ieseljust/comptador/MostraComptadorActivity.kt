package com.pmdm.ieseljust.comptador

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MostraComptadorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostra_comptador)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val barrasSistema = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(barrasSistema.left, barrasSistema.top, barrasSistema.right, barrasSistema.bottom)
            insets
        }

        val textViewContador = findViewById<TextView>(R.id.textViewMostraComptador)
        val botonAtras = findViewById<Button>(R.id.btBack)
        val contador = intent.getIntExtra("contador", 0)

        textViewContador.text = contador.toString()

        botonAtras.setOnClickListener {
            finish()
        }
    }
}
