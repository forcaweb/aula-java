import java.util.Scanner;

import Entities.AulaOOClasses;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		AulaOOClasses x;
		double result;
		x = new AulaOOClasses();
		
		System.out.println("Digite primeiro número: ");
		x.a = sc.nextDouble();
		System.out.println("Digite primeiro número: ");
		x.b = sc.nextDouble();
		result = x.a + x.b;
		System.out.printf("Resultado: A+B = %f%n", result);
		sc.close();
		/*String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 31;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		System.out.printf("%s, which price is $ %.2f%n", product2, price2);
		
		System.out.printf("Record: %d year old, code %d and gender %s%n", age, code, gender);
		System.out.printf("Measue with decimal places: %f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("US decimal point: %.3f%n", measure);*/
	}

}
