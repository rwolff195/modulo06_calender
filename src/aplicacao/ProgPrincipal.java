package aplicacao;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class ProgPrincipal {

	public static void main(String[] args) {
		
		// SOMANDO UMA UNIDADE DE TEMPO
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2019-05-15T12:16:15Z"));
		
		System.out.println("SOMANDO UMA UNIDADE DE TEMPO");
		System.out.println();
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		
		System.out.println();
		System.out.println(sdf.format(d));
		
		// OBTENDO UMA UNIDADE DE TEMPO
		
		Date d1 = Date.from(Instant.parse("2019-05-15T12:16:15Z"));
		
		System.out.println();
		System.out.println("OBTENDO UMA UNIDADE DE TEMPO");
		System.out.println();
		
		Calendar cal1 = Calendar.getInstance();
		cal.setTime(d1);
		int minutos = cal.get(Calendar.MINUTE);
		int mes = 1 + cal.get(Calendar.MONTH);
		
		System.out.println("Minutos: " + minutos);
		System.out.println("Mês: " + mes);
		
	}

}
