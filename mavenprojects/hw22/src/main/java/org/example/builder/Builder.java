package org.example.builder;

public interface Builder {
    void setType(String type);

    void setSeats(int num);

    void setEngine(String engine);

    void setGPSNavigator(boolean pgsNavigator);

    Car createCar();
}
