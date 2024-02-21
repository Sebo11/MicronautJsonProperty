package com.example.dtos

import com.fasterxml.jackson.annotation.JsonProperty
import io.micronaut.serde.annotation.Serdeable

@Serdeable
data class ExampleDto(
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private val readElement: String,
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private val writeElement: String
)
