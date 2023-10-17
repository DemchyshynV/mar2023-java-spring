package com.example.mar2023spring.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CarDto {
    private int id;

    @NotBlank(message = "model required")
    @Size(min = 2, max = 20, message = "min: {min} max: {max} characters")
    private String model;

    @Min(value = 56, message = "min power: {value}")
    private int power;

    @NotBlank(message = "model required")
    @Size(min = 2, max = 20, message = "min: {min} max: {max} characters")
    private String producer;
}
