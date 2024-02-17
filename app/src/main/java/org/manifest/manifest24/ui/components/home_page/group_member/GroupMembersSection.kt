package org.manifest.manifest24.ui.components.home_page.group_member

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.manifest.manifest24.data.models.GroupMember

@Composable
fun GroupMembersSection() {
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
            val groupMemberKaue = GroupMember(
                "Kauê Miziara",
                listOf("Backend, Mobile"),
                listOf("C, C++, Rust, Java, Kotlin, C#, Dart, Python"),
            )

            val groupMember2 = GroupMember(
                "",
                listOf(""),
                listOf("")
            )

            GroupMemberCard(groupMemberKaue)
            GroupMemberCard(groupMember2)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun GroupMembersSectionPreview() {
    GroupMembersSection()
}
