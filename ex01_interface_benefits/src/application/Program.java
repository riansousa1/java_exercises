package application;

import java.util.Scanner;

import entities.Engineer;
import entities.HealthPlan;
import entities.Manager;
import entities.MealVoucher;
import entities.Trainee;
import entities.ValeTransport;
import services.Employee;
import services.EmployeeWithBenefits;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to employee system");
		System.out.print("Enter the employee's name: ");
		String employeeName = sc.nextLine();
		
		System.out.print("Select the position: (1- Manager, 2- Engineer, 3- Trainee): ");
		int typeOfEmployee = sc.nextInt();
		sc.nextLine();
		
		Employee emp = null;
		
		switch(typeOfEmployee) {
		case 1:
			emp = new Manager(employeeName);
			break;
		case 2:
			emp = new Engineer(employeeName);
			break;
		case 3:
			emp = new Trainee(employeeName);
			break;
		default:
			System.out.println("Invalid employee type.");
			return;
		}
		
		EmployeeWithBenefits empWith = new EmployeeWithBenefits(emp);
		
		switch (typeOfEmployee) {
		case 1:
			empWith.addBenefits(new HealthPlan(300.0));
			empWith.addBenefits(new ValeTransport(200.0));
			empWith.addBenefits(new MealVoucher(150.0));
		break;
		case 2:
			empWith.addBenefits(new HealthPlan(300.0));
			empWith.addBenefits(new ValeTransport(200.0));
			empWith.addBenefits(new MealVoucher(100.0));
		break;
		case 3:
			empWith.addBenefits(new ValeTransport(200.0));
			empWith.addBenefits(new MealVoucher(60.0));
		break;
		default:
			System.out.println("Invalid type of employee.");
			return;
		}
		
		
		System.out.println("Employee information:");
		System.out.println("Name: " + emp.getName());
		System.out.println("Position: " + emp.getFunction());
		System.out.println("Total Salary: R$ " + empWith.totalSalary());
		System.out.println();
		
		empWith.displayBenefits();
		
		sc.close();
	}

}
