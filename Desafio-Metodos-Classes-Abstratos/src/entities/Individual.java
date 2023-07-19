package entities;

public class Individual  extends TaxPayer{

    private Double healthExpenditures;

    public Individual() {
    }

    public Individual(String name, Double continuance, Double healthExpenditures) {
        super(name, continuance);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        if (getContinuance() < 20000.0) {
            return getContinuance() * 0.15 - healthExpenditures * 0.50;
        } else {
            return getContinuance() * 0.25 - healthExpenditures * 0.50;
        }
    }
}
