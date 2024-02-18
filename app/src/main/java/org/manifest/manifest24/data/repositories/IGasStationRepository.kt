package org.manifest.manifest24.data.repositories

import kotlinx.coroutines.flow.Flow
import org.manifest.manifest24.data.dtos.GasStationResponse

interface IGasStationRepository {
    suspend fun findGasStationsNearestTo(): Flow<List<GasStationResponse>>
}
