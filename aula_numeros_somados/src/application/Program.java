package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] vector = new double[n];
		double sum = 0;
		
		for(int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vector[i] = sc.nextDouble();
		}
		
		System.out.print("Valores :");
		
		for(int i = 0; i < n; i++) {
			System.out.print(" " + vector[i] + " ");
		}
		
		System.out.print("Soma :");
		
		for(int i = 0; i < n; i++) {
			sum += vector[i];
		}
		
		System.out.print(" " + sum + " ");
		
		
		double media = sum / n;
		
		System.out.print("Média :");
		
		System.out.print(" " + media + " ");
		
		sc.close();
	}

}
