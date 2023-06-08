package hw15;

public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println("2) printThreeWords: ");
        printThreeWords();
        System.out.print("3) checkSubSign: ");
        checkSumSign();
        System.out.print("4) printColor: ");
        printColor();
        System.out.print("5) compareNumbers: ");
        compareNumbers();
        System.out.println("6) isBetween10and20: " + isBetween10and20(5,6));
        System.out.print("7) isPositive: ");
        isPositive(5);
        System.out.println("8) isNegative: " + isNegative(-5));
        System.out.print("9) repeatString: ");
        repeatString("abc|", 5);
        System.out.println("10) isLeapYear: " + isLeapYear(2024));
    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nAple");
    }

    public static void checkSumSign() {
        int a=1, b=-2;
        if(a + b >= 0) {
            System.out.println("Сума позитивна");
            return;
        }
        System.out.println("Сума негативна");
    }

    public static void printColor() {
        int value = 5;
        if(value <= 0) {
            System.out.println("Червоний");
        } else if(value<=100) {
            System.out.println("Жовтий");
        } else {
            System.out.println("Зелений");
        }
    }

    public static void compareNumbers() {
        int a=1, b=2;
        if(a >= b) {
            System.out.println("a >= b");
            return;
        }
        System.out.println("a < b");
    }

    public static boolean isBetween10and20(int a, int b) {
        return a + b > 9 && a + b < 21;
    }

    public static void isPositive(int a) {
        if(a >= 0) {
            System.out.println("число позитивне");
            return;
        }
        System.out.println("число негативне");
    }

    public static boolean isNegative(int a) {
        return !(a >= 0);
    }

    public static void repeatString(String str, int n) {
        System.out.println(str.repeat(n));
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && !(year % 100 == 0 && year % 400 != 0);
    }
}
