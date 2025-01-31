package application;

import entities.Employee;
import entities.OutSourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("Enter the number of employee: ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n) ?: ");
			char outsourced = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hour: ");
			int hour = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			if (outsourced == 'y') {
				System.out.print("Additional charge: ");
				double additional = sc.nextDouble();
				list.add(new OutSourcedEmployee(name, hour, valuePerHour, additional));
			} else {
				list.add(new Employee(name, hour, valuePerHour));
			}
		}

		System.out.println();
		System.out.println("PAYMENTS:");

		for (Employee e : list) {
			System.out.println(e.getName() + " - $ " + String.format("%.2f", e.payment()));
		}


		sc.close();
	}

}
