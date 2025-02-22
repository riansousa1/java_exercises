package entities;

public class Company extends TaxPayer{

    private Integer numberOfEmployees;

    public Company(String name, Double anualIncome, Integer numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public double tax() {
        double tax = 0;
        if (numberOfEmployees > 10) {
            tax = getAnualIncome() * 14 / 100.0;
        } else {
            tax = getAnualIncome() * 16 / 100.0;
        }
        return tax;
    }

    public String toString() {
        return getName() + ": $ " + String.format("%.2f", tax());
    }
}
