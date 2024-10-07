package com.graisie.libexample

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ExampleButton(modifier: Modifier) {
    Button(onClick = {
        // no-op
    }, modifier = modifier) {
        Text(text = "hello world")
    }
}