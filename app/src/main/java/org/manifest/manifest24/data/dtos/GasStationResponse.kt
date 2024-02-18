package org.manifest.manifest24.data.dtos

import org.manifest.manifest24.data.models.review.GasStation
import org.osmdroid.util.GeoPoint

/**
 * DTO class representing gas station details in the API response.
 *
 * @property id Unique identifier for the gas station.
 * @property address Address of the gas station.
 * @property lat Latitude coordinate of the gas station's location.
 * @property lng Longitude coordinate of the gas station's location.
 */
data class GasStationResponse(
    val id: Long,
    val address: String,
    val lat: Double,
    val lng: Double,
) {
    /**
     * Converts the GasStationResponse to a GasStation model.
     *
     * @return GasStation object with id, address and geoPoint.
     */
    fun toGasStation(): GasStation = GasStation(
        id = id,
        address = address,
        geoPoint = GeoPoint(lat, lng),
    )
}
