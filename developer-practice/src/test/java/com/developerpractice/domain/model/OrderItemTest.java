package com.developerpractice.domain.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

class OrderItemTest {

    @Test
    void calculatesTotalCostForItems() {
        Product product = new Product("p-1", "Notebook", 12.50);
        OrderItem orderItem = new OrderItem(product, 3);

        assertEquals(37.50, orderItem.totalCostForItems());
    }

    @Test
    void throwsExceptionForNonPositiveQuantity() {
        Product product = new Product("p-1", "Notebook", 12.50);
        
            assertThrows(IllegalArgumentException.class, () -> new OrderItem(product, 0));
    }
     
    @Test
    void throwsExceptionForNegativeQuantity() {
        Product product = new Product("p-1", "Notebook", 12.50);
        assertThrows(IllegalArgumentException.class, () -> new OrderItem(product, -1));
    }

    @Test
    void exposesProductAndQuantity() {
        Product product = new Product("p-1", "Notebook", 12.50);
        OrderItem orderItem = new OrderItem(product, 3);

        assertSame(product, orderItem.getProduct());
        assertEquals(3, orderItem.getQuantity());
    }
}
