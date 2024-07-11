package entities;

public class TaxRoom implements Taxs{
	public double tax(double amount) {
		return amount * 0.2;
	}
}
