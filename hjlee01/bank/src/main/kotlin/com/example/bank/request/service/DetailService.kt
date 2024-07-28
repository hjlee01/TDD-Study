package com.example.bank.request.service

import com.example.bank.entity.Detail
import com.example.bank.entity.DetailPk
import com.example.bank.enum.DetailStatus
import com.example.bank.request.dto.DetailDto
import com.example.bank.request.mapper.DetailMapper
import com.example.bank.request.repository.DetailRepository
import org.springframework.stereotype.Service
import java.util.NoSuchElementException

@Service
class DetailService(
        private val detailRepository: DetailRepository,
        private val detailMapper: DetailMapper
) {
    fun save(detailDto: DetailDto) {
        val detail = Detail(
                id = detailDto.id,
                requestNo = detailDto.requestNo,
                amount = detailDto.amount,
                status = DetailStatus.요청.code
        )

        detailRepository.save(detail)
    }

    fun update(id: String, requstNo: Long) {
        val detail = detailRepository.findById(DetailPk(id, requstNo))
                .orElseThrow { NoSuchElementException("요청 상세 정보가 없습니다.") }

        detailRepository.save(Detail(
                id = detail.id,
                requestNo = detail.requestNo,
                amount = detail.amount,
                status = DetailStatus.완료.code
        ))
    }

    fun selectByRequestNo(requstNo: Long): List<DetailDto> {
        return detailRepository.findByRequestNo(requstNo).stream()
                .map { detailMapper.toDto(it) }
                .toList()
    }
}
