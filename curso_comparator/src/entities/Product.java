package entities;

public class Product {
	private String name;
	private Double pirce;
	
	public Product() {
	}

	public Product(String name, Double pirce) {
		this.name = name;
		this.pirce = pirce;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPirce() {
		return pirce;
	}

	public void setPirce(Double pirce) {
		this.pirce = pirce;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", pirce=" + pirce + "]";
	}
}
