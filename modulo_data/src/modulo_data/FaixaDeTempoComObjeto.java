package modulo_data;

import java.time.LocalDate;
import java.time.Period;

public class FaixaDeTempoComObjeto {

	public static void main(String[] args) {
		
		
		LocalDate dataAntiga = LocalDate.of(2021, 3, 7);
		
		LocalDate dataNova = LocalDate.of(2022, 2, 7);
		
		System.out.println("Data antiga e maior que data Nova : " + dataAntiga.isAfter(dataNova));
		
		System.out.println("Data antiga : " + dataAntiga.isBefore(dataNova));
		
		System.out.println("Data antiga sao iguais : " + dataAntiga.isEqual(dataNova));
		
		Period period = Period.between(dataAntiga, dataNova);
		
		System.out.println("quantos dias são :" + period.getDays());
		
		System.out.println("quantos meses :" + period.getMonths());
		
		System.out.println("quantos anos :" + period.getYears());
		
		System.out.println("Periodo é  :" + period.getYears());
	}

}
