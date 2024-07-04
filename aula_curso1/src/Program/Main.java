package Program;

import java.util.Locale;
import java.util.Scanner;

import utils.DolarConvert;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o preço do dólar: ");
		DolarConvert.dolar = sc.nextDouble();
		
		System.out.print("Digite quanto quer comprar em dólar: ");
		DolarConvert.buyDolar = sc.nextDouble();
		
		double r = DolarConvert.result();
		System.out.printf("O valor em reais são: %.2f%n", r);
		
		sc.close();
	}

}
