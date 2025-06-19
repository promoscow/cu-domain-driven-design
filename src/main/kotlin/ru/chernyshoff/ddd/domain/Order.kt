package ru.chernyshoff.ddd.domain

import java.util.*

data class Order(
    val id: UUID? = null,
    val goods: List<Good>,
    val buyer: Buyer,
    val status: Status
) {

    enum class Status {
        NEW,
        PREPAID,
        DELIVERED,
        CANCELLED
    }
}
