package entities;

public class Products {
	private String name;
	private double price;
	private int quantity;
	
	public Products() {}
	
	public Products(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Products(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public double totalPrice() {
		return price * quantity;
	}

	public int addQuantity(int quantity) {
		return this.quantity += quantity;
	}
	
	public void removeQuantity(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return "Nome: "
				+ this.getName()
				+ ", Preço: "
				+ this.getPrice()
				+ ", Quantidade: "
				+ this.getQuantity()
				+ ", Total: R$"
				+ this.totalPrice();
	}
	
}
