package hw11.geometry;

import hw11.geometry.shapes.Circle;
import hw11.geometry.shapes.Shape;
import hw11.geometry.shapes.Square;
import hw11.geometry.shapes.Triangle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Circle(10d));
        shapeList.add(new Square(10d));
        shapeList.add(new Triangle(4d, 5d));

        printTotalArea(shapeList);
    }

    public static void printTotalArea(List<Shape> shapeList) {
        Double totalArea = 0d;

        for(Shape shape: shapeList) {
            totalArea += shape.getShapeArea();
        }

        System.out.println("Total area = " + Math.floor(totalArea * 100) / 100);
    }
}
