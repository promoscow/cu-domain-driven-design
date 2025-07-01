package ru.chernyshoff.ddd.service

import ru.chernyshoff.ddd.domain.Good
import java.util.UUID

interface GoodService {

    fun create(good: Good): UUID

    fun update(good: Good)

    fun get(id: UUID): Good

    fun getAllBySellerId(sellerId: UUID): List<Good>

    fun getAllByCartId(cartId: UUID): List<Good>

    fun delete(id: UUID)

    fun deleteAll(sellerId: UUID)
}