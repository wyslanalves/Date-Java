package modulo_data;

import java.time.Duration;
import java.time.Instant;

public class TempoDeProcessoDeInstant {

	public static void main(String[] args) throws InterruptedException {
		
		
		Instant inicio = Instant.now(); 
		
		Thread.sleep(2000);
		
		Instant iFinal = Instant.now(); 
		
		Duration duration = Duration.between(inicio, iFinal);
		
		System.out.println("duração em nanus Segundos " + duration.toNanos());
		
		System.out.println("duração em Minutos " + duration.toMinutes());
		
		System.out.println("duração em Horas " + duration.toHours());
		
		System.out.println("duração em MilesSegundos " + duration.toMillis());
		
		System.out.println("duração em Dias " + duration.toDays());

	}

}
