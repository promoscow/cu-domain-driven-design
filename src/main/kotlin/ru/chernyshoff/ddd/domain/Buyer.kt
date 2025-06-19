package ru.chernyshoff.ddd.domain

import java.util.*

data class Buyer(
    val id: UUID? = null,
    val name: String,
    val cart: Cart
)
