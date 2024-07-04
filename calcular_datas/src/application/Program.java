package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2024-06-25");
		LocalDateTime d05 = LocalDateTime.parse("2024-06-25T16:33:01");
		Instant d06 = Instant.parse("2024-06-25T16:33:00Z");
		
		// Diminuir e aumentar horas, dias, mes e ano
		
		LocalDateTime diasSubtraida = d05.minusDays(7);
		LocalDateTime diasSomado = d05.plusDays(7);
		
		LocalDate diasSubtraidaDate = d04.minusDays(7);
		LocalDate diasSomadoDate = d04.plusDays(7);
		
		Instant diasSubtraidaInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant diasSomadoInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("diasSubtraida: " + diasSubtraida);
		System.out.println("diasSomado: " + diasSomado);
		
		System.out.println("diasSubtraidaDate: " + diasSubtraidaDate);
		System.out.println("diasSomadoDate: " + diasSomadoDate);
		
		System.out.println("diasSubtraidaInstant: " + diasSubtraidaInstant);
		System.out.println("diasSomadoInstant: " + diasSomadoInstant);
		
		// Comparando tempo entre datas
		
		Duration t1 = Duration.between(diasSubtraida, d05);
		Duration t2 = Duration.between(diasSubtraidaDate.atTime(0, 0), d04.atTime(0, 0));
		Duration t3 = Duration.between(diasSubtraidaInstant, d06);
		
		System.out.println("t1: " + t1.toDays());
		System.out.println("t2: " + t2.toDays());
		System.out.println("t3: " + t3.toDays());
	}

}
