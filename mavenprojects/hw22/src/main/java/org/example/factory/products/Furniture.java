package org.example.factory.products;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Furniture {
    private String color;
    private String material;

    public abstract String drawUpInstructions();
}
