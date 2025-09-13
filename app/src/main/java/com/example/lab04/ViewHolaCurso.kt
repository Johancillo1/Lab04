package com.example.lab04

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ViewHolaCurso(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Text(text = "¡Hola, curso de Android con Jetpack Compose! 🎉")
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = { }) {
            Text("Click aquí")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewViewHolaCurso() {
    ViewHolaCurso()
}