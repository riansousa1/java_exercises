package entities;

public class OutSourcedEmployee extends Employee{

    private Double additionalCharge;

    public OutSourcedEmployee(String name, Integer hours, Double valuePerHour, double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment() {
        return super.payment() + additionalCharge * 1.1;
    }
}
