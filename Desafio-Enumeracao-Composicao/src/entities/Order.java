package entities;
import data.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date momentDate;
    private OrderStatus status;

    private List<OrderItem> orderItems = new ArrayList<>();

    private ClientData clientData;

    public Order(Date momentDate, OrderStatus status, ClientData clientData) {
        this.momentDate = momentDate;
        this.status = status;
        this.clientData = clientData;
    }

    public Order() {
    }

    public Date getMomentDate() {
        return momentDate;
    }

    public void setMomentDate(Date momentDate) {
        this.momentDate = momentDate;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public ClientData getClientData() {
        return clientData;
    }

    public void setClientData(ClientData clientData) {
        this.clientData = clientData;
    }

    public void addItem(OrderItem orderItem){
        orderItems.add(orderItem);
    }

    public void removeItem(OrderItem orderItem){
        orderItems.remove(orderItem);
    }

    public double total(){
        double sum = 0.0;
        for (OrderItem item : orderItems){
            sum += item.subTotal();
        }
        return sum;
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Order moment: ");
            stringBuilder.append(simpleDateFormat.format(momentDate) + "\n");
            stringBuilder.append("Order Status: ");
            stringBuilder.append(status + "\n");
            stringBuilder.append("Client: ");
            stringBuilder.append(clientData + "\n");
            stringBuilder.append("Order Items:\n");
            for (OrderItem item : orderItems){
                stringBuilder.append(item + "\n");
            }
            stringBuilder.append("Total price: $");
            stringBuilder.append(String.format("%.2f", total()));
            return stringBuilder.toString();
    }
}
