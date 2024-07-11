package entities;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Room {
	private Integer numRoom;
	private LocalDateTime checkIn;
	private LocalDateTime checkOut;
	private Double valuePerDay;
	
	private Taxs tax;
	
	DateTimeFormatter ftmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	
	public Room() {}

	public Room(Integer numRoom, LocalDateTime checkIn, LocalDateTime checkOut, Double valuePerDay, Taxs tax) {
		super();
		this.numRoom = numRoom;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.valuePerDay = valuePerDay;
		this.tax = tax;
	}

	public Integer getNumRoom() {
		return numRoom;
	}

	public void setNumRoom(Integer numRoom) {
		this.numRoom = numRoom;
	}

	public String getCheckIn() {
		return checkIn.format(ftmt);
	}

	public void setCheckIn(LocalDateTime checkIn) {
		this.checkIn = checkIn;
	}

	public String getCheckOut() {
		return checkOut.format(ftmt);
	}

	public void setCheckOut(LocalDateTime checkOut) {
		this.checkOut = checkOut;
	}

	public Taxs getTax() {
		return tax;
	}
	
	public void setTax(Taxs tax) {
		this.tax = tax;
	}

	public Double getValuePerDay() {
		return valuePerDay;
	}

	public void setValuePerDay(Double valuePerDay) {
		this.valuePerDay = valuePerDay;
	}

	public double total() {
		Duration drt = Duration.between(checkIn, checkOut);
		int days = (int) drt.toDays();
		double result = days * valuePerDay;
		return result;
	}
}
