package ru.chernyshoff.ddd.service

import ru.chernyshoff.ddd.domain.Cart
import java.util.*

interface CartService {

    fun save(cart: Cart): UUID

    fun get(id: UUID): Cart

    fun delete(id: UUID)
}