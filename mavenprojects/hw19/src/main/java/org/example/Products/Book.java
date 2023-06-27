package org.example.Products;

import java.time.LocalDate;

public class Book extends Product {
    public Book(Integer id, Double price, Boolean promo, LocalDate added) {
        super(id, Type.BOOK, price, promo, added);
    }
}
