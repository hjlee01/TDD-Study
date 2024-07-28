package com.example.bank.request.service

import com.example.bank.entity.Request
import com.example.bank.enum.RequestStatus
import com.example.bank.request.dto.DetailDto
import com.example.bank.request.dto.RequestDto
import com.example.bank.request.repository.RequestRepository
import org.springframework.stereotype.Service

@Service
class RequestService(
        private val requestRepository: RequestRepository,
        private val detailService: DetailService
) {
    /**
     * 지불 요청
     */
    fun request(detailDtoList: List<DetailDto>): RequestDto? {
        // 지불 기본 정보 저장
        val request = requestRepository.save(detailDtoList.get(0).totalAmount?.let {
            Request(
                amount = it,
                balance = it,
                status = RequestStatus.요청.code
        )
        })

        // 지불 상세 저장
        if (request.seq != null) {
            detailDtoList.forEach {
                detailService.save(it)
            }

            return RequestDto(
                    seq = request.seq!!,
                    amount = request.amount,
                    balance = request.balance,
                    status = request.status,
                    details = detailDtoList
            )
        }

        return null
    }
}