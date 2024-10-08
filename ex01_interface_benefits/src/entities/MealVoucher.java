package entities;

import services.Benefits;

public class MealVoucher implements Benefits {

	private double value;

	@Override
	public double calculateBenefits() {
		return value;
	}

	@Override
	public String descriptionBenefits() {
		return "Benefit description: R$ " + value;
	}

}
