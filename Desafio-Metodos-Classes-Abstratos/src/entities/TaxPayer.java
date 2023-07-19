package entities;

public abstract class TaxPayer {

    private String name;
    private Double continuance; // variavel que pega o rendimento anual e calcula, de acordo com a pessoa F ou J

    public TaxPayer() {
    }

    public TaxPayer(String name, Double continuance) {
        this.name = name;
        this.continuance = continuance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getContinuance() {
        return continuance;
    }

    public void setContinuance(Double continuance) {
        this.continuance = continuance;
    }

    public abstract double tax();

}
