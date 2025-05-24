package ru.zhukov.kafkalibrary.child;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;
import java.util.UUID;

import static ru.zhukov.kafkalibrary.child.ChildEventType.CHILD_CREATE;

@Getter
@Setter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ChildCreateEvent extends ChildEvent {
    private String firstName;
    private String lastName;
    private String middleName;
    private Instant birthday;

    @Builder
    public ChildCreateEvent(UUID orderId,
                            String firstName,
                            String lastName,
                            String middleName,
                            Instant birthday) {
        super(CHILD_CREATE, orderId);
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.birthday = birthday;
    }

    public ChildCreateEvent() {
        super(CHILD_CREATE);
    }
}