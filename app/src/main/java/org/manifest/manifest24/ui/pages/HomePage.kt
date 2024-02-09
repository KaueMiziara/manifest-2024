package org.manifest.manifest24.ui.pages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.manifest.manifest24.ui.components.ManifestAppBar
import org.manifest.manifest24.ui.components.home_page.AboutProjectSection
import org.manifest.manifest24.ui.components.home_page.developer.DevelopersSection

@Composable
fun HomePage() {
    Scaffold(topBar = {
        ManifestAppBar()
    }) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(16.dp)
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.spacedBy(32.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            AboutProjectSection()
            PlaceholderPage()
            DevelopersSection()
        }
    }
}

@Preview
@Composable
private fun HomePagePreview() {
    HomePage()
}
