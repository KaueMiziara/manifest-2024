package org.manifest.manifest24.ui.pages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.Scaffold
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.manifest.manifest24.ui.components.ManifestAppBar
import org.manifest.manifest24.ui.components.home_page.AboutProjectSection
import org.manifest.manifest24.ui.components.home_page.group_member.GroupMembersSection

@Composable
fun HomePage(drawerState: DrawerState) {
    Scaffold(
        topBar = {
            ManifestAppBar(drawerState = drawerState)
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(16.dp)
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.spacedBy(32.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            AboutProjectSection()
            GroupMembersSection()
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun HomePagePreview() {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)

    HomePage(drawerState)
}
