package com.example.kotlincourse.service

import com.example.kotlincourse.models.Graduate
import com.example.kotlincourse.repository.GraduateRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class GraduateServiceImpl :GraduateService {

    @Autowired
    lateinit var graduateRepository: GraduateRepository

    override fun getAllGraduates(): List<Graduate> {
        return graduateRepository.findAll()
    }

    override fun createGraduate(graduate: Graduate):Graduate {
        return graduateRepository.save(graduate)
    }
}