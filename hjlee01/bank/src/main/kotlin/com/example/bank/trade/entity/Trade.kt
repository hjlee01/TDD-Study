package com.example.bank.trade.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.IdClass
import jakarta.persistence.Table

@IdClass(TradePk::class)
@Entity
@Table(name = "trade")
class Trade(
        /**
         * 아이디
         */
        @Id
        val id: String,
        /**
         * 거래일
         */
        @Id
        val ymd: String,
        /**
         * 순번
         */
        @Id
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
) {
}
