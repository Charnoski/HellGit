package aula6;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Aula6 {
	public static void main(String[] args) {

		DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL);

		Date data1 = new Date();
		GregorianCalendar gc = new GregorianCalendar();

		System.out.println("hoje é " + df4.format(data1) + " e agora são " + gc.get(Calendar.HOUR_OF_DAY) + " horas e "
				+ gc.get(Calendar.MINUTE) + " minutos.");

	}
}
