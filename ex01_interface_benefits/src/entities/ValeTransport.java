package entities;

import services.Benefits;

public class ValeTransport implements Benefits {

	private double value;

	public ValeTransport(double value) {
		this.value = value;
	}

	@Override
	public double calculateBenefits() {
		return value;
	}

	@Override
	public String descriptionBenefits() {
		return "Benefits description: CPTM";
	}

}
