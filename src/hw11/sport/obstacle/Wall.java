package hw11.sport.obstacle;

public class Wall implements Obstacle {

    private Double height;
    private final Type type = Type.WALL;

    public Wall(Double height) {
        this.height = height;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return String.format("%s(%sm)", type, height);
    }
}
