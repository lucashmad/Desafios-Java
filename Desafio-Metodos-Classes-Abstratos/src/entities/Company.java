package entities;

public class Company extends TaxPayer{

    private Integer numberOfEmployees;

    public Company() {
    }

    public Company(String name, Double continuance, Integer numberOfEmployees) {
        super(name, continuance);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {
        if (numberOfEmployees > 10){
            return getContinuance() * 0.14;
        }else {
            return getContinuance() * 0.16;
        }
    }
}