package io.github.nimbo1999.service;

import java.util.List;

import org.springframework.stereotype.Service;

import io.github.nimbo1999.adapter.ReminderAdapter;
import io.github.nimbo1999.controller.dto.CreateReminderVO;
import io.github.nimbo1999.domain.entity.Reminder;
import io.github.nimbo1999.domain.repository.ReminderRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ReminderService {
    
    private ReminderRepository repository;

    public Reminder saveReminder(CreateReminderVO reminderVo) {
        Reminder reminder = ReminderAdapter.createReminderVOToEntity(reminderVo);
        return repository.save(reminder);
    }

    public List<Reminder> listReminders() {
        return repository.findAll();
    }

}
