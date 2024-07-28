package com.example.bank.trade.service

import com.example.bank.trade.repository.TradeRepository
import org.springframework.stereotype.Service

@Service
class TradeService(
        private val tradeRepository: TradeRepository
) {
}
