package com.example.bank.entity

import jakarta.persistence.*

/**
 * 지불 상세
 */
@IdClass(DetailPk::class)
@Entity
@Table(name = "datail")
class Detail(
        /**
         * 아이디
         */
        @Id
        @Column(name = "id")
        val id: String,
        /**
         * 요청 번호
         */
        @Id
        @Column(name = "request_no")
        val requestNo: Long,
        /**
         * 금액
         */
        val amount: Long,
        /**
         * 상태
         */
        val status: String
)