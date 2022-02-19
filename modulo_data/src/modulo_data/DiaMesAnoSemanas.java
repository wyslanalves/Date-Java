package modulo_data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DiaMesAnoSemanas {

	public static void main(String[] args) {
		
		
		LocalDate localDate = LocalDate.now();
		System.out.println("Data Atual : " + localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("Dia da Semana : " + localDate.getDayOfWeek());
		System.out.println("Dia da Mes : " + localDate.getDayOfMonth());
		System.out.println("qual mes do ano  : " + localDate.getMonthValue());
		System.out.println(" ano  : " + localDate.getYear());

	}

}
