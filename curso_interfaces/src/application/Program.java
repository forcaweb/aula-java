package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Room;
import entities.TaxRoom;

public class Program {

	public static void main(String[] args) {
		DateTimeFormatter ftmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Numero do quarto: ");
		int numRoom = sc.nextInt();
		sc.nextLine();
		System.out.print("Data de checkin (dd/mm/yyyy): ");
		LocalDateTime checkIn = LocalDateTime.parse(sc.nextLine(), ftmt);
		System.out.print("Data de checkout (dd/mm/yyyy): ");
		LocalDateTime checkOut = LocalDateTime.parse(sc.nextLine(), ftmt);
		System.out.print("Valor por dia: ");
		double valuePerDay = sc.nextDouble();
		
		Room r1 = new Room(numRoom, checkIn, checkOut, valuePerDay, new TaxRoom());
		
		System.out.println("R1: Número do Quarto - "
		+ r1.getNumRoom() + ", Checkin - "
		+ r1.getCheckIn() + ", Checkout - " 
		+ r1.getCheckOut() + ", Valor Total: " 
		+ r1.total() + ", Taxa: "
		+ r1.getTax().tax(r1.total()));
		
		sc.close();
	}

}
