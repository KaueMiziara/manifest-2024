package org.manifest.manifest24.data.dtos

/**
 * Represents the API response body returned from the service.
 *
 * @property locations List of gas station responses.
 * @property clusters List of clusters.
 */
data class ApiResponse(
    val locations: List<GasStationResponse>,
    val clusters: List<Any>,
)
