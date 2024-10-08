package entities;

import services.Employee;

public class Engineer implements Employee{
	
	private String name;
	private String function;
	private int daysWorked;
	
	public Engineer(String name, String function, int daysWorked) {
		this.name = name;
		this.function = function;
		this.daysWorked = daysWorked;
	}
	
	public int getDaysWorked() {
		return daysWorked;
	}

	@Override
	public double calculateSalary() {	
		return 150.00 * daysWorked;
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
