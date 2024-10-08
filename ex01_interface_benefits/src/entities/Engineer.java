package entities;

import services.Employee;

public class Engineer implements Employee{
	
	private String name;
	
	public Engineer(String name) {
		this.name = name;
	}

	@Override
	public double calculateSalary() {	
		return 7000.0;
	}

	@Override
	public String getName() {	
		return name;
	}

	@Override
	public String getFunction() {	
		return "Engineer";
	}

}
