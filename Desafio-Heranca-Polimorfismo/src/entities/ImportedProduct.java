package entities;

public class ImportedProduct extends Product {

    private Double customsFree;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFree) {
        super(name, price);
        this.customsFree = customsFree;
    }

    public double totalPrice(){
        return super.getPrice() + customsFree;
    }

    public String toString(){
       return getName()
               + " $ "
               + getPrice()
               + "(Customs fee $ " +
               String.format("%.2f", totalPrice())
               + ")";
    }
}
