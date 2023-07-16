package application;

import data.OrderStatus;
import entities.ClientData;
import entities.OrderItem;
import entities.Product;
import entities.Order;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.Date;

public class ChallengeEnumeration {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");


        System.out.print("Enter client data: ");
        System.out.print("\nName: ");
        String name = scanner.nextLine();
        System.out.print("\nEmail: ");
        String email = scanner.nextLine();
        System.out.print("\nBirth date: (DD/MM/YYYY) ");
        Date birthdayDate = simpleDateFormat.parse(scanner.next());
        ClientData clientData = new ClientData(name, email,birthdayDate);

        System.out.print("\nEnter order data:");
        System.out.print("\nStatus: ");
        OrderStatus orderStatus = OrderStatus.valueOf(scanner.next());

        Order order = new Order(new Date(), orderStatus, clientData);

        System.out.print("How many items to this order? ");
        int numberRepeat = scanner.nextInt();

        for (int i = 1; i <= numberRepeat ; i++) {
            System.out.print("\nEnter #" + i + " Item data:");
            System.out.print("\nProduct name: ");
            scanner.nextLine();
            String productName = scanner.nextLine();
            System.out.print("\nPrice: $ ");
            double price = scanner.nextDouble();
            System.out.print("\nQuantity: ");
            int quantity = scanner.nextInt();

            Product product = new Product(productName, price);
            OrderItem orderItem = new OrderItem(quantity, price,product);

            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println("Order Summary: ");
        System.out.println(order);

        scanner.close();
    }
}
