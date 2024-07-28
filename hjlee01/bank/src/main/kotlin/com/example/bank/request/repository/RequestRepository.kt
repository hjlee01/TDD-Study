package com.example.bank.request.repository

import com.example.bank.entity.Request
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface RequestRepository: JpaRepository<Request, Long> {
}