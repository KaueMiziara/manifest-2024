package org.manifest.manifest24.ui.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import org.manifest.manifest24.ui.components.ManifestAppBar

@Composable
fun HomePage() {
    Scaffold(
        topBar = {
            ManifestAppBar()
        }
    ) { innerPadding ->
        Column(Modifier.padding(innerPadding)) {
            PlaceholderPage()
        }
    }
}

@Preview
@Composable
private fun HomePagePreview() {
    HomePage()
}
