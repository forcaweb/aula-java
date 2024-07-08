package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Reservation;
import model.exception.DomainException;

public class Program {

	public static void main(String[] args) {
		
		DateTimeFormatter formt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try {
		System.out.print("Digite o número do quarto: ");
		int room = sc.nextInt();
		System.out.print("Digite a data de checkin (dd/mm/yyyy): ");
		LocalDate checkin = LocalDate.parse(sc.next(), formt);
		System.out.print("Digite a data de checkout (dd/mm/yyyy): ");
		LocalDate checkout = LocalDate.parse(sc.next(), formt);
		
		
		Reservation reservation = new Reservation(room, checkin, checkout);
		System.out.println("Reserva: " + reservation);
		
		System.out.print("Digite a data de checkin (dd/mm/yyyy): ");
		checkin = LocalDate.parse(sc.next(), formt);
		System.out.print("Digite a data de checkout (dd/mm/yyyy): ");
		checkout = LocalDate.parse(sc.next(), formt);
		
		reservation.updateDates(checkin, checkout);
		}
		catch (DomainException e) {
			System.out.print("Error: " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.print("Erro inesperado!");
		}
		sc.close();

	}

}
