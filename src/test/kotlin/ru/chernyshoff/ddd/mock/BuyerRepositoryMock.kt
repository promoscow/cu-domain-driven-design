package ru.chernyshoff.ddd.mock

import org.springframework.stereotype.Component
import ru.chernyshoff.ddd.dao.repository.BuyerRepository
import ru.chernyshoff.ddd.domain.Buyer
import java.util.UUID

@Component
class BuyerRepositoryMock(
    private val buyerMockStorage: MutableMap<UUID, Buyer>
) : BuyerRepository {

    override fun insert(buyer: Buyer): UUID =
        UUID.randomUUID()
            .let { buyer.copy(id = it) }
            .also { buyerMockStorage[it.id!!] = it }
            .id!!

    override fun find(id: UUID): Buyer? = buyerMockStorage[id]

    override fun update(buyer: Buyer) {
        buyerMockStorage[buyer.id!!] = buyer
    }

    override fun delete(id: UUID) {
        buyerMockStorage.remove(id)
    }
}