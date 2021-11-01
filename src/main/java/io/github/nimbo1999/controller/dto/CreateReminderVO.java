package io.github.nimbo1999.controller.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CreateReminderVO {
    @NotEmpty(message = "Field title must not be empty")
    @Size(min = 5, max = 100, message = "Field title must have at least 5 characters and maximum of 100 characteres")
    private String title;
    @NotEmpty(message = "Field content must not be empty")
    private String content;
}
