package com.example.bank.request

import com.example.bank.entity.Detail
import com.example.bank.enum.DetailStatus
import com.example.bank.request.mapper.DetailMapper
import com.example.bank.request.repository.DetailRepository
import com.example.bank.request.service.DetailService
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.mockk
import java.util.Optional
import java.util.NoSuchElementException

class DetailTest: BehaviorSpec ({
    lateinit var detailRepository: DetailRepository
    lateinit var detailMapper: DetailMapper
    lateinit var detailService: DetailService

    given("지불 상세 저장 시") {
        `when`("") {
            then("") {

            }
        }
    }

    given("지불 상세 변경 시") {
        detailRepository = mockk()
        detailService = DetailService(detailRepository, detailMapper)

        val detail = Detail("hjlee01", 1, 10000, DetailStatus.요청.code)

        `when`("데이터가 있는 경우") {
            every { detailRepository.findById(any()) } returns Optional.of(detail)

            then("요청 상세 상태 값 완료") {
                val response = detailService.update("hjlee01", 1)

                response.status shouldBe DetailStatus.완료.code
            }
        }
        
        `when`("데이터가 없는 경우") {
            every { detailRepository.findById(any()) } returns Optional.empty()

            then("오류 발생") {
                val exception = shouldThrow<NoSuchElementException> {
                    detailService.update("herbtea30", 1)
                }

                exception.message shouldBe "요청 상세 정보가 없습니다."
            }
        }
    }

    given("지불 상세 내역 조회 시") {
        `when`("") {
            then("") {

            }
        }
    }
})
