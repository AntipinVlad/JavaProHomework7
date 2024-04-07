package coffee.order;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class CoffeeOrderBoard {
    private int index = 0;
    private Queue<Order> orders = new LinkedList<>();

    public void add(String clientName) {
        this.orders.offer(new Order(index, clientName));
        index++;
    }

    public void deliver() {
        orders.poll();
    }

    public void deliver(int orderId) {
        Iterator<Order> iterator = orders.iterator();

        while (iterator.hasNext()) {
            Order order = iterator.next();
            if (order.getId() == orderId) {
                iterator.remove();
                break;
            }
        }
    }

    public void draw() {
        System.out.println("Order board:");
        System.out.println("========================");
        System.out.println("Num|Name");
        for(Order order : orders) {
            System.out.println(order.getId() + ":" + order.getClientName());
        }
        System.out.println("========================\n");
    }
}
