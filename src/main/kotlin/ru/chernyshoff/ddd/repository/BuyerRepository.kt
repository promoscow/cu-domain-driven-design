package ru.chernyshoff.ddd.repository

import ru.chernyshoff.ddd.domain.Buyer
import java.util.UUID

interface BuyerRepository {

    fun insert(buyer: Buyer): UUID

    fun update(buyer: Buyer)

    fun find(id: UUID): Buyer?

    fun delete(id: UUID)
}