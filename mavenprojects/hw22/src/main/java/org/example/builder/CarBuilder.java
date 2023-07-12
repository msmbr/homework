package org.example.builder;

public class CarBuilder implements Builder {

    private String type;
    private int seats;
    private String engine;
    private boolean pgsNavigator;

    @Override
    public void setSeats(int num) {
        this.seats = num;
    }

    @Override
    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public void setGPSNavigator(boolean pgsNavigator) {
        this.pgsNavigator = pgsNavigator;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public Car createCar() {
        return new Car(type, seats, engine, pgsNavigator);
    }

}
