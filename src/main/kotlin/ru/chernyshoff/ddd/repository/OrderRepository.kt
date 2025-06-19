package ru.chernyshoff.ddd.repository

import ru.chernyshoff.ddd.domain.Order
import java.util.UUID

interface OrderRepository {

    fun insert(order: Order): UUID

    fun update(order: Order)

    fun find(id: UUID): Order?

    fun findAll(buyerId: UUID): List<Order>

    fun deleteAll(buyerId: UUID)
}