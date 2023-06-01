package hw11.sport.obstacle;

public class RunningTrack implements Obstacle {
    private Double length;
    private final Type type = Type.RUNNING_TRACK;

    public RunningTrack(Double length) {
        this.length = length;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return String.format("%s(%sm)", type, length);
    }
}
