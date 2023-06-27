package org.example.Products;

import java.time.LocalDate;

public class Phone extends Product {
    public Phone(Integer id, Double price, Boolean promo, LocalDate added) {
        super(id, Type.PHONE, price, promo, added);
    }
}
