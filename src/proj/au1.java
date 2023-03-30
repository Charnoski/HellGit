package proj;

public class au1 {

	public static void main(String[] args) {

		String frase = "SOU ALUNO DE COMPUTAÇÃO DA UNOESC";
		System.out.println("Na ordem original " + frase);
		StringBuilder mensagem = new StringBuilder(frase);
		mensagem.reverse();
		System.out.println("Na ordem inversa " + mensagem);

	}

}
