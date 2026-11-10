package com.mt03062.foodapp.order;

import java.util.List;

public record CreateOrderRequest(Long customerId, Long restaurantId, List<Line> items) {
    public record Line(Long itemId, Integer qty) {
    }
}
