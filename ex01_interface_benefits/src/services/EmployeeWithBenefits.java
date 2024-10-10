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
	
	/* 	stream = fluxo de dados. 
	 	mapToDouble = transforma os elementos em double
	  	Benefits::calculateBenefits = para cada elemento da lista, aplique o método 
	  	sum = soma os valores a cada interação
	*/
	 
	public double totalSalary() {
		double baseSalary = emp.calculateSalary();
		double totalBenefits = ben.stream().mapToDouble(Benefits::calculateBenefits).sum();		
		
		return baseSalary + totalBenefits;
	}

	/* 	forEach = executa algo em cada elemento da lista
	  	ben -> = para o parametro bem, execute... 
	*/
	
	public void displayBenefits() {
		System.out.println("Benefícios de " + emp.getName() + ":");
		ben.forEach(benefit -> System.out.println(benefit.descriptionBenefits()));
	}
	
	public Employee getEmp() {
		return emp;
	}
}
