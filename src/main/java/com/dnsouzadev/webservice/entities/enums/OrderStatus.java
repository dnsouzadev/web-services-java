package com.dnsouzadev.webservice.entities.enums;

import com.dnsouzadev.webservice.entities.Order;

public enum OrderStatus {
    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private final int code;

    private OrderStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    @org.jetbrains.annotations.NotNull
    public static OrderStatus valueOf(int code) throws IllegalAccessException {
        for (OrderStatus value : OrderStatus.values()) {
            if (value.getCode() == code) {
                return value;
            }
        }
        throw new IllegalAccessException("Invalid OrderStatus code");
    }
}
