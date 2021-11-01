package io.github.nimbo1999.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.nimbo1999.controller.dto.CreateReminderVO;
import io.github.nimbo1999.domain.entity.Reminder;
import io.github.nimbo1999.service.ReminderService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/reminder")
public class ReminderController {

    private ReminderService service;

    @PostMapping
    public Reminder postReminder(@RequestBody @Valid CreateReminderVO reminder) {
        return service.saveReminder(reminder);
    }

    @GetMapping
    public List<Reminder> listReminders() {
        return service.listReminders();
    }

}
