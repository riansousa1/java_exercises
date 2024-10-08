package entities;

import services.Employee;

public class Trainee implements Employee{

	private String name;
	
	public Trainee(String name) {
		this.name = name;
	}
	
	@Override
	public double calculateSalary() {
		return 2000.0;
	}

	@Override
	public String getName() {		
		return name;
	}

	@Override
	public String getFunction() {
		return "Trainee";
	}

}
