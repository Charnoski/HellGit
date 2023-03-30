package proj;

import java.util.Scanner;

public class Pro {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("informe uma frase : ");

		String frase = new String(teclado.nextLine());

		System.out.println("O Tamanho da sua frase é de = " + frase.length() + " caracteres");

		String frase2 = frase.trim();
		System.out.println(frase2);
		int contarVogais = 0;
		frase2.toLowerCase();

		for (int cont = 0; cont < frase.length(); cont++) {
			char c = frase.charAt(cont);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				contarVogais++;
		}
		System.out.println("o Numero de Vogais é : " + contarVogais);
		String[] vetor = frase2.split("\\s+");
		System.out.println("O numero de palavras é : " + vetor.length);

		String[] nulos = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0" };

		for (int i = 0; i < nulos.length; i++)
			frase = frase.replaceAll(nulos[i], "*");

		System.out.println(frase);
		teclado.close();
	}
}
