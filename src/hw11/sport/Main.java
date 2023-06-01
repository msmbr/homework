package hw11.sport;

import hw11.sport.obstacle.Obstacle;
import hw11.sport.obstacle.RunningTrack;
import hw11.sport.obstacle.Wall;
import hw11.sport.participants.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Participant> participantList = new ArrayList<>();

        participantList.add(new Human("Jack", 500d, 2.1d));
        participantList.add(new Cat("Tom", 100d, 1d));
        participantList.add(new Robot("robot", 300d, 0.2d));

        List<Obstacle> obstacleCourse = new ArrayList<>();
        obstacleCourse.add(new RunningTrack(50d));
        obstacleCourse.add(new Wall(0.6d));
        obstacleCourse.add(new RunningTrack(100d));
        obstacleCourse.add(new Wall(1d));
        obstacleCourse.add(new RunningTrack(2000d));
        obstacleCourse.add(new Wall(1.5d));
        obstacleCourse.add(new RunningTrack(500d));

        participantList.forEach(participantImp -> participantImp.overcomeObstacleCourse(obstacleCourse));

    }
}
