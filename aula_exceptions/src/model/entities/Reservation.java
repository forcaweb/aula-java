package model.entities;

import java.time.Duration;
import java.time.LocalDateTime;

public class Reservation {
	private Integer roomNumber;
	private LocalDateTime checkIn;
	private LocalDateTime checkOut;
	
	public Reservation() {}

	public Reservation(Integer roomNumber, LocalDateTime checkIn, LocalDateTime checkOut) {
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

	public LocalDateTime getCheckIn() {
		return checkIn;
	}

	public LocalDateTime getCheckOut() {
		return checkOut;
	}
	
	public void updateDates(LocalDateTime checkIn, LocalDateTime checkOut) {
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	public long duration() {
		Duration t = Duration.between(checkOut, checkIn);
		return t.toDays();
	}
}
