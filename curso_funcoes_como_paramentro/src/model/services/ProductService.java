package model.services;

import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class ProductService {
	public double sumPrices(List<Product> list, Predicate<Product> criatire) {
		double sum = 0.0;
		for(Product p : list) {
			if(criatire.test(p)) {
				sum += p.getPrice();
			}
		}
		return sum;
	}
}
