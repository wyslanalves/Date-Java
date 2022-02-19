package modulo_data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class NovaApiDeData {

	public static void main(String[] args) {
		
		
		/*Nova API de data a parti do Java 8*/
		
		LocalDate dataAtual = LocalDate.now();
		System.out.println("Data atual : " + dataAtual);
		
		LocalTime horaAtual = LocalTime.now();
		System.out.println("Hora atual : " + horaAtual);
		
		LocalDateTime horaMaisData = LocalDateTime.now();
		System.out.println("Hora atual + Data : " + horaMaisData);
		System.out.println("Hora atual + Data : " + horaMaisData.format(DateTimeFormatter.ISO_DATE));
		System.out.println("Hora atual + Data : " + horaMaisData.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
	
	}

}
