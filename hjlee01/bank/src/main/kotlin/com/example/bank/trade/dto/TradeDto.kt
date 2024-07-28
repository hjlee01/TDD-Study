package com.example.bank.trade.dto

data class TradeDto(
        /**
         * 아이디
         */
        val id: String,
        /**
         * 거래일
         */
        val ymd: String,
        /**
         * 순번
         */
        val seq: Integer,
        /**
         * 상태
         */
        val status: String,
        /**
         * 거래금액
         */
        val amount: Long,
        /**
         * 거래잔액
         */
        val balance: Long
)
