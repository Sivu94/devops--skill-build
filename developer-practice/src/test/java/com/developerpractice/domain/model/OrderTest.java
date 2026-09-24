package com.developerpractice.domain.model;

import org.junit.jupiter.api.Test;
import java.util.List;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class OrderTest {

    @Test
    public void testTotalCost() {
        // Test implementation
        Product product1 = new Product("p-1", "Notebook", 12.50);
        Product product2 = new Product("p-2", "Pen", 1.50);
        OrderItem orderItem1 = new OrderItem(product1, 3); 
        OrderItem orderItem2 = new OrderItem(product2, 5); 

        Order order = new Order(List.of(orderItem1, orderItem2));
        
        assertEquals(37.50 + 7.50, order.totalCost());  

    }

    @Test
    public void throwsExceptionForEmptyOrder() {
        assertThrows(IllegalArgumentException.class, () -> new Order(List.of()));
    }
    @Test
    public void throwsExceptionForNullOrder() {
        assertThrows(IllegalArgumentException.class, () -> new Order(null));
    }
}