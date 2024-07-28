package com.example.bank.trade.repository

import com.example.bank.trade.entity.Trade
import com.example.bank.trade.entity.TradePk
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TradeRepository: JpaRepository<Trade, TradePk> {
}
