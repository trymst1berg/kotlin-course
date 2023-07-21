package com.example.kotlincourse.models

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Graduate(
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    val id: Long = -1,
    val name: String = ""
)