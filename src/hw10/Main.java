package hw10;

import hw10.phonebook.PhoneBook;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HW10 hw10 = new HW10();
        String[] arrCountries = {"Spain", "France", "UK", "USA", "German", "Poland", "Denmark", "Norway", "Sweden", "Finland"};

        // 2
        List<String> lstCountries = hw10.toList(arrCountries);

        // 1
        List<String> randomLstCountries = hw10.getRandomList(lstCountries, 20);
        System.out.println("1) randomLstCountries: " + randomLstCountries);
        String country = "UK";
        System.out.println("countOccurrence: " + country + " = " + hw10.countOccurrence(randomLstCountries, country));

        // 2
        List<Integer> intLst = hw10.toList(new Integer[]{5, 4, 7, 6, 4, 7});
        System.out.println("2) " + intLst);

        //3
        System.out.println("3) " + hw10.findUnique(intLst));

        //4
        System.out.println("4***, option 1) " + hw10.findOccurrence(randomLstCountries));
        System.out.println("4***, option 2) " + hw10.findOccurrence2(randomLstCountries));

        PhoneBook phoneBook = new PhoneBook();
        System.out.println("4.5) " + phoneBook.addSubscriber("Shevchenko A.", "+380991"));
        System.out.println(phoneBook.addSubscriber("Melnyk B.", "+380992"));
        System.out.println(phoneBook.addSubscriber("Bondar C.", "+380993"));
        System.out.println(phoneBook.addSubscriber("Melnyk B.", "+380994"));
        System.out.println(phoneBook.addSubscriber("Melnyk B.", "+380994"));
        System.out.println("phonebook size: " + phoneBook.size());
        System.out.println("4.6) " + phoneBook.find("Melnyk B."));
        System.out.println("4.8) " + phoneBook.findAll("Melnyk B."));
    }
}
