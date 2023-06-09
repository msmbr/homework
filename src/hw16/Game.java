package hw16;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leek", "kiwi", "mango", "mushroom", "nut", "olive",
                "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        String randomWord = words[random.nextInt(words.length)];
        String guess;
        int i;
        int attempt = 0;

        while (true) {
            System.out.printf("Enter guess (attempt %s): %n", ++attempt);
            guess = scanner.nextLine();

            for(i = 0; i < Math.min(randomWord.length(), guess.length()); ++i) {
                if(randomWord.charAt(i) != guess.charAt(i)) break;
                System.out.print(randomWord.charAt(i));
            }

            if(i == randomWord.length() && i == guess.length()) {
                System.out.println("\nWin");
                return;
            }

            System.out.println("*".repeat(15 - i));
        }
    }
}
