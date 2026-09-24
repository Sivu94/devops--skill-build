package com.developerpractice.domain.model;

public class OrderItem {

    private final Product product;
    private final int quantity;
    
    public OrderItem(Product product, int quantity) {
        if(quantity <= 0) {
         throw new IllegalArgumentException("Quantity must be greater than zero");
     }
        this.product = product;
        this.quantity = quantity;
    }

    public BigDecimal totalCostForItems() {
     
    return product.getPrice().multiply(BigDecimal.valueOf(quantity));
}
    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

}