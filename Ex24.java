import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		float valor = 0;
		float soma = 0;
		float n2 = 0;
		float media = 0;
		System.out.print("Informe a quantidade de CD's: ");
		int cd = entrada.nextInt();
		for (int i = 0; i < cd; i++) {
			System.out.println("Infome seu valor pago:");
			valor = entrada.nextInt();
			soma = soma + valor;

			n2++;
		}
		media = (soma / n2);
		System.out.println("O valor total gasto com a coleção é de: R$ " + soma);
		System.out.println("O valor médio gasto com a coleção é de: R$ " + media);
		entrada.close();
	}
}