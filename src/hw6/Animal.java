package hw6;

public class Animal {

    private int runLimit;
    private int swimLimit;
    private String name;

    public Animal() {
        Counter.animalCounter++;
        name = "Тварина" + Counter.animalCounter;
    }

    public void run(int distance) {
        if(runLimit == 0) {
            System.out.println(name + " не бігає");
            return;
        }
        if (distance > runLimit) {
            System.out.printf("%s не може пробігти %sм, максимум %sм%n", name, distance, runLimit);
        } else {
            System.out.printf("%s пробіг %sм%n", name, distance);
        }
    }
    public void swim(int distance) {
        if(swimLimit == 0) {
            System.out.println(name + " не вміє плавати");
            return;
        }
        if(distance > swimLimit) {
            System.out.printf("%s не може проплити %sм, максимум %sм%n", name, distance, swimLimit);
        } else {
            System.out.printf("%s проплив %sм %n", name, distance);
        }
    }

    public int getRunLimit() {
        return runLimit;
    }

    public void setRunLimit(int runLimit) {
        this.runLimit = runLimit;
    }

    public int getSwimLimit() {
        return swimLimit;
    }

    public void setSwimLimit(int swimLimit) {
        this.swimLimit = swimLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
