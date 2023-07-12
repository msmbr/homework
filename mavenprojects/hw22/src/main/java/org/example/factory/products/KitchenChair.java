package org.example.factory.products;

public class KitchenChair extends Furniture {

    public KitchenChair(String color, String material) {
        super(color, material);
    }

    @Override
    public String drawUpInstructions() {
        return "Kitchen chair instructions";
    }
}
