package entities;

import services.Benefits;

public class HealthPlan implements Benefits {
	
	private double value;
	
	public HealthPlan(double value) {	
		this.value = value;
	}

	@Override
	public double calculateBenefits() {		
		return value;
	}

	@Override
	public String descriptionBenefits() {
		return "HealthPlan price: R$ " + value;
	}
	
}
