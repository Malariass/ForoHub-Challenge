package com.lucio.forohub.domain.courses;

import jakarta.validation.constraints.NotBlank;

public record CourseForm(
        @NotBlank
        String name,
        @NotBlank
        String category
) {
}
