package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		DateTimeFormatter formt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		DateTimeFormatter formt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
		
		// Trabalhando com Data
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2024-06-25");
		LocalDateTime d05 = LocalDateTime.parse("2024-06-25T16:33:01");
		Instant d06 = Instant.parse("2024-06-25T16:33:00Z");
		Instant d07 = Instant.parse("2024-06-25T16:33:00-03:00");
		
		LocalDate d08 = LocalDate.parse("25/06/2024", formt1);
		LocalDateTime d09 = LocalDateTime.parse("25/06/2024 03:30:01", formt2);
		LocalDate d10 = LocalDate.of(2024, 6, 25);
		LocalDateTime d11 = LocalDateTime.of(2024, 6, 25, 10, 20);
		
		System.out.println("Trabalhando com Data");
		
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		System.out.println("d10 = " + d10);
		System.out.println("d11 = " + d11);
		
		// Formatar data em Texto
		System.out.println("Formatar data em Texto");
		
		System.out.println("d04 em texto = " + d04.format(formt1));
		System.out.println("d05 em texto = " + d05.format(formt2));
		System.out.println("d05 em texto = " + formt3.format(d06));
	}

}
