package ru.chernyshoff.ddd.repository

import ru.chernyshoff.ddd.domain.Cart
import java.util.UUID

interface CartRepository {

    fun insert(cart: Cart): UUID

    fun findByBuyerId(buyerId: UUID): Cart?

    fun deleteByBuyerId(buyerId: UUID)
}