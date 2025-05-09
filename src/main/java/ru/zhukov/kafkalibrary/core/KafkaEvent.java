package ru.zhukov.kafkalibrary.core;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class KafkaEvent {
    private KafkaEventType type;
    private UUID aggregateId;
    private Instant dateCreated;

    public KafkaEvent(KafkaEventType type, UUID aggregateId) {
        this.type = type;
        this.aggregateId = aggregateId;
        this.dateCreated = Instant.now();
    }
}
