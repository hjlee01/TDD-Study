package com.example.bank.entity

import jakarta.persistence.Column
import java.io.Serializable

data class DetailPk(
        @Column(name = "id")
        val id: String = "",
        @Column(name = "request_no")
        val requestNo: Long = 0
) : Serializable