package hw11.sport.participants;

import hw11.sport.obstacle.Obstacle;
import hw11.sport.obstacle.RunningTrack;
import hw11.sport.obstacle.Wall;

import java.util.List;

public abstract class Participant {
    private double runLimit, jumpLimit, distance;
    private String name;

    public Participant(String name, double runLimit, double jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    public boolean overcome(Obstacle obstacle) {
        return switch (obstacle.getType()) {
            case WALL -> jump(((Wall) obstacle).getHeight());
            case RUNNING_TRACK -> run(((RunningTrack) obstacle).getLength());
        };
    }

    public void overcomeObstacleCourse(List<Obstacle> list) {
        double obstaclePoint;
        for(Obstacle obstacle: list) {
            obstaclePoint = distance;
            if(overcome(obstacle)) {
                System.out.printf("Учасник: %s, пройшов перешкоду: %s, на дистанції: %sm%n", name, obstacle, obstaclePoint);
            } else {
                System.out.printf("Учасник: %s, не пройшов перешкоду: %s, на дистанції: %sm, пройдено: %sm%n", name, obstacle, obstaclePoint, distance);
                break;
            }
        }
    }

    public boolean jump(double height) {
        if(jumpLimit >= height) {
            System.out.println(name + " прижок");
            return true;
        }
        return false;
    }

    public boolean run(double distance) {
        if(this.distance == runLimit) {
            return false;
        }

        System.out.println(name + " біжить");

        if(this.distance + distance <= runLimit) {
            this.distance += distance;
            return true;
        }
        this.distance = runLimit;
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRunLimit(double runLimit) {
        this.runLimit = runLimit;
    }

    public void setJumpLimit(double jumpLimit) {
        this.jumpLimit = jumpLimit;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
