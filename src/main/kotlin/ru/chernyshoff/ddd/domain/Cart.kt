package ru.chernyshoff.ddd.domain

import java.util.*

data class Cart(
    val id: UUID? = null,
    val buyer: Buyer? = null
)
