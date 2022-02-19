package modulo_data;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FaixaDeTempoComChronoUnit {

	public static void main(String[] args) throws ParseException {

		//Date dataPassada = new SimpleDateFormat("dd/MM/yyyy").parse("01/02/2021");
		
		
		long dias = ChronoUnit.DAYS.between(LocalDate.parse("2022-02-01"), LocalDate.now());
		
		System.out.println("Possui " + dias + " dias entre a faixa data");
	}

}
