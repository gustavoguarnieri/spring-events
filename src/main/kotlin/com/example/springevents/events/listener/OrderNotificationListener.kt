package com.example.springevents.events.listener

import com.example.springevents.events.OrderEvent
import com.example.springevents.service.NotificationService
import mu.two.KotlinLogging
import org.springframework.context.event.EventListener
import org.springframework.scheduling.annotation.Async
import org.springframework.stereotype.Component

@Component
class OrderNotificationListener(private val notificationService: NotificationService) {

    private val log = KotlinLogging.logger {}

    @Async
    @EventListener
    fun listen(orderEvent: OrderEvent) {
        log.info { "Recebido orderEvent=${orderEvent.order} para notificar" }
        notificationService.createNotification(orderEvent.order)
    }
}
