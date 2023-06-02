package com.example.springevents.events

import com.example.springevents.controller.request.PostOrderRequest
import org.springframework.context.ApplicationEvent

class OrderEvent(
    source: Any,
    val order: PostOrderRequest
) : ApplicationEvent(source)