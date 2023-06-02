package com.example.springevents.service

import mu.two.KotlinLogging
import org.springframework.stereotype.Service

@Service
class BackupService {

    private val log = KotlinLogging.logger {}

    companion object {
        const val SLEEP_TIME_IN_MILLI = 20000L
    }

    fun createBackup(message: Any) {
        log.info { "Iniciando simulação de backup lenta" }
        Thread.sleep(SLEEP_TIME_IN_MILLI).also {
            log.info { "Finalizado simulação de backup lenta $SLEEP_TIME_IN_MILLI milissegundos" }
        }
    }
}
