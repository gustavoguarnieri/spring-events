package com.example.springevents.events.publisher

import com.example.springevents.events.OrderEvent
import com.example.springevents.controller.request.PostOrderRequest
import mu.two.KotlinLogging
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Component

@Component
class MessagePublisher(private val applicationEventPublisher: ApplicationEventPublisher) {

    private val log = KotlinLogging.logger {}

    fun sendOrderMessage(postOrderRequest: PostOrderRequest) {
        applicationEventPublisher.publishEvent(OrderEvent(this, postOrderRequest)).also {
            log.info { "Publicando evento=OrderEvent, postOrderRequest=$postOrderRequest" }
        }
    }
}
