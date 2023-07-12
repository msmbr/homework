package org.example.builder;

public class Director {
    public void constructRacingCar(Builder builder) {
        builder.setType("RacingCar");
        builder.setSeats(1);
        builder.setEngine("EngineA");
        builder.setGPSNavigator(false);
    }

    public void constructSportCar(Builder builder) {
        builder.setType("SportCar");
        builder.setSeats(2);
        builder.setEngine("EngineB");
        builder.setGPSNavigator(true);
    }

    public void constructCityCar(Builder builder) {
        builder.setType("CityCar");
        builder.setSeats(4);
        builder.setEngine("EngineC");
        builder.setGPSNavigator(true);
    }


}
