package org.example.Products;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Product {
    public enum Type {BOOK, TABLET, PHONE}

    private Integer id;
    private Product.Type type;
    private Double price;
    private Boolean discount;
    private LocalDate createDate;
}
