package hw6;

public class Cat extends Animal{

    public static final int CAT_DEFAULT_RUN_LIMIT = 200;
    public static final int CAT_DEFAULT_SWIM_LIMIT = 0;

    public Cat() {
        Counter.catCounter++;
        setRunLimit(CAT_DEFAULT_RUN_LIMIT);
        setSwimLimit(CAT_DEFAULT_SWIM_LIMIT);
        setName("Cat"+Counter.catCounter);
    }
}
