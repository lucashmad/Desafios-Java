/*
programa de estoque de produtos dando entrada e saida


 */

import Application.Product;

import java.util.Locale;
import java.util.Scanner;

public class ProgramStock {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner vs = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        String name = vs.nextLine();

        System.out.println("Price:");
        double price = vs.nextDouble();

        // vou instanciar apenas depois de digitar os dados

        Product product = new Product(name, price);

        product.setName("Computer"); // caso a mudanca utilizar o setName e passar como argumento entre ()

        product.setPrice(1200.00);

        System.out.println("Update price: " + product.getPrice());

        System.out.println("Update data: " + product.getName()); // utilizar o get name pra me retornar o nome atualizado

        System.out.println("Dados do Produto: " + product);

        System.out.println();
        System.out.print("Entre com a quantidade para ser adicionado: ");
        int quantity = vs.nextInt();
        product.addProduct(quantity);

        System.out.println("Atualizacao do produto: " + product);

        System.out.println();
        System.out.print("Entre com a saida do estoque do produto: ");
        quantity = vs.nextInt();
        product.removeProduct(quantity);

        System.out.println("Atualizacao do produto: " + product);

        vs.close();
    }

}
