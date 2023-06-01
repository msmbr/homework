package hw11.geometry.shapes;

public class Circle implements Shape {

    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double getShapeArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
}
