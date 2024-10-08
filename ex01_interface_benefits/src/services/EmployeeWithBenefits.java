package services;

import java.util.ArrayList;
import java.util.List;

public class EmployeeWithBenefits {

	private Employee emp;
	private List<Benefits> ben = new ArrayList<>();

	public EmployeeWithBenefits(Employee emp) {
		this.emp = emp;
	}

	public void addBenefits(Benefits benefits) {
		ben.add(benefits);
	}

	public void removeBenefits(Benefits benefits) {
		ben.remove(benefits);
	}

	public List<Benefits> getBenefits() {
		return ben;
	}
	
	/* stream = fluxo de dados. mapToDouble = transforma os elementos em double
	 * Benefits::calculateBenefits = para cada elemento da lista, aplique o método
	 * Soma o total dos valores
	 * */
	 
	public double totalSalary() {
		double baseSalary = emp.calculateSalary();
		double totalBenefits = ben.stream().mapToDouble(Benefits::calculateBenefits).sum();		
		
		return baseSalary + totalBenefits;
	}

	public String toString() {
		StringBuilder benefitsDescriptions = new StringBuilder();
		for (Benefits benefit: ben) {
			benefitsDescriptions.append(benefit.descriptionBenefits()).append("\n");
		}
		
		return "Employee: " + emp.getName() + ", Function: " + emp.getFunction() + ", Salary: R$ "
				+ String.format("%.2f", emp.calculateSalary()) + "\n" + benefitsDescriptions + "\n" + "Benefits Total: " + totalSalary();
	}
}
