package ru.chernyshoff.ddd.domain

import java.math.BigDecimal
import java.util.UUID

data class Good(
    val id: UUID,
    val name: String,
    val description: String?,
    val sellerId: UUID,
    val cartIds: List<UUID>?,
    val orderIds: List<UUID>?,
    val params: Params,
    val price: BigDecimal
) {

    data class Params(
        val weight: Double,
        val height: Double,
        val width: Double
    )
}
