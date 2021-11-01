package io.github.nimbo1999.domain.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.nimbo1999.domain.entity.Reminder;

@Repository
public interface ReminderRepository extends JpaRepository<Reminder, UUID> {
}
