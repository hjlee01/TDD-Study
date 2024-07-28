package com.example.bank.request

import com.example.bank.request.dto.DetailDto
import com.example.bank.request.service.RequestService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/request")
class RequestController(
        private val pRequestService: RequestService
) {
    fun request(detailList: List<DetailDto>): ResponseEntity<String> {
        pRequestService.request(detailList)
        return ResponseEntity.ok("지불 요청 성공")
    }
}