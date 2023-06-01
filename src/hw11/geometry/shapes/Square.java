package hw11.geometry.shapes;

public class Square implements Shape {
    private Double side;

    public Square(Double side) {
        this.side = side;
    }

    @Override
    public Double getShapeArea() {
        return Math.pow(side, 2);
    }

    public Double getSide() {
        return side;
    }

    public void setSide(Double side) {
        this.side = side;
    }
}
