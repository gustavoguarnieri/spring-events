package com.example.springevents.events.listener

import com.example.springevents.events.OrderEvent
import com.example.springevents.service.BackupService
import mu.two.KotlinLogging
import org.springframework.context.event.EventListener
import org.springframework.scheduling.annotation.Async
import org.springframework.stereotype.Component

@Component
class OrderBackupListener(private val backupService: BackupService) {

    private val log = KotlinLogging.logger {}

    @Async
    @EventListener
    fun listen(orderEvent: OrderEvent) {
        log.info { "Recebido orderEvent=${orderEvent.order} para criar backup" }
        backupService.createBackup(orderEvent.order)
    }
}
