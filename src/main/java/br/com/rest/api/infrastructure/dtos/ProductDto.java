package br.com.rest.api.infrastructure.dtos;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

/**
 * ProductDto
 */
public record ProductDto(@NotBlank String name, String description, @NotNull BigDecimal value) {
}
