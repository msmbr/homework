package hw7;

import java.util.ArrayList;

public interface SubscriberService {
    ArrayList<Subscriber> subscribersWithCityCallDurationGreaterN(Subscriber[] subscribers, int n);
    ArrayList<Subscriber> subscribersWithInterCityCalls(Subscriber[] subscribers);
    ArrayList<Subscriber> subscribersByFirstLetter(Subscriber[] subscribers, String letter);
    double getTotalInternetTrafficForCity(Subscriber[] subscribers, String city);
    int getNumberOfNegativeBalances(Subscriber[] subscribers);
}
