package com.example.kotlincourse.repository

import com.example.kotlincourse.models.Graduate
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface GraduateRepository : JpaRepository<Graduate, Long>