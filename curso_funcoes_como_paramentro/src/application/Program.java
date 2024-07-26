package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import model.services.ProductService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		list.add(new Product("Notebook", 1300.00));
		list.add(new Product("TV", 2300.00));
		list.add(new Product("Teste", 1300.00));
		list.add(new Product("Mesa", 300.00));
		
		ProductService ps = new ProductService();
		double sum = ps.sumPrices(list, p -> p.getName().charAt(0) == 'T');
		
		System.out.println("Soma = " + String.format("%.2f", sum));
	}

}
