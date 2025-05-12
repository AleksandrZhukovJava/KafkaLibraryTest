package ru.zhukov.kafkalibrary.core;

import lombok.Data;

import java.time.Instant;
import java.util.UUID;

@Data
public abstract class KafkaEvent<T> {
    private final T type;
    private UUID id;
    private Instant dateCreated;

    public KafkaEvent(T type) {
        this.type = type;
        this.id = UUID.randomUUID();
        this.dateCreated = Instant.now();
    }
}
