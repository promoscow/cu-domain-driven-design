package ru.chernyshoff.ddd.service

import ru.chernyshoff.ddd.domain.Cart
import java.util.UUID

interface CartService {

    fun save(cart: Cart): UUID

    fun getByBuyerId(id: UUID): Cart

    fun deleteByBuyerId(buyerId: UUID)
}