package aula_dev;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DataHora {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Brazil/East"));
		int hora = calendar.get(Calendar.HOUR_OF_DAY);
		System.out.println(hora);
		

	}

}
