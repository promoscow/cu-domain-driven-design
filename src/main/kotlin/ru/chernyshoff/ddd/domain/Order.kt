package ru.chernyshoff.ddd.domain

import java.util.UUID

data class Order(
    val id: UUID,
    val goods: List<Good>,
    val buyer: Buyer,
    val status: Status
) {

    enum class Status {
        NEW,
        PAID,
        IN_DELIVERY,
        DELIVERED,
        CANCELLED
    }
}
