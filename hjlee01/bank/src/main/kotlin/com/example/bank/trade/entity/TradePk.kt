package com.example.bank.trade.entity

import jakarta.persistence.Column
import java.io.Serializable

data class TradePk(
        /**
         * 아이디
         */
        @Column(name = "id")
        val id: String = "",
        /**
         * 거래일
         */
        @Column(name = "ymd")
        val ymd: String = "",
        /**
         * 순번
         */
        @Column(name = "seq")
        val seq: Int = 0
) : Serializable
