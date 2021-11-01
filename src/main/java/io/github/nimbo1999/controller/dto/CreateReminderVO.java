package io.github.nimbo1999.controller.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CreateReminderVO {
    private String title; 
    private String content; 
}
