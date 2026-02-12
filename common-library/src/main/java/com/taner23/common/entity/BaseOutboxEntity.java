package com.taner23.common.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@MappedSuperclass
@Data
public class BaseOutboxEntity {

    @Id
    private UUID id = UUID.randomUUID();

    private String aggregateType;
    private String aggregateId;
    private String eventType;
    @Column(columnDefinition = "TEXT")
    private String payload;
    private LocalDateTime createdAt = LocalDateTime.now();
    private boolean processed = false;
}
