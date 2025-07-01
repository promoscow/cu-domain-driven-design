package ru.chernyshoff.ddd

import org.junit.jupiter.api.AfterEach
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import ru.chernyshoff.ddd.domain.Buyer
import ru.chernyshoff.ddd.generator.BuyerGenerator
import java.util.UUID

@SpringBootTest
class CommonContext {

    @Autowired
    protected lateinit var buyerGenerator: BuyerGenerator

    @Autowired
    private lateinit var buyerMockStorage: MutableMap<UUID, Buyer>

    @AfterEach
    fun tearDown() {
        buyerMockStorage.clear()
    }
}
