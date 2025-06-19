package ru.chernyshoff.ddd.domain

import java.util.UUID

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
