package hw7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Subscriber[] subscribers = SubscriberGenerator.generateSubArray(5);
        int cityCallDurationLevel = 500;    // task a) 0-1000
        String letter = "K";                // task c) {"Shevchenko", "Bondar", "Melnyk", "Koval", "Kravec"};
        String city = "Kyiv";               // task d) {"Kyiv", "Kharkiv", "Dnipro", "Odesa", "Lviv"}

        SubscriberService subService = new SubscriberServiceImpl();

        //print
        System.out.println("List of subscribers:");
        for(Subscriber sub: subscribers) {
            System.out.println(sub);
        }
        System.out.println();
        
        customPrint("a) Subscribers with a city call duration greater than " + cityCallDurationLevel,
                subService.subscribersWithCityCallDurationGreaterN(subscribers, cityCallDurationLevel), new int[]{1, 2, 3, 4, 7});
        customPrint("b) Subscribers with InterCity calls",
                subService.subscribersWithInterCityCalls(subscribers), new int[]{1, 2, 3, 4, 8});
        customPrint("c) Lastnames starting with the letter " + letter,
                subService.subscribersByFirstLetter(subscribers, letter), new int[]{1, 2, 4, 6});
        System.out.printf("d) Total internet traffic for %s: %s GB%n%n", city, subService.getTotalInternetTrafficForCity(subscribers, city));
        System.out.println("e) Number of debtors: " + subService.getNumberOfNegativeBalances(subscribers));
    }

    private static void printAll(String title, ArrayList<Subscriber> subscribers) {
        System.out.println(title);
        if(subscribers.size()==0) {
            System.out.println("no data");
            return;
        }
        for(Subscriber subscriber: subscribers) {
            System.out.println(subscriber);
        }
        System.out.println();
    }

    private static void customPrint(String title, ArrayList<Subscriber> subscribers, int[] fields) {
        System.out.println(title);
        if(subscribers.size()==0) {
            System.out.println("no data\n");
            return;
        }
        for(Subscriber subscriber: subscribers) {
            String[] split1 = subscriber.toString().split("[{}]");
            String[] split2 = split1[1].split(", ");
            String res = split1[0]+"{";
            for(int i: fields) {
                if(i>=split2.length) {
                    continue;
                }
                res = res + split2[i] + ", ";
            }
            res = res.substring(0, res.length()-2) + "}";

            System.out.println(res);
        }
        System.out.println();
    }

}
