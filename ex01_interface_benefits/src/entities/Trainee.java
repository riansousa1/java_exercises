package entities;

import services.Employee;

public class Trainee implements Employee{

	private String name;
	private String function;
	private int daysWorked;
	
	public Trainee(String name, String function, int daysWorked) {
		this.name = name;
		this.function = function;
		this.daysWorked = daysWorked;
	}
	
	public int getDaysWorked() {
		return daysWorked;
	}
	
	@Override
	public double calculateSalary() {
		return 60.0 * daysWorked;
	}

	@Override
	public String getName() {		
		return name;
	}

	@Override
	public String getFunction() {
		return function;
	}

}
