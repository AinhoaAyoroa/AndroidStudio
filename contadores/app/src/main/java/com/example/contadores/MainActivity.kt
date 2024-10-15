package com.example.contadores

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonContador1 = findViewById<Button>(R.id.buttonContador1)
        val buttonContador2 = findViewById<Button>(R.id.buttonContador2)
        val buttonContador3 = findViewById<Button>(R.id.buttonContador3)

        buttonContador1.setOnClickListener {
            startActivity(Intent(this, ContadorActivity1::class.java))
        }

        buttonContador2.setOnClickListener {
            startActivity(Intent(this, ContadorActivity2::class.java))
        }

        buttonContador3.setOnClickListener {
            startActivity(Intent(this, ContadorActivity3::class.java))
        }
    }
}
