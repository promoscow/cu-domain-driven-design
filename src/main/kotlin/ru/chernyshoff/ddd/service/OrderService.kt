package ru.chernyshoff.ddd.service

import ru.chernyshoff.ddd.domain.Order
import java.util.*

interface OrderService {

    fun save(order: Order): UUID

    fun update(order: Order)

    fun get(id: UUID): Order

    fun getAll(buyerId: UUID): List<Order>

    fun deleteAll(buyerId: UUID)
}