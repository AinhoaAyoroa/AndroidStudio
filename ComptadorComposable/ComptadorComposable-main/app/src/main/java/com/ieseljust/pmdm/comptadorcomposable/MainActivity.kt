package com.ieseljust.pmdm.contadorcomposable

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ieseljust.pmdm.contadorcomposable.ui.theme.ContadorComposableTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ContadorApp()
        }
    }
}

@Composable
fun ContadorApp() {
    var contador by rememberSaveable { mutableStateOf(0) }

    ContadorComposableTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxSize()
            ) {
                Text(text = "$contador", fontSize = 160.sp)
                Spacer(modifier = Modifier.height(12.dp))
                BotonReset { contador = 0 }
                Spacer(modifier = Modifier.height(12.dp))
                NavegarDetalle(contador)
            }

            Row(
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxSize().padding(16.dp)
            ) {
                BotonOperacion("-") { contador-- }
                Spacer(modifier = Modifier.width(70.dp))
                BotonOperacion("+") { contador++ }
            }
        }
    }
}

@Composable
fun BotonOperacion(texto: String, accion: () -> Unit) {
    Button(onClick = accion) {
        Text(text = texto, fontSize = 36.sp)
    }
}

@Composable
fun BotonReset(onReset: () -> Unit) {
    Button(onClick = onReset) {
        Text(text = "Reiniciar", fontSize = 28.sp)
    }
}

@Composable
fun NavegarDetalle(valor: Int) {
    val contexto = LocalContext.current
    Button(onClick = {
        val intent = Intent(contexto, MostraComptadorActivity::class.java).apply {
            putExtra("contador", valor)
        }
        contexto.startActivity(intent)
    }) {
        Text(text = "Ir a Detalle", fontSize = 28.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewApp() {
    ContadorApp()
}
