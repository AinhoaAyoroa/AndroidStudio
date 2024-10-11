package com.example.contadores_noa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val contadorTextView: TextView = findViewById(R.id.contadorTextView)
        val sumarButton: Button = findViewById(R.id.sumarButton)
        val restarButton: Button = findViewById(R.id.restarButton)
        val resetButton: Button = findViewById(R.id.resetButton)

        contadorTextView.text = contador.toString()

        sumarButton.setOnClickListener {
            contador++
            contadorTextView.text = contador.toString()
        }

        restarButton.setOnClickListener {
            contador--
            contadorTextView.text = contador.toString()
        }

        resetButton.setOnClickListener {
            contador = 0
            contadorTextView.text = contador.toString()
        }
    }
}
