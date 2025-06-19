package ru.chernyshoff.ddd.repository

import ru.chernyshoff.ddd.domain.Good
import java.util.UUID

interface GoodRepository {

    fun insert(id: Good): UUID

    fun update(good: Good)

    fun find(id: UUID): Good?

    fun findAll(sellerId: UUID): List<Good>

    fun delete(id: UUID)

    fun deleteAll(sellerId: UUID)
}