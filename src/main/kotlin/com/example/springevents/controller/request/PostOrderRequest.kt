package com.example.springevents.controller.request

import com.fasterxml.jackson.annotation.JsonAlias
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Positive
import java.math.BigDecimal

data class PostOrderRequest(
    @field:NotNull
    @field:Positive
    @JsonAlias("customer_id")
    val customerId: Int,

    @field:NotNull
    @field:Positive
    @JsonAlias("product_id")
    val productId: Int,

    @field:NotNull
    @field:Positive
    val quantity: Int,

    @field:NotNull
    @field:Positive
    val amount: BigDecimal
)
