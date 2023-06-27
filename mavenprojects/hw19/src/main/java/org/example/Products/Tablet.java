package org.example.Products;

import java.time.LocalDate;

public class Tablet extends Product {
    public Tablet(Integer id, Double price, Boolean promo, LocalDate added) {
        super(id, Type.TABLET, price, promo, added);
    }
}
