package ru.chernyshoff.ddd.domain

import java.util.UUID

data class Buyer(
    val id: UUID? = null,
    val name: String,
    val userId: UUID,
    val cart: Cart? = null
)
