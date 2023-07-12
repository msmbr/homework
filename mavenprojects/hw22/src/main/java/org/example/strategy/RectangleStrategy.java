package org.example.strategy;

public class RectangleStrategy implements AreaStrategy {
    private AreaStrategy.Shape type;

    public RectangleStrategy() {
        type = Shape.Rectangle;
    }

    @Override
    public double calculateArea(double height, double width) {
        return height * width;
    }

    @Override
    public Shape getType() {
        return type;
    }
}
