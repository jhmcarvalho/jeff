package util;

import java.util.Calendar;
import java.util.TimeZone;

public class Horario {

	public static void BoasVindas() {
		Calendar calendar = Calendar.getInstance(TimeZone
				.getTimeZone("Brazil/East"));
		int hora = calendar.get(Calendar.HOUR_OF_DAY);
		String showHora;
		// System.out.println(hora);
		if (hora < 12) {
			showHora = "Bom dia";// , usuario;
		} else {
			showHora = "Boa tarde";// , usuario;
		}

	}

}
