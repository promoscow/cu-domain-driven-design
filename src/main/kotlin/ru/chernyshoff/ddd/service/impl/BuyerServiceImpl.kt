package ru.chernyshoff.ddd.service.impl

import org.springframework.stereotype.Service
import ru.chernyshoff.ddd.dao.repository.BuyerRepository
import ru.chernyshoff.ddd.domain.Buyer
import ru.chernyshoff.ddd.service.BuyerService
import java.util.UUID

@Service
class BuyerServiceImpl(
    private val repository: BuyerRepository
) : BuyerService {

    override fun create(buyer: Buyer): UUID = repository.insert(buyer)

    override fun update(buyer: Buyer) {
        repository.update(buyer)
    }

    override fun get(id: UUID): Buyer =
        repository.find(id) ?: throw IllegalStateException("Buyer not found by id: $id")

    override fun delete(id: UUID) {
        repository.delete(id)
    }
}