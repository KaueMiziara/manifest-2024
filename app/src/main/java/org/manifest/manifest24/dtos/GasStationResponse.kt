package org.manifest.manifest24.dtos

import org.manifest.manifest24.models.review.GasStation
import org.osmdroid.util.GeoPoint

class GasStationResponse(
    private val address: String,
    private val latitude: Double,
    private val longitude: Double,
) {
    fun toGasStation() = GasStation(
        id = 0,
        address = address,
        geoPoint = GeoPoint(latitude, longitude),
    )
}
