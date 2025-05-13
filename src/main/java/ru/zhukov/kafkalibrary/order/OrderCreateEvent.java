package ru.zhukov.kafkalibrary.order;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;
import java.util.UUID;

import static ru.zhukov.kafkalibrary.order.OrderEventType.ORDER_CREATE;

@Getter
@Setter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class OrderCreateEvent extends OrderEvent {
    public String customerName;
    public Instant orderDateCreated;
    public int itemAmount;

    @Builder
    public OrderCreateEvent(UUID orderId,
                            String customerName,
                            Instant orderDateCreated,
                            int itemAmount) {
        super(ORDER_CREATE, orderId);
        this.customerName = customerName;
        this.orderDateCreated = orderDateCreated;
        this.itemAmount = itemAmount;
    }

    public OrderCreateEvent() {
        super(ORDER_CREATE);
    }
}
