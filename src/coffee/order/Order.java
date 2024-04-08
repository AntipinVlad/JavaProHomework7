package coffee.order;

public class Order {
    private int id;
    private String clientName;

    public Order(int id, String clientName) {
        this.id = id;
        this.clientName = clientName;
    }

    public int getId() {
        return id;
    }

    public String getClientName() {
        return clientName;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", clientName='" + clientName + '\'' +
                '}';
    }
}
