package ru.zhukov.kafkalibrary.child;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import ru.zhukov.kafkalibrary.core.KafkaEvent;

import java.util.UUID;

@Getter
@Setter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ChildEvent extends KafkaEvent<ChildEventType> {
    public UUID childId;

    public ChildEvent(ChildEventType type, UUID childId) {
        super(type);
        this.childId = childId;
    }

    public ChildEvent(ChildEventType type) {
        super(type);
    }
}
