package org.manifest.manifest24.data.repositories

import kotlinx.coroutines.flow.Flow
import org.manifest.manifest24.data.dtos.GasStationResponse

/**
 * Interface defining operations for retrieving gas station data.
 */
interface IGasStationRepository {
    /**
     * Retrieves a flow of gas stations nearest to a specified location.
     *
     * @param limit Maximum number of gas stations to retrieve.
     * @param lat Latitude of the reference location.
     * @param lng Longitude of the reference location.
     * @return Flow emitting a list of GasStationResponse objects representing the nearest gas stations.
     */
    suspend fun findGasStationsNearestTo(
        limit: Int,
        lat: Double,
        lng: Double,
    ): Flow<List<GasStationResponse>>
}
