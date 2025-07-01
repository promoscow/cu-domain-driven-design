package ru.chernyshoff.ddd.service

import ru.chernyshoff.ddd.domain.Order
import java.util.UUID

interface OrderService {

    fun create(order: Order): UUID

    fun update(order: Order)

    fun get(id: UUID): Order

    fun getAll(buyerId: UUID): List<Order>

    fun delete(id: UUID)

    fun deleteAll(buyerId: UUID)
}