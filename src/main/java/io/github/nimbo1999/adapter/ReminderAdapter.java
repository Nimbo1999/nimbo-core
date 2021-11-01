package io.github.nimbo1999.adapter;

import java.time.Instant;
import java.util.UUID;

import io.github.nimbo1999.controller.dto.CreateReminderVO;
import io.github.nimbo1999.domain.entity.Reminder;
import io.github.nimbo1999.utils.InstantUtils;

public class ReminderAdapter {
    
    public static Reminder createReminderVOToEntity(CreateReminderVO reminderVO) {
        Instant instantNow = InstantUtils.intantNow();
        return Reminder.builder()
            .id(UUID.randomUUID())
            .title(reminderVO.getTitle())
            .content(reminderVO.getContent())
            .created_at(instantNow)
            .updated_at(instantNow)
            .build();
    }

}
