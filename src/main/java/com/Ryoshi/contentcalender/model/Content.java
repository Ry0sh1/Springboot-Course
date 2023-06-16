package com.Ryoshi.contentcalender.model;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

public record Content(

        @Id
        Integer id,
        @NotBlank
        String title,
        String desc,
        Status status,
        Type content_type,
        LocalDateTime date_created,
        LocalDateTime date_updated,
        String url
) {
}
