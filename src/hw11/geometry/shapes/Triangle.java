package hw11.geometry.shapes;

public class Triangle implements Shape {

    private Double height, base;

    public Triangle(Double height, Double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public Double getShapeArea() {
        return height * base / 2;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }
}
