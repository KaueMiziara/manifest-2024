package org.manifest.manifest24.ui.pages

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.Scaffold
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.utsman.osmandcompose.OpenStreetMap
import com.utsman.osmandcompose.rememberCameraState
import org.manifest.manifest24.ui.components.ManifestAppBar
import org.osmdroid.util.GeoPoint

@Composable
fun MapPage(drawerState: DrawerState) {
    Scaffold(
        topBar = { ManifestAppBar(drawerState = drawerState) }
    ) {
        OpenStreetMap(
            modifier = Modifier
                .padding(it)
                .fillMaxSize(),
            cameraState = rememberCameraState {
                geoPoint = GeoPoint(-23.57309181123147, -46.623389398907634)
                zoom = 17.0
            }
        )
    }
}

@Preview
@Composable
fun MapPagePreview() {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)

    MapPage(drawerState)
}
