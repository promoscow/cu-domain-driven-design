package ru.chernyshoff.ddd.repository

import ru.chernyshoff.ddd.domain.Seller
import java.util.UUID

interface SellerRepository {

    fun insert(seller: Seller): UUID

    fun update(seller: Seller)

    fun find(id: UUID): Seller?

    fun delete(id: UUID)
}