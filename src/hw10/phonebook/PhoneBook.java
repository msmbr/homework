package hw10.phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private final List<Subscriber> subscribers;

    public PhoneBook() {
        this.subscribers = new ArrayList<>();
    }

    public boolean addSubscriber(String name, String phoneNumber) {
        if(!contains(name, phoneNumber)) {
            subscribers.add(new Subscriber(name, phoneNumber));
            return true;
        }
        return false;
    }

    public boolean contains(String name, String phoneNumber) {
        for(Subscriber subscriber: subscribers) {
            if(subscriber.getName().equals(name) && subscriber.getPhoneNumber().equals(phoneNumber)) {
                return true;
            }
        }
        return false;
    }

    public Subscriber find(String name) {
        for(Subscriber subscriber: subscribers) {
            if(subscriber.getName().equals(name)) {
                return subscriber;
            }
        }
        return null;
    }

    public List<Subscriber> findAll(String name) {
        List<Subscriber> lst = new ArrayList<>();
        for(Subscriber subscriber: subscribers) {
            if(subscriber.getName().equals(name)) {
                lst.add(subscriber);
            }
        }
        return lst.size() != 0 ? lst : null;
    }

    public int size() {
        return subscribers.size();
    }
}
