package hw6;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        cat1.run(200);
        cat1.run(201);
        cat1.swim(20);

        dog1.run(500);
        dog1.run(501);
        dog2.swim(10);
        dog2.swim(11);

        System.out.println("котів: " + Counter.catCounter);
        System.out.println("собак: " + Counter.dogCounter);
        System.out.println("тварин: " + Counter.animalCounter);
    }
}
