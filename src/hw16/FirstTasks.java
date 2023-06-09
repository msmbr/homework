package hw16;

import java.util.Arrays;

public class FirstTasks {
    public static void main(String[] args) {
        System.out.println("2) findSymbolOccurrence: " + findSymbolOccurrence("Hello World!", 'l'));
        System.out.println("3) findWordPosition: " + findWordPosition("Apollo", "pollo"));
        System.out.println("4) stringReverse: " + stringReverse("Hello"));
        System.out.println("5) isPalindrome: " + isPalindrome("ERe"));
    }

    public static int findSymbolOccurrence(String str, char findChar) {
        int counter = 0;
        for(char c: str.toCharArray()) {
            if(c == findChar) {
                ++counter;
            }
        }
        return counter;
    }

    public static int findWordPosition(String source, String target) {
        return source.indexOf(target);
    }

    public static String stringReverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        return str.equals(stringReverse(str));
    }
}
