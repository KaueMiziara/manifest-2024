package org.manifest.manifest24.ui.components.home_page.group_member

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun GroupMemberCard(
    name: String, stacks: List<String>, languages: List<String>,
) {
    ElevatedCard(
        elevation = CardDefaults.cardElevation(6.dp),
        colors = CardDefaults.elevatedCardColors(
            containerColor = Color.Gray
        ),
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(16.dp)
                .width(128.dp),
        ) {
            Icon(
                Icons.Rounded.AccountCircle,
                contentDescription = "Profile picture placeholder",
                tint = Color.White,
                modifier = Modifier.size(64.dp),
            )
            Text(
                color = Color.White,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                text = name,
            )
            Text(
                color = Color.White,
                textAlign = TextAlign.Center,
                text = stacks.joinToString(", "),
            )
            Text(
                color = Color.White,
                textAlign = TextAlign.Center,
                text = languages.joinToString(", "),
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun GroupMemberCardPreview() {
    GroupMemberCard(
        "Abc",
        listOf("Mobile", "Backend"),
        listOf("Kotlin", "Java")
    )
}
