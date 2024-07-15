package application;

import java.util.Locale;
import java.util.Scanner;

import services.BrazilnterestService;
import services.Interest;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite todos os campos");
		System.out.print("Valor por mês: ");
		double amount = sc.nextDouble();
		System.out.print("Qauntidade de meses: ");
		int months = sc.nextInt();
		
		Interest is = new BrazilnterestService(2.0);
		double payment = is.payment(amount, months);
		
		System.out.println(String.format("%.2f", payment));
		sc.close();

	}

}
