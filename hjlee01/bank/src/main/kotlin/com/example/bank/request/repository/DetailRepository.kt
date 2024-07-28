package com.example.bank.request.repository

import com.example.bank.entity.Detail
import com.example.bank.entity.DetailPk
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface DetailRepository: JpaRepository<Detail, DetailPk> {
    fun findByRequestNo(requestNo: Long): List<Detail>
}