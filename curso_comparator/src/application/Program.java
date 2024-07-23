package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		list.add(new Product("Notebook", 1300.00));
		list.add(new Product("TV", 2300.00));
		list.add(new Product("Mesa", 300.00));
		
		list.sort((p1, p2)->p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		for(Product x : list) {
			System.out.println(x);
		}
	}

}
