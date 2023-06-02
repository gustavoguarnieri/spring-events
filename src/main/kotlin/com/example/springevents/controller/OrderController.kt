package com.example.springevents.controller

import com.example.springevents.controller.request.PostOrderRequest
import com.example.springevents.service.OrderService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RequestBody

@RestController
@RequestMapping("/v1/orders")
class OrderController(private val orderService: OrderService) {

    @PostMapping("/sync")
    @ResponseStatus(HttpStatus.CREATED)
    fun createSyncOrder(@RequestBody request: PostOrderRequest) {
        orderService.createOrderSync(request)
    }

    @PostMapping("/async")
    @ResponseStatus(HttpStatus.ACCEPTED)
    fun createAsyncOrder(@RequestBody request: PostOrderRequest) {
        orderService.createOrderAsync(request)
    }
}
