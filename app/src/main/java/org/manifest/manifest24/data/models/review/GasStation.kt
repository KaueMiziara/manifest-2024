package org.manifest.manifest24.data.models.review

import org.osmdroid.util.GeoPoint

/**
 * Represents a gas station with its details.
 *
 * @property id Unique identifier for the gas station.
 * @property address Address of the gas station.
 * @property geoPoint GeoPoint representing the coordinates of the gas station's location.
 */
data class GasStation(
    val id: Long,
    val address: String,
    val geoPoint: GeoPoint,
)
