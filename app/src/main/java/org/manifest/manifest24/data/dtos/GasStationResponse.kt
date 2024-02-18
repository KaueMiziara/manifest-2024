package org.manifest.manifest24.data.dtos

import org.manifest.manifest24.data.models.review.GasStation
import org.osmdroid.util.GeoPoint

class GasStationResponse(
    private val id: Long,
    private val address: String,
    private val latitude: Double,
    private val longitude: Double,
) {
    fun toGasStation() = GasStation(
        id = id,
        address = address,
        geoPoint = GeoPoint(latitude, longitude),
    )
}
