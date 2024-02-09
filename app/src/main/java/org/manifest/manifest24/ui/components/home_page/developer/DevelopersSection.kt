package org.manifest.manifest24.ui.components.home_page.developer

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun DevelopersSection() {
    Row(
        horizontalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        DeveloperCard()
        DeveloperCard()
    }
}

@Preview(showBackground = true)
@Composable
private fun DevelopersSectionPreview() {
    DevelopersSection()
}
