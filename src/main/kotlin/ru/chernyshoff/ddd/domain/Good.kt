package ru.chernyshoff.ddd.domain

import java.math.BigDecimal
import java.util.UUID

data class Good(
    val id: UUID? = null,
    val name: String,
    val seller: Seller,
    val properties: Properties
) {

    data class Properties(
        val price: BigDecimal,
        val stock: Int
    )
}
