package com.example.kotlincourse.service

import com.example.kotlincourse.models.Graduate

interface GraduateService {

    fun getAllGraduates():List<Graduate>

    fun createGraduate(graduate: Graduate):Graduate
}