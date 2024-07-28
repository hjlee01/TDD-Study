package com.example.bank.request

import com.example.bank.entity.Request
import com.example.bank.enum.DetailStatus
import com.example.bank.enum.RequestStatus
import com.example.bank.request.dto.DetailDto
import com.example.bank.request.repository.RequestRepository
import com.example.bank.request.service.DetailService
import com.example.bank.request.service.RequestService
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.mockk
import org.hibernate.internal.util.collections.CollectionHelper.listOf

class RequestTest: BehaviorSpec({
    lateinit var requestRepository: RequestRepository
    lateinit var detailService: DetailService
    lateinit var requestService: RequestService

    val request = Request(1L, 10000, 10000, RequestStatus.요청.code)

    given("지불 요청할 때") {
        requestRepository = mockk()
        requestService = RequestService(requestRepository, detailService)

        var detailList = listOf(
                DetailDto("hjlee01", 1L, 10000, 5000, DetailStatus.요청.code),
                DetailDto("ch200203", 1L, 10000, 5000, DetailStatus.요청.code)
        )

        `when`("저장 시") {
            every { requestRepository.save(request) } returns request

            then("상태는 요청, 요청금은 잔액과 동일") {
                val response = requestService.request(detailList)

                if (response != null) {
                    response.status shouldBe RequestStatus.요청.code
                    request.amount shouldBe request.balance
                }
            }
        }
    }
})
