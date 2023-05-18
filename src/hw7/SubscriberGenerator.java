package hw7;
import java.util.Random;
public class SubscriberGenerator {

    public static Subscriber[] generateSubArray(int number) {
        String[] city = {"Kyiv", "Kharkiv", "Dnipro", "Odesa", "Lviv"};
        String[] firstnames = {"Oleksandr", "Anna", "Alina", "Maxym", "Denys"};
        String[] lastNames = {"Shevchenko", "Bondar", "Melnyk", "Koval", "Kravec"};
        Random rand = new Random();

        Subscriber[] subscribers = new Subscriber[number];

        for(int i = 0; i < subscribers.length; ++i) {
            /*subscribers[i] = new Subscriber(i+1, firstnames[rand.nextInt(firstnames.length)],
                    lastNames[rand.nextInt(lastNames.length)],
                    city[rand.nextInt(city.length)],
                    "+38099"+rand.nextInt(1000000,9999999),
                    rand.nextInt(10000,1000000),
                    (rand.nextInt(3)==0?-1:1)*Math.round(rand.nextDouble(1000)*100)/100d,
                    Math.round(rand.nextDouble(1000)*100)/100d,
                    (rand.nextInt(3)==0?0:1)*Math.round(rand.nextDouble(1000)*100)/100d,
                    Math.round(rand.nextDouble(1000)*1000)/1000d);*/
            subscribers[i] = new Subscriber(i);
            subscribers[i].setFirstName(firstnames[rand.nextInt(firstnames.length)]);
            subscribers[i].setLastName(lastNames[rand.nextInt(lastNames.length)]);
            subscribers[i].setCity(city[rand.nextInt(city.length)]);
            subscribers[i].setPhoneNumber("+38099"+rand.nextInt(1000000,9999999));
            subscribers[i].setContractNumber(rand.nextInt(10000,1000000));
            subscribers[i].setBalance((rand.nextInt(3)==0?-1:1)*Math.round(rand.nextDouble(1000)*100)/100d);    // randomly approximately one of three is minus
            subscribers[i].setCityCallDuration(Math.round(rand.nextDouble(1000)*100)/100d);
            subscribers[i].setInterCityCallDuration((rand.nextInt(3)==0?0:1)*Math.round(rand.nextDouble(1000)*100)/100d); // randomly approximately one of three is zero
            subscribers[i].setInternetTraffic(Math.round(rand.nextDouble(1000)*1000)/1000d);
        }
        return subscribers;
    }
}
