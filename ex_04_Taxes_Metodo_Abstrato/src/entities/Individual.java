package entities;

public class Individual extends TaxPayer {

    private Double healthExpenditures;

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
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
        double tax = 0;
        double taxesPaid = 0;

        if (getAnualIncome() < 20000.00) {
            tax = getAnualIncome() * 15 / 100.0;
        } else if (getAnualIncome() >= 20000.00) {
            tax = getAnualIncome() * 25 / 100.0;
        }

        if (healthExpenditures > 0) {
            double healthDiscount = healthExpenditures * 50 / 100.0;
            taxesPaid = tax - healthDiscount;
        }

        return taxesPaid;
    }

    public String toString() {
        return getName() + ": $ " + String.format("%.2f", tax());
    }
}
