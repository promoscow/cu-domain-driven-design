package ru.chernyshoff.ddd.generator

import org.apache.commons.lang3.RandomStringUtils
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import ru.chernyshoff.ddd.dao.repository.BuyerRepository
import ru.chernyshoff.ddd.domain.Buyer
import java.util.UUID

@Component
class BuyerGenerator {

    @Autowired
    private lateinit var repository: BuyerRepository

    fun generate(userId: UUID? = null): Buyer = Buyer(
        userId = userId ?: UUID.randomUUID(),
        name = RandomStringUtils.secure().nextAlphanumeric(16)
    )

    fun create(userId: UUID? = null): Buyer =
        generate(userId)
            .let { generated ->
                val savedId = repository.insert(generated)
                generated.copy(id = savedId)
            }
}