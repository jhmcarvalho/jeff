package util;

import java.util.Calendar;
import java.util.TimeZone;

import frases.ViewFrases;

public class Horario {
	
	public static String BoasVindas() {
		Calendar calendar = Calendar.getInstance(TimeZone
				.getTimeZone("Brazil/East"));
		int hora = calendar.get(Calendar.HOUR_OF_DAY);
		// System.out.println(hora);
		if (hora < 12) {
			
			return "Bom dia";
		} else {
			return "Boa tarde";
		}

	}

}
