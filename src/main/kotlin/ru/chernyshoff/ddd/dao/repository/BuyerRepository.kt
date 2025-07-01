package ru.chernyshoff.ddd.dao.repository

import ru.chernyshoff.ddd.domain.Buyer
import java.util.UUID

interface BuyerRepository {

    fun insert(buyer: Buyer): UUID

    fun find(id: UUID): Buyer?

    fun update(buyer: Buyer)

    fun delete(id: UUID)
}