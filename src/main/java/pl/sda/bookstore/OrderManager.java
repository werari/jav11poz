package pl.sda.bookstore;

import pl.sda.bookstore.Order;
import pl.sda.bookstore.customer.Customer;
import pl.sda.bookstore.customer.User;

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
    public Order getNextOrder(){
        return orderQueue.remove();
    }

    public void removeOrder(Customer customer) {
        //sprzawdza czy to jest firma czy użytkownik prywatny
        boolean isUser= customer instanceof User;

        orderQueue.stream().forEach((order)->{
            if (order.getCustomer().equals(customer)){
                orderQueue.remove(order);
            }else {
                System.out.println("Nie znaleziono zamówienia");
            }
    });
     //nie ma else wiec nie bedzie info o braku użytkownika
        //   orderQueue.removeIf(order -> order.getCustomer().equals(customer));
    }
}
