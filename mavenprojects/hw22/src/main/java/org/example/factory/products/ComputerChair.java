package org.example.factory.products;

public class ComputerChair extends Furniture {
    private int wheels;

    public ComputerChair(String color, String material, int wheels) {
        super(color, material);
        this.wheels = wheels;
    }

    @Override
    public String drawUpInstructions() {
        return "Computer chair instruction";
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
}
