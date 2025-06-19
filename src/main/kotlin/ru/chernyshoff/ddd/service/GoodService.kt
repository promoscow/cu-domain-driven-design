package ru.chernyshoff.ddd.service

import ru.chernyshoff.ddd.domain.Good
import java.util.*

interface GoodService {

    fun save(id: Good): UUID

    fun update(good: Good)

    fun get(id: UUID): Good

    fun getAll(sellerId: UUID): List<Good>

    fun delete(id: UUID)

    fun deleteAll(sellerId: UUID)
}