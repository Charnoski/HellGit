package aula6;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class Aula6 {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));

		DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG);
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL);

		Date data1 = new Date();

		System.out.println("Data formato padrão = " + data1);

		System.out.println("Data formato 1 = " + df1.format(data1));
		System.out.println("Data formato 2 = " + df2.format(data1));
		System.out.println("Data formato 3 = " + df3.format(data1));
		System.out.println("Data formato 4 = " + df4.format(data1));

		NumberFormat nf = NumberFormat.getCurrencyInstance();
		String formatado = nf.format(100);
		System.out.println(formatado);

	}
}
