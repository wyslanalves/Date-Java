package modulo_data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalculoDiaAnoMes {

	public static void main(String[] args) throws ParseException {

		Calendar calendar = Calendar.getInstance(); // pegar a data atual
		
		/*Simular data que vem no bando de dados */
		
		calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("18-02-2022"));
		
		calendar.add(Calendar.DAY_OF_MONTH,1);// data de hoje mais 5 dias
		System.out.println("somando dias do mes " + new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
		
		calendar.add(Calendar.MONTH,1);
		System.out.println("somando o mes " + new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
		
		calendar.add(Calendar.YEAR,1);
		System.out.println("somando Ano  " + new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));

	}

}
