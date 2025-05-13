package ru.zhukov.kafkalibrary.order;

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
public class OrderEvent extends KafkaEvent<OrderEventType> {
    public UUID orderId;

    public OrderEvent(OrderEventType type, UUID orderId) {
        super(type);
        this.orderId = orderId;
    }

    public OrderEvent(OrderEventType type) {
        super(type);
    }
}
