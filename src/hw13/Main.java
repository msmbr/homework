package hw13;

import hw13.coffee.order.CoffeeOrderBoard;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();
        coffeeOrderBoard.add("Alen");
        coffeeOrderBoard.add("Yoda");
        coffeeOrderBoard.add("Obi-van");
        coffeeOrderBoard.add("John Snow");

        coffeeOrderBoard.draw();
        System.out.println("deliver: " + coffeeOrderBoard.deliver());
        coffeeOrderBoard.draw();
        System.out.println("deliver id = 3: " + coffeeOrderBoard.deliver(3));
        coffeeOrderBoard.draw();

    }
}
