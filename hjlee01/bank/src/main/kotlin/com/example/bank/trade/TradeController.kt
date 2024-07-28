package com.example.bank.trade

import com.example.bank.trade.service.TradeService
import org.springframework.web.bind.annotation.RestController

@RestController
class TradeController(
        private val tradeService: TradeService
) {
}
