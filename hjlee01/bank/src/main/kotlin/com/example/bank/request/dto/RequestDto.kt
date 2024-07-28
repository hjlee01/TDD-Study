package com.example.bank.request.dto

/**
 * 지불 요청 DTO
 */
data class RequestDto(
        /**
         * 지불 순번
         */
        val seq: Long,
        /**
         * 지불 총 금액
         */
        val amount: Long,
        /**
         * 잔액
         */
        val balance: Long,
        /**
         * 지불 상태
         */
        val status: String,
        /**
         * 지불 상세 내역
         */
        val details: List<DetailDto>
)
