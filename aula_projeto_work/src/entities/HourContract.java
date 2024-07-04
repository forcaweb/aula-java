package entities;

import java.time.LocalDate;

public class HourContract {
	private LocalDate date;
	private Double valuePerHours;
	private Integer hours;
	
	public HourContract() {}

	public HourContract(LocalDate date, Double valuePerHours, Integer hours) {
		this.date = date;
		this.valuePerHours = valuePerHours;
		this.hours = hours;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getValuePerHours() {
		return valuePerHours;
	}

	public void setValuePerHours(Double valuePerHours) {
		this.valuePerHours = valuePerHours;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	public Double totalValue() {
		return valuePerHours * hours;
	}
}
