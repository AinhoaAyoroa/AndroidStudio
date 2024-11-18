package com.ieseljust.pmdm.contadorcomposable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ieseljust.pmdm.contadorcomposable.ui.theme.ContadorComposableTheme

class MostraComptadorActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val valorContador = intent.getIntExtra("contador", -1)
            DetalleContador(valorContador) { finish() }
        }
    }
}

@Composable
fun DetalleContador(valor: Int, onCerrar: () -> Unit) {
    ContadorComposableTheme {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            Text(text = valor.toString(), fontSize = 88.sp)
            Spacer(modifier = Modifier.height(12.dp))
            Button(onClick = onCerrar) {
                Text(text = "Regresar", fontSize = 24.sp)
            }
        }
    }
}
