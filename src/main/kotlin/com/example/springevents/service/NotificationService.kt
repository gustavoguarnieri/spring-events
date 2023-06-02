package com.example.springevents.service

import mu.two.KotlinLogging
import org.springframework.stereotype.Service

@Service
class NotificationService {

    private val log = KotlinLogging.logger {}

    companion object {
        const val SLEEP_TIME_IN_MILLI = 10000L
    }

    fun createNotification(message: Any) {
        log.info { "Iniciando simulação de notificação lenta" }
        Thread.sleep(SLEEP_TIME_IN_MILLI).also {
            log.info { "Finalizado simulação de notificação lenta $SLEEP_TIME_IN_MILLI milissegundos" }
        }
    }
}
