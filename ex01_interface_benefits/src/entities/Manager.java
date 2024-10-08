package entities;

import services.Employee;

public class Manager implements Employee {

	private String name;

	public Manager(String name) {
		this.name = name;
	}

	@Override
	public double calculateSalary() {
		return 9000.0;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getFunction() {
		return "Manager";
	}
}
