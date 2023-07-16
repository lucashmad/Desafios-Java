package Application;

public class Product {
    private String name;
    private double price;
    private int quantity;

    // criando o construtor

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product() {
    }

    // criar os getters and seters depois dos construtores

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }


    public double totalValueStock(){
        return price * quantity;
    }
    public void addProduct(int quantity){
        this.quantity += quantity; // referenciei o atributo
    }
    public void removeProduct(int quantity){
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueStock() ); // para formatar a variavel double pra mostrar 2 casas

    }
}
