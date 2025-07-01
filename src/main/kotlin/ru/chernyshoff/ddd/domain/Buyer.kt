package ru.chernyshoff.ddd.domain

import java.util.UUID

data class Buyer(
    val id: UUID,
    val userId: UUID,
    val cart: Cart?
)
