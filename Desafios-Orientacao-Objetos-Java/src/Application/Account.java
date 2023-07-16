package Application;


public class Account {

    public static final double PERCENTAGE = 5.0;

    private int number;
    private String name;
    private double balance;


    public Account(int number, String Holder){
        this.number = number;
        this.name = Holder;
    }

    public Account(int number, String holder, double initialDeposity) {
        this.number = number;
        this.name = holder;
        deposit(initialDeposity); // chamei a operacao deposit e passando a variavel initialdeposit como argumento
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {

        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void cashWhitDrawal(double amount){
        balance -= amount + PERCENTAGE;
    }

    public String toString() {
        return "Account: "
                     + number
                     + " , name: "
                     + name
                     + ", Balance: $"
                     + String.format("%.2f", balance);
    }
}