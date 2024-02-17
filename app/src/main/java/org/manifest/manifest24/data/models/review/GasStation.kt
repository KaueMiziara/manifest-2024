package org.manifest.manifest24.data.models.review

import org.osmdroid.util.GeoPoint

data class GasStation(
    val id: Int,
    val address: String,
    val geoPoint: GeoPoint,
)