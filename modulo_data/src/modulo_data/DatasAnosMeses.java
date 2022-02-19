package modulo_data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatasAnosMeses {

	public static void main(String[] args) {
		
		LocalDate dataBase = LocalDate.parse("2022-01-01");
		System.out.println("Mais 5 dias : " + (dataBase =  dataBase.plusDays(5)));
		System.out.println("Mais 5 semanas : " +  (dataBase = dataBase.plusWeeks(5)));
		System.out.println("Mais 5 anos : " + (dataBase =  dataBase.plusYears(5)));
		System.out.println("Mais 2 meses : " + (dataBase =  dataBase.plusMonths(2)));
		
		
		System.out.println("==========Data Menos==================");
		System.out.println("Menos 1 ano : " + (dataBase =  dataBase.minusDays(1)));
		System.out.println("Menos 1 mes : " + (dataBase =  dataBase.minusMonths(1)));
		
		
		System.out.println("Menos 20 dias : " + (dataBase =  dataBase.minusDays(20)));
		
		System.out.println("***************Exemplo de geração de meses*************");
		
		for(int mes = 1; mes<=12; mes++) {
			dataBase =  dataBase.plusMonths(1);
			
			System.out.println("Data de Vencimento do boleto : " + 
			dataBase.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "do mês : " + mes);
		}
	}

}
