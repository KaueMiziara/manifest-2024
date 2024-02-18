package org.manifest.manifest24.data.models.review

/**
 * Represents a review for a gas station.
 *
 * @property id Unique identifier for the review.
 * @property gasStation GasStation object representing the reviewed gas station.
 * @property serviceQuality Integer representing the quality of service provided.
 */
data class Review(
    val id: Int,
    val gasStation: GasStation,
    val serviceQuality: Int,
)
