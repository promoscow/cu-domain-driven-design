package ru.chernyshoff.ddd.domain

import java.util.UUID

data class Cart(
    val id: UUID? = null,
    val buyer: Buyer? = null
)
