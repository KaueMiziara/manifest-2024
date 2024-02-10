package org.manifest.manifest24.ui.components.home_page.developer

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun DevelopersSection() {
    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            fontWeight = FontWeight.Bold,
            text = "Meet the Team",
        )

        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            DeveloperCard("", listOf(""), listOf(""))
            DeveloperCard("", listOf(""), listOf(""))
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DevelopersSectionPreview() {
    DevelopersSection()
}
