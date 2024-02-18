package org.manifest.manifest24.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import org.manifest.manifest24.data.dtos.GasStationResponse
import org.manifest.manifest24.data.repositories.IGasStationRepository

class MapViewModel(
    private val gasStationRepository: IGasStationRepository
) : ViewModel() {
    private val _gasStations = MutableStateFlow<List<GasStationResponse>>(emptyList())
    val gasStations = _gasStations.asStateFlow()

    init {
        viewModelScope.launch {
            gasStationRepository.findGasStationsNearestTo(10, -23.5, -46.6)
                .collectLatest { result ->
                    _gasStations.update { result }
                }
        }
    }
}
