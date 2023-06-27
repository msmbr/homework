package org.example.Products;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Product {
    public enum Type {BOOK, TABLET, PHONE}

    private Integer id;
    private Product.Type type;
    private Double price;
    private Boolean discount;
    private LocalDate createDate;

    public Product(Integer id, Product.Type type, double price, boolean discount, LocalDate createDate) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.discount = discount;
        this.createDate = createDate;
    }
}
