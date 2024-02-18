package org.manifest.manifest24.data.dtos

data class ApiResponse(
    val locations: List<GasStationResponse>,
    val clusters: List<Any>,
)
