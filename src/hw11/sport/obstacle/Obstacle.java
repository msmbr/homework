package hw11.sport.obstacle;

public interface Obstacle {
    enum Type {WALL, RUNNING_TRACK}

    Type getType();
}
