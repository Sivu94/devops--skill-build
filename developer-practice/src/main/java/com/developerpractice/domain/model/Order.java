package com.developerpractice.domain.model;
import java.util.List;



public class Order {
    private final List<OrderItem> orderItems;

    public Order(List<OrderItem> orderItems) {
        if(orderItems == null || orderItems.isEmpty()) {
            throw new IllegalArgumentException("Order must contain at least one item.");
        }
        
        this.orderItems = orderItems;
    }
    public BigDecimal totalCost() {
        BigDecimal totalCost = BigDecimal.ZERO;

        for (OrderItem orderItem : orderItems) {
            totalCost = totalCost.add(orderItem.totalCostForItems());
        }
        return totalCost;
    }


}