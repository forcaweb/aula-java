package model.entities;

import java.time.Duration;
import java.time.LocalDate;

import model.exception.DomainException;

public class Reservation {
	private Integer roomNumber;
	private LocalDate checkIn;
	private LocalDate checkOut;
	
	public Reservation() {}

	public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) throws DomainException {
		if(!checkOut.isAfter(checkIn)) {
			throw new DomainException("Datas checkout devem ser futuras a checkin");
		}
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public LocalDate getCheckIn() {
		return checkIn;
	}

	public LocalDate getCheckOut() {
		return checkOut;
	}
	
	public void updateDates(LocalDate checkIn, LocalDate checkOut) throws DomainException {
		LocalDate d = LocalDate.now();
		if(checkIn.isBefore(d) || checkOut.isBefore(d)) {
			throw new DomainException("Datas devem ser futuras");
		}
		if(!checkOut.isAfter(checkIn)) {
			throw new DomainException("Datas checkout devem ser futuras a checkin");
		}
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	public long duration() {
		Duration t = Duration.between(checkIn.atStartOfDay(), checkOut.atStartOfDay());
		return t.toDays();
	}

	@Override
	public String toString() {
		return "Número do quarto: "
				+ roomNumber
				+ ", Checkin: "
				+ checkIn
				+ ", Chekout: "
				+ checkOut
				+ ", "
				+ duration()
				+ " Dias.";
	}

}
