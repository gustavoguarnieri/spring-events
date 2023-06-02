package com.example.springevents.service

import com.example.springevents.controller.request.PostOrderRequest
import com.example.springevents.events.publisher.MessagePublisher
import org.springframework.stereotype.Service

@Service
class OrderService(
    private val notificationService: NotificationService,
    private val backupService: BackupService,
    private val messagePublisher: MessagePublisher
) {

    fun createOrderSync(orderRequest: PostOrderRequest) {
        notificationService.createNotification(orderRequest)
        backupService.createBackup(orderRequest)
    }

    fun createOrderAsync(orderRequest: PostOrderRequest) {
        messagePublisher.sendOrderMessage(orderRequest)
    }
}
