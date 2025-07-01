package ru.chernyshoff.ddd.service

import ru.chernyshoff.ddd.domain.Cart
import java.util.UUID

/**
 * Сервис Корзины
 */
interface CartService {

    /**
     * Создать корзину
     *
     * @param cart - корзина для создания
     * @return идентификатор созданной корзины
     */
    fun create(cart: Cart): UUID

    /**
     * Получить корзину по идентификатору
     *
     * @param id - идентификатор корзины
     * @return корзина
     */
    fun get(id: UUID): Cart

    /**
     * Удалить корзину для покупателя
     *
     * @param buyerId - идентификатор покупателя
     */
    fun delete(buyerId: UUID)
}