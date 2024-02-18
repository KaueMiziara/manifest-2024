package org.manifest.manifest24.data.dtos

import org.manifest.manifest24.data.models.review.GasStation
import org.osmdroid.util.GeoPoint

data class GasStationResponse(
    val id: Long,
    val address: String,
    val lat: Double,
    val lng: Double,
) {
    fun toGasStation() = GasStation(
        id = id,
        address = address,
        geoPoint = GeoPoint(lat, lng),
    )
}
