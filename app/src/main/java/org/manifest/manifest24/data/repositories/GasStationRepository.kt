package org.manifest.manifest24.data.repositories

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import org.manifest.manifest24.data.dtos.GasStationResponse
import org.manifest.manifest24.network.GasStationApiService
import javax.inject.Inject

/**
 * Implementation of the IGasStationRepository interface for retrieving gas station data from the API.
 *
 * @property apiService GasStationApiService for making API requests.
 */
class GasStationRepository @Inject constructor(
    private val apiService: GasStationApiService,
) : IGasStationRepository {
    override suspend fun findGasStationsNearestTo(
        limit: Int,
        lat: Double,
        lng: Double
    ): Flow<List<GasStationResponse>> {
        return flow {
            val stationsFromApi =
                apiService.findGasStationsNearestTo(lat, lng, limit)

            emit(stationsFromApi.locations)
        }
    }
}
