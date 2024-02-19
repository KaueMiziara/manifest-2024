package org.manifest.manifest24.extensions

import org.manifest.manifest24.data.dtos.GasStationResponse
import org.manifest.manifest24.data.models.review.GasStation

fun List<String>.formatAsString(): String {
    return joinToString(", ")
}

fun List<GasStationResponse>.toGasStationList(): List<GasStation> = this.map { it.toGasStation() }
