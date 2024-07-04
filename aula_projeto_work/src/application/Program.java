package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) {
		
		DateTimeFormatter formt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter department's name: ");
		String department = sc.next();
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Level: ");
		sc.nextLine();
		String level = sc.next();
		System.out.print("Base salary: ");
		Double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(department));
		
		System.out.print("How many contracts to this worker? ");
		int w = sc.nextInt();
		
		for(int i =0; i<w ; i++) {
			System.out.println("Enter contract #"+i+" data: ");
			System.out.print("Date (DD/MM/YYYY): ");
			LocalDate contractDate = LocalDate.parse(sc.next(), formt1);
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String stringDate = sc.next();
		int month = Integer.parseInt(stringDate.substring(0, 2));
		int year = Integer.parseInt(stringDate.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for "+month+"/"+ year + ": "+ String.format("%.2f", worker.inCome(year, month)));
		sc.close();

	}

}