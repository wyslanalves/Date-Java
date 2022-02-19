package modulo_data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GerandoParcelasMensaisEmSuaData {

	public static void main(String[] args) throws ParseException {

		Date dataInicial = new SimpleDateFormat("dd/MM/yyyy").parse("18/02/2022");

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataInicial);

		for (int parcelas = 1; parcelas <= 12; parcelas++) {
			calendar.add(Calendar.MONTH, 1);
			
			System.out.println("Parcelas N�meros " + parcelas + " vencimento � em: " + new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
		}
	}

}
