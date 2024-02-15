package org.manifest.manifest24.ui.components.review

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.utsman.osmandcompose.OpenStreetMap
import com.utsman.osmandcompose.rememberCameraState
import org.osmdroid.util.GeoPoint

@Composable
fun MapSection() {
    val initialLocation = GeoPoint(-23.57309181123147, -46.623389398907634)
    val cameraState = rememberCameraState {
        geoPoint = initialLocation
        zoom = 17.0
    }

    OpenStreetMap(
        modifier = Modifier.fillMaxSize(),
        cameraState = cameraState,
    )
}
