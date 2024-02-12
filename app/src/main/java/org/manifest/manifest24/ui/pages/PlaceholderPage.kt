package org.manifest.manifest24.ui.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun PlaceholderPage(n: String) {
    Column {
        Text(text = "Hello, world! $n")
    }
}

@Preview
@Composable
private fun PlaceholderPagePreview() {
    PlaceholderPage("1")
}
