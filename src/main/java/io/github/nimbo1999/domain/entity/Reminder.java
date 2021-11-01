package io.github.nimbo1999.domain.entity;

import java.time.Instant;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "reminder")
public class Reminder {
    @Id
    @Type(type = "org.hibernate.type.PostgresUUIDType")
    private UUID id;
    @Column
    private String title;
    @Column
    private String content;
    @Column
    private Instant created_at;
    @Column
    private Instant updated_at;
}
