package com.example.bank.request.mapper

import com.example.bank.entity.Detail
import com.example.bank.request.dto.DetailDto
import org.mapstruct.Mapper
import org.mapstruct.MappingConstants.ComponentModel.SPRING
import org.mapstruct.ReportingPolicy

@Mapper(componentModel = SPRING, unmappedTargetPolicy = ReportingPolicy.IGNORE)
interface DetailMapper {
    fun toDto(detail: Detail): DetailDto
}