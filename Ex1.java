import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		float nota;

		do {
			System.out.println("Digite uma nota entre 0 e 10: ");
			nota = entrada.nextInt();

			if (nota < 0 || nota > 10) {
				System.out.println("Valor Inválido");
			}

		} while (nota < 0 || nota > 10);
		System.out.println("Valor válido: " + nota);
	}

}
