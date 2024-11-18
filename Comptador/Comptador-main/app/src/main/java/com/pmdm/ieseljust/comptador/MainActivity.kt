package com.pmdm.ieseljust.contadorapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private var valorContador = 0
    private lateinit var vistaContador: TextView
    private val LOG_TAG = "EstadoApp"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ajustarEspaciadoPantalla()

        vistaContador = findViewById(R.id.textViewContador)
        actualizarVista()

        findViewById<Button>(R.id.btnIncrementar).setOnClickListener { incrementar() }
        findViewById<Button>(R.id.btnDecrementar).setOnClickListener { decrementar() }
        findViewById<Button>(R.id.btnReiniciar).setOnClickListener { reiniciar() }
        findViewById<Button>(R.id.btnMostrar).setOnClickListener { mostrarOtraActividad() }
    }

    private fun ajustarEspaciadoPantalla() {
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.mainLayout)) { view, insets ->
            val bordesSistema = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            view.setPadding(bordesSistema.left, bordesSistema.top, bordesSistema.right, bordesSistema.bottom)
            insets
        }
    }

    private fun incrementar() {
        valorContador++
        actualizarVista()
    }

    private fun decrementar() {
        valorContador--
        actualizarVista()
    }

    private fun reiniciar() {
        valorContador = 0
        actualizarVista()
    }

    private fun mostrarOtraActividad() {
        val intent = Intent(this, DetalleContadorActivity::class.java)
        intent.putExtra("valor", valorContador)
        startActivity(intent)
    }

    private fun actualizarVista() {
        vistaContador.text = valorContador.toString()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        valorContador = savedInstanceState.getInt("contador_guardado", 0)
        actualizarVista()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("contador_guardado", valorContador)
    }

    override fun onStart() {
        super.onStart()
        Log.d(LOG_TAG, "La actividad está visible (onStart)")
    }

    override fun onResume() {
        super.onResume()
        Log.d(LOG_TAG, "La actividad está en primer plano (onResume)")
    }

    override fun onPause() {
        super.onPause()
        Log.d(LOG_TAG, "La actividad está en pausa (onPause)")
    }

    override fun onStop() {
        super.onStop()
        Log.d(LOG_TAG, "La actividad ya no está visible (onStop)")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(LOG_TAG, "La actividad se está destruyendo (onDestroy)")
    }
}
