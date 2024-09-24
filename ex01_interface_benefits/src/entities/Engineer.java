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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getFunction() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String toString() {
		return "Employee: " + name + ", Function: " + function + ", Salary: " + calculateSalary();
	}

}
