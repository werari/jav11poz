package pl.sda.bookstore.menu;

import pl.sda.bookstore.Order;

import java.util.LinkedList;
import java.util.Queue;

public class OrderManager {

    Queue<Order> orderQueue = new LinkedList<>();


    public void add(Order order) {
        orderQueue.add(order);

    }

    public int orderCount() {
        return orderQueue.size();
    }
}
