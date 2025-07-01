package ru.chernyshoff.ddd.service

import ru.chernyshoff.ddd.domain.Buyer
import java.util.UUID

/**
 * Сервис покупателя
 */
interface BuyerService {

    /**
     * Создание нового покупателя
     *
     * @param buyer - новый покупатель
     * @return идентификатор покупателя
     */
    fun create(buyer: Buyer): UUID

    /**
     * Обновление покупателя
     *
     * @param buyer - покупатель для обновления
     */
    fun update(buyer: Buyer)

    /**
     * Получение покупателя по идентификатору
     *
     * @param id - идентификатор покупателя
     * @return покупатель
     */
    fun get(id: UUID): Buyer

    /**
     * Удаление покупателя
     *
     * @param id - идентификатор покупателя
     */
    fun delete(id: UUID)
}