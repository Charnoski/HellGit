package proj;

import java.util.Scanner;

public class Aula2 {
/*Construir um programa que leia 3 números inteiros no intervalo entre 1 e 9.*/
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int[] vetor = new int[3];
		
		for(int cont=0; cont< vetor.length;) {
			int num = teclado.nextInt();
			
			if (num >= 1 && num <= 9) {
				vetor[cont]= num;
				cont++;
			}
			
		}
		
		for (int num: vetor) {
			
			System.out.println(num);
		}
			
		
		teclado.close();
	}
	
}
