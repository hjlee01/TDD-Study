package com.example.bank.request.dto

/**
 * 지불 상세 DTO
 */
data class DetailDto(
        /**
         * 아이디
         */
        val id: String,
        /**
         * 요청 번호
         */
        val requestNo: Long,
        /**
         * 지불 총 금액
         */
        val totalAmount: Long?,
        /**
         * 금액
         */
        val amount: Long,
        /**
         * 상태
         */
        val status: String
)
