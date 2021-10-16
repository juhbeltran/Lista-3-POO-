import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		int nulo = 0;
		int voto = 0;

		System.out.print("Informe a quantidade de eleitores: ");
		int n1 = entrada.nextInt();
		for (int i = 0; i < n1; i++) {
			System.out
					.println("Infome seu voto: (1) Primiro candidato, (2) Segundo candidato e (3) Terceiro candidato");
			voto = entrada.nextInt();

			if (voto == 1) {
				c1 = c1 + 1;
			} else if (voto == 2) {
				c2 = c2 + 1;
			} else if (voto == 3) {
				c3 = c3 + 1;
			} else
				nulo = nulo + 1;

		}
		System.out.println("A quatidade de votos nulos foi: " + nulo);
		System.out.println("Quantidade de votos candidato 1: " + c1);
		System.out.println("Quantidade de votos candidato 2: " + c2);
		System.out.println("Quantidade de votos candidato 3: " + c3);
		entrada.close();
	}
}
