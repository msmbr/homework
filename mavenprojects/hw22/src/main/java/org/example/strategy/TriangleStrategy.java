package org.example.strategy;

public class TriangleStrategy implements AreaStrategy {

    private AreaStrategy.Shape type;

    public TriangleStrategy() {
        type = Shape.Triangle;
    }

    @Override
    public double calculateArea(double height, double width) {
        return height * width / 2;
    }

    @Override
    public Shape getType() {
        return type;
    }
}
