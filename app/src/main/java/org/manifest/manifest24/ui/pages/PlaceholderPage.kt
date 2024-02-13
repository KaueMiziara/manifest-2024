package org.manifest.manifest24.ui.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import org.manifest.manifest24.ui.components.ManifestAppBar

@Composable
fun PlaceholderPage(drawerState: DrawerState, n: String) {
    Scaffold(
        topBar = {
            ManifestAppBar(drawerState = drawerState)
        }
    ) {
        Column(modifier = Modifier.padding(it)) {
            Text(text = "Hello, world! $n")
        }
    }
}

@Preview
@Composable
private fun PlaceholderPagePreview() {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)

    PlaceholderPage(drawerState, "1")
}
