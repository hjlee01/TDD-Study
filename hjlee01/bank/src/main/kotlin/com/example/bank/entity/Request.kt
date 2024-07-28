package com.example.bank.entity

import jakarta.persistence.*

/**
 * 지불 요청
 */
@Entity
@Table(name = "request")
class Request(
        /**
         * 지불 순번
         */
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val seq: Long?,
        /**
         * 지불 총 금액
         */
        val amount: Long,
        /**
         * 지불 잔액
         */
        val balance: Long,
        /**
         * 지불 상태
         */
        val status: String
)