package org.example;

import org.example.builder.Car;
import org.example.builder.CarBuilder;
import org.example.builder.Director;
import org.example.factory.creators.ChairCreator;
import org.example.factory.creators.ComputerChairCreator;
import org.example.strategy.AreaStrategy;
import org.example.strategy.Context;
import org.example.strategy.RectangleStrategy;
import org.example.strategy.TriangleStrategy;

public class Main {
    public static void main(String[] args) {
        //Factory method
        ChairCreator chairCreator = new ComputerChairCreator();
        chairCreator.drawUpInstructions();

        //Builder template
        CarBuilder builder = new CarBuilder();
        Director director = new Director();
        director.constructCityCar(builder);
        Car car = builder.createCar();
        System.out.println(car);

        //Strategy
        AreaStrategy.Shape shape = AreaStrategy.Shape.values()[(int) (Math.random() * 2)];
        Context context = new Context();
        switch (shape) {
            case Triangle -> context.setAreaStrategy(new TriangleStrategy());
            case Rectangle -> context.setAreaStrategy(new RectangleStrategy());
        }
        System.out.println(shape + " area: " + context.getArea(5d, 6d));
    }
}