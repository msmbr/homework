package hw4;

public class Car {
    private final float tankVolume;
    private final float fuelConsumptionOn100km;
    private float remainingFuel;

    public Car(float tankVolume, float fuelConsumptionOn100km) {
        this.tankVolume = tankVolume;
        this.fuelConsumptionOn100km = fuelConsumptionOn100km;
        remainingFuel = 0f;
    }

    //task condition 1
    public float fillTankCompletely() {
        float addedFuel = tankVolume-remainingFuel;
        remainingFuel = tankVolume;
        return addedFuel;
    }

    //task condition 2
    public float calculateRemainingFuelByDistanceFromFullTank(float distance) {
        return tankVolume - calculateFuelForDistance(distance);
    }

    //task condition 3
    public float calculateAdditionalFuelForDistance(float distance) {
        float result = calculateFuelForDistance(distance) - remainingFuel;
        return result > 0 ? result : 0;
    }

    public float calculateFuelForDistance(float distance) {
        return distance*fuelConsumptionOn100km/100;
    }

    public void drive(float distance) {
        remainingFuel = calculateRemainingFuelByDistanceFromFullTank(distance);
        if (remainingFuel < 0) {
            remainingFuel = 0;
        }
    }

    public float getRemainingFuel() {
        return remainingFuel;
    }
}
