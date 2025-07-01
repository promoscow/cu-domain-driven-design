package ru.chernyshoff.ddd.service

import ru.chernyshoff.ddd.domain.Seller
import java.util.UUID

interface SellerService {

    fun create(seller: Seller): UUID

    fun update(seller: Seller)

    fun get(id: UUID): Seller

    fun delete(id: UUID)
}