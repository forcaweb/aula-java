package entities;

public class Employers {
	private Integer id;
	private String name;
	private String func;
	private Double salary;
	
	public Employers() {}

	public Employers(Integer id, String name, String func, Double salary) {
		this.id = id;
		this.name = name;
		this.func = func;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFunc() {
		return func;
	}

	public void setFunc(String func) {
		this.func = func;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public void increasentSalary(Double porcetage) {
		salary += salary * porcetage / 100.0;
	}

	@Override
	public String toString() {
		return "Employers id=" + id + ", name=" + name + ", func=" + func + ", salary=" + salary;
	}

	
}
