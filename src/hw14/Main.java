package hw14;

public class Main {
    public static void main(String[] args) {
        ArrayValueCalculator calculator = new ArrayValueCalculator();
        String[][] a = {{"1","2","3","4"},{"5","6","7","8"},{"9","10","11","12"},{"13","14","15","16"}};
        try {
            System.out.println(calculator.doCalc(a));
        } catch (ArraySizeException | ArrayDataException e) {
            System.out.println(e);
        }
    }
}
