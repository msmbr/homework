package hw6;

public class Dog extends Animal{
    public static final int DOG_DEFAULT_RUN_LIMIT = 500;
    public static final int DOG_DEFAULT_SWIM_LIMIT = 10;

    public Dog() {
        Counter.dogCounter++;
        setRunLimit(DOG_DEFAULT_RUN_LIMIT);
        setSwimLimit(DOG_DEFAULT_SWIM_LIMIT);
        setName("Dog"+Counter.dogCounter);
    }
}
