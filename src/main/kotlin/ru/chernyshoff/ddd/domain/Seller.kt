package ru.chernyshoff.ddd.domain

import java.util.*

data class Seller(
    val id: UUID? = null,
    val name: String,
    val goods: List<Good> = listOf()
)
