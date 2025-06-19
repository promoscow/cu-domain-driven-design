package ru.chernyshoff.ddd.service

import ru.chernyshoff.ddd.domain.Buyer
import java.util.UUID

interface BuyerService {

    fun save(buyer: Buyer): UUID

    fun update(buyer: Buyer)

    fun get(id: UUID): Buyer

    fun delete(id: UUID)
}