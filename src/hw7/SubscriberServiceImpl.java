package hw7;

import java.util.ArrayList;

public class SubscriberServiceImpl implements SubscriberService{

    @Override
    public ArrayList<Subscriber> subscribersWithCityCallDurationGreaterN(Subscriber[] subscribers, int n) {
        ArrayList<Subscriber> resultList = new ArrayList<>();
        for (Subscriber subscriber : subscribers) {
            if(subscriber.getCityCallDuration()>n) {
                resultList.add(subscriber);
            }
        }
        return resultList;
    }

    @Override
    public ArrayList<Subscriber> subscribersWithInterCityCalls(Subscriber[] subscribers) {
        ArrayList<Subscriber> resultList = new ArrayList<>();
        for (Subscriber subscriber : subscribers) {
            if(subscriber.getInterCityCallDuration()>0) {
                resultList.add(subscriber);
            }
        }
        return resultList;
    }

    @Override
    public ArrayList<Subscriber> subscribersByFirstLetter(Subscriber[] subscribers, String letter) {
        ArrayList<Subscriber> resultList = new ArrayList<>();
        for (Subscriber subscriber : subscribers) {
            if(subscriber.getLastName().startsWith(letter.toLowerCase()) || subscriber.getLastName().startsWith(letter.toUpperCase())) {
                resultList.add(subscriber);
            }
        }
        return resultList;
    }

    @Override
    public double getTotalInternetTrafficForCity(Subscriber[] subscribers, String city) {
        double result = 0d;
        for (Subscriber subscriber : subscribers) {
            if(subscriber.getCity().equals(city)) {
                result += subscriber.getInternetTraffic();
            }
        }
        return Math.round(result*1000)/1000d;
    }

    @Override
    public int getNumberOfNegativeBalances(Subscriber[] subscribers) {
        int result = 0;
        for (Subscriber subscriber : subscribers) {
            if(subscriber.getBalance()<0) {
                ++result;
            }
        }
        return result;
    }
}
