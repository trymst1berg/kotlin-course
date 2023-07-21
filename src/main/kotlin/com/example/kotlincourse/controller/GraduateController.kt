package com.example.kotlincourse.controller

import com.example.kotlincourse.models.Graduate
import com.example.kotlincourse.service.GraduateService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class GraduateController(private val graduateService: GraduateService) {

    @GetMapping("/graduates")
    fun getAllGraduates(): ResponseEntity<List<Graduate>> {
        return ResponseEntity(graduateService.getAllGraduates(), HttpStatus.OK)
    }

    @PostMapping("/graduate")
    fun createGraduate(@RequestBody graduate: Graduate): ResponseEntity<Graduate> {
        return ResponseEntity(graduateService.createGraduate(graduate), HttpStatus.CREATED)
    }
}
