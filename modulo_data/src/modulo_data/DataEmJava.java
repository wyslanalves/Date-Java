package modulo_data;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DataEmJava {

	public static void main(String[] args) throws Throwable   {
		
		
		
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
			
			Date dataVencimwntoboleto =   simpleDateFormat.parse("18/02/2022");
			
			Date dataDeHoje =  simpleDateFormat.parse("17/02/2022");
			
			
			//after - se data 1 e maior que data 2 
			//before - se data 1 e menor que data 2 
			
			if(dataVencimwntoboleto.after(dataDeHoje)) { // after - posterior ou depois ou maior
				System.out.println("boleto não vencido!!!");
			}else {
				System.out.println("URGENTE!! - boleto vencido");
			}
		
			if(dataVencimwntoboleto.before(dataDeHoje)) { // before - anterior
				System.out.println("boleto não vencido!!!");
			}else {
				System.out.println("URGENTE!! - boleto vencido");
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		Calendar calendar = Calendar.getInstance();
		
		Date data = new Date();
		
	
		System.out.println("Dia do mês " + data.getDate());
		System.out.println("Calendar dia do mês " + calendar.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("Dia da semana " + data.getDay());
		System.out.println("Calendar dia da semana " + (calendar.get(Calendar.DAY_OF_WEEK) - 1));
		
		System.out.println("Hora " + data.getHours());
		System.out.println("Calendar Hora do dia " + calendar.get(Calendar.HOUR_OF_DAY));
		
		System.out.println("Minuto da Hora " + data.getMinutes());
		System.out.println("Calendar Minuto do dia " + calendar.get(Calendar.MINUTE));
		
		System.out.println("Horas do dia " + data.getMonth());
		
		System.out.println("Segundos " + data.getSeconds());
		System.out.println("Calendar  Segundos " + calendar.get(Calendar.SECOND));
		
		System.out.println("Data em milesegundos " + data.getTime());
		System.out.println("Calendar em milesegunfod " + calendar.getTimeInMillis());
		
		System.out.println(data.getTimezoneOffset());
		
		System.out.println("Ano " + (data.getYear() + 1900));
		System.out.println("Calendar Ano " + calendar.get(Calendar.YEAR));
		/*=========================Simplo date Format========================*/
		/*
		SimpleDateFormat  simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		System.out.println("Data atual em formato padrão e String " + simpleDateFormat.format(data));
		System.out.println("Calendar atual em formato padrão e String " + simpleDateFormat.format(calendar.getTime()));
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");// formato em banco de dados
		
		System.out.println("Formato para grava em banco de dados " + simpleDateFormat.format(data));
		System.out.println("Calendar para grava em banco de dados " + simpleDateFormat.format(calendar.getTime()));

		System.out.println("Objeto Date " + simpleDateFormat.parse("1994-10-10 13:20.2"));
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(simpleDateFormat.parse("20-12-1994"));
		
		*/
	}

}
