package ru.chernyshoff.ddd.domain

import java.util.UUID

data class Cart(
    val id: UUID,
    val buyerId: UUID,
    val goods: List<Good>?
)
