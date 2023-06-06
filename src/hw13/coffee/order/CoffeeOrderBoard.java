package hw13.coffee.order;

import java.util.ArrayList;
import java.util.List;

public class CoffeeOrderBoard {
    private final List<Order> orders;

    public CoffeeOrderBoard() {
        orders = new ArrayList<>();
    }

    public void add(String name) {
        int lastId = orders.size() != 0 ? orders.get(orders.size() - 1).getId() : 0;
        orders.add(new Order(lastId + 1, name));
    }

    public Order deliver() {
        if(orders.size() == 0) return null;

        Order order = orders.get(0);
        orders.remove(0);
        return order;
    }

    public Order deliver(int id) {
        Order searchOrder = null;
        for(int i = 0; i < orders.size(); ++i) {
            if(orders.get(i).getId() == id) {
                searchOrder = orders.get(i);
                orders.remove(i);
                break;
            }
        }
        return searchOrder;
    }

    public void draw() {
        System.out.println("=============");
        System.out.println("Id | Name");
        for(Order order: orders) {
            System.out.println(order.getId() + "|" + order.getName());
        }
        System.out.println("=============");
    }
}
