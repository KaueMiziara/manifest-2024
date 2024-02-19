package org.manifest.manifest24.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import org.manifest.manifest24.data.models.review.GasStation
import org.manifest.manifest24.data.repositories.IGasStationRepository
import org.manifest.manifest24.extensions.toGasStationList
import javax.inject.Inject

@HiltViewModel
class MapViewModel @Inject constructor(): ViewModel() {
    @Inject
    lateinit var gasStationRepository: IGasStationRepository

    private val _gasStations = MutableStateFlow<List<GasStation>>(emptyList())
    val gasStations = _gasStations.asStateFlow()

    init {
        viewModelScope.launch {
            gasStationRepository.findGasStationsNearestTo(10, -23.5, -46.6)
                .collectLatest { result ->
                    _gasStations.update { result.toGasStationList() }
                }
        }
    }
}
