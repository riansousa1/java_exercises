package entities;

import services.Benefits;

public class MealVoucher implements Benefits {

	private double value;
	
	public MealVoucher(double value) {
		this.value = value;
	}

	@Override
	public double calculateBenefits() {
		return value;
	}

	@Override
	public String descriptionBenefits() {
		return "MealVoucher price: R$ " + value;
	}

}
