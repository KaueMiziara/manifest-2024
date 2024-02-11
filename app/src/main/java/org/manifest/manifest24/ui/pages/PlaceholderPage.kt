package org.manifest.manifest24.ui.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun PlaceholderPage() {
    Column {
        Text(text = "Hello, world! 1")
        Text(text = "Hello, world! 2")
        Text(text = "Hello, world! 3")
        Text(text = "Hello, world! 4")
    }
}

@Preview
@Composable
private fun PlaceholderPagePreview() {
    PlaceholderPage()
}
