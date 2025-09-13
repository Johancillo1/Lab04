package com.example.lab04

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ContenedorRow() {
    Row(modifier = Modifier.padding(16.dp)) {
        Text("Texto 1")
        Text(" - ")
        Text("Texto 2")
        Text(" - ")
        Text("Texto 3")
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewContenedorRow() {
    ContenedorRow()
}
