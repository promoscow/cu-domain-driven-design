package ru.chernyshoff.ddd.domain

import java.util.UUID

data class Seller(
    val id: UUID,
    val name: String?,
    val goods: List<Good>?
)
