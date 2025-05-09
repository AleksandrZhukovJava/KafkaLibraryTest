package ru.zhukov.kafkalibrary.order;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import ru.zhukov.kafkalibrary.core.KafkaEvent;

import java.time.Instant;
import java.util.UUID;

import static ru.zhukov.kafkalibrary.core.KafkaEventType.ORDER;

@Getter
@Setter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class OrderKafkaEvent extends KafkaEvent {
    public String customerName;
    public Instant orderDateCreated;
    public int itemAmount;

    @Builder
    public OrderKafkaEvent(UUID aggregateId,
                           String customerName,
                           Instant orderDateCreated,
                           int itemAmount) {
        super(ORDER, aggregateId);
        this.customerName = customerName;
        this.orderDateCreated = orderDateCreated;
        this.itemAmount = itemAmount;
    }
}
