package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Products;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Products prod = new Products();
		System.out.println("Cadastro de produto: ");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		prod.setName(name);
		
		System.out.print("Preço: ");
		double price = sc.nextDouble();
		prod.setPrice(price);
		
		System.out.println(prod.toString());
		
		System.out.print("Nova Quantidade: ");
		int qunatity = sc.nextInt();
		prod.addQuantity(qunatity);
		
		System.out.println(prod.toString());
		sc.close();
	}

}
