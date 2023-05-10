package hw4;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static final float ODESA_TO_KRYVE_OZERO= 179f;
    static final float KRYVE_OZERO_TO_ZHASHKIV = 153f;
    static final float ZHASHKIV_KYIV = 150f;

    public static void main(String[] args) {
        float fuelPrice = Float.parseFloat(args[0]);

        float[] routeParts = {ODESA_TO_KRYVE_OZERO, KRYVE_OZERO_TO_ZHASHKIV, ZHASHKIV_KYIV};
        Car car = new Car(25f,10f);

        System.out.println("Вартість палива: "+fuelPrice);

        driveAlongRoute(routeParts, car, fuelPrice);
    }

    static public void driveAlongRoute(float[] routeParts, Car car, float fuelPrice) {
        float addedFuel = 0f;
        float remainingFuel;
        float fuelNeed;

        for(int i = 0; i < routeParts.length; ++i) {
            fuelNeed = (float) Math.ceil(car.calculateAdditionalFuelForDistance(routeParts[i])*100)/100;
            System.out.printf("В пункті %s треба долити %s для подолання відстані до пункту %s. Вартість: %s%n",
                    i + 1, fuelNeed, i + 2, Math.ceil(fuelNeed * fuelPrice * 100) / 100);

            addedFuel += car.fillTankCompletely();
            car.drive(routeParts[i]);
        }

        remainingFuel = car.getRemainingFuel();
        System.out.println("\nзалишок палива: " + remainingFuel);

        System.out.println("поїздка коштує: " + Math.ceil((addedFuel-remainingFuel)*fuelPrice*100)/100);
        System.out.println("витрачено грошей на паливо: " + Math.ceil(addedFuel*fuelPrice*100)/100);
    }
}
