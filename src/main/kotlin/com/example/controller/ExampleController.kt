package com.example.controller

import com.example.dtos.ExampleDto
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post

@Controller
class ExampleController {

    @Post
    fun examplePost(@Body exampleDto: ExampleDto): ExampleDto {
        println(exampleDto)
        return exampleDto
    }
}