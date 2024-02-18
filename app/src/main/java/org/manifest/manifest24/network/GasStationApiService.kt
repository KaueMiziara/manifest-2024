package org.manifest.manifest24.network

import org.manifest.manifest24.data.dtos.ApiResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface GasStationApiService {
    @GET("locations/nearest_to")
    suspend fun findGasStationsNearestTo(
        @Query("lat") lat: Double,
        @Query("lng") lng: Double,
        @Query("limit") limit: Int,
    ): ApiResponse

    companion object {
        const val BASE_URL = "https://shellgsllocator.geoapp.me/api/v2/"
    }
}
