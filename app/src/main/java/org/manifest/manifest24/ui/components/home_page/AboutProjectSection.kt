package org.manifest.manifest24.ui.components.home_page

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun AboutProjectSection() {
    Column(
        verticalArrangement = Arrangement.spacedBy(32.dp),
        modifier = Modifier
            .fillMaxWidth()
            .border(
                1.dp,
                SolidColor(Color.Black),
                shape = RoundedCornerShape(20.dp),
            )
            .clip(shape = RoundedCornerShape(20.dp))
            .background(Color.Gray)
            .padding(8.dp),
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                color = Color.White,
                fontWeight = FontWeight.Bold,
                text = "About the Project",
            )
            Text(
                color = Color.White,
                textAlign = TextAlign.Center,
                text = "This app was developed during undergraduate studies in Computer Engineering for a parter company.\n\n" +
                        "The goal was to introduce innovative features to the company's app, improving their clients' experience."
            )
        }
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                color = Color.White,
                fontWeight = FontWeight.Bold,
                text = "Rating System",
            )
            Text(
                color = Color.White,
                textAlign = TextAlign.Center,
                text = "Users can now rate services provided by establishments listed on the app."
            )
        }

        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                color = Color.White,
                fontWeight = FontWeight.Bold,
                text = "Simplified Payment",
            )
            Text(
                color = Color.White,
                textAlign = TextAlign.Center,
                text = "For establishments with numerial payment codes, we've integrated a character reader to eliminate the need to manually input it.\n" +
                        "It also adds a QR code scanner, encouraging the company to migrate their payment codes."
            )
        }
    }
}

@Preview
@Composable
private fun AboutProjectSectionPreview() {
    AboutProjectSection()
}
