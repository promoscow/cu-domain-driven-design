package ru.chernyshoff.ddd

import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component
import ru.chernyshoff.ddd.domain.Buyer
import java.util.UUID

@Component
class CommonInit {

    @Bean
    protected fun buyerMockStorage(): MutableMap<UUID, Buyer> = mutableMapOf()
}