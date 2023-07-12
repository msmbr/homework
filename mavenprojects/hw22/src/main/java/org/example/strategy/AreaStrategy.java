package org.example.strategy;

public interface AreaStrategy {
    enum Shape {Triangle, Rectangle}

    double calculateArea(double height, double width);

    Shape getType();
}
