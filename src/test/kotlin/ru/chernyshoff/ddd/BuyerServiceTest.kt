package ru.chernyshoff.ddd

import org.apache.commons.lang3.RandomStringUtils
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertNotNull
import org.junit.jupiter.api.assertThrows
import org.springframework.beans.factory.annotation.Autowired
import ru.chernyshoff.ddd.service.BuyerService
import java.util.UUID
import kotlin.test.assertEquals

class BuyerServiceTest : CommonContext() {

    @Autowired
    private lateinit var service: BuyerService

    @Test
    fun create() {
        //given
        val buyer = buyerGenerator.generate()
        //when
        val savedId = service.create(buyer)
        //then
        assertNotNull(savedId)
    }

    @Test
    fun create_nameSaved() {
        //given
        val buyer = buyerGenerator.generate()
        //when
        val savedId = service.create(buyer)
        //then
        service.get(savedId)
            .also {
                assertEquals(buyer.userId, it.userId)
            }
    }

    @Test
    fun get() {
        //given
        val buyer = buyerGenerator.create()
        //when
        val found = service.get(buyer.id!!)
        //then
        assertNotNull(found)
        assertEquals(buyer.id, found.id)
    }

    @Test
    fun get_notFound() {
        //given
        buyerGenerator.create()
        val fakeId = UUID.randomUUID()
        //when
        //then
        assertThrows<IllegalStateException> { service.get(fakeId) }
    }

    @Test
    fun update() {
        //given
        val buyer = buyerGenerator.create()
        val newName = RandomStringUtils.secure().nextAlphanumeric(16)
        val buyerToUpdate = buyer.copy(name = newName)
        //when
        service.update(buyerToUpdate)
        //then
        val updated = service.get(buyer.id!!)
        assertEquals(newName, updated.name)
    }

    @Test
    fun delete() {
        //given
        val buyer = buyerGenerator.create()
        //when
        service.delete(buyer.id!!)
        //then
        assertThrows<IllegalStateException> { service.get(buyer.id!!) }
    }
}