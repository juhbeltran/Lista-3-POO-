import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float soma = 0;
		float media = 0;
		float termo = 0;
		float n2 = 0;
		System.out.print("Informe a quantidade de némeros do conjunto: ");
		float n1 = entrada.nextInt();
		for (int i = 0; i < n1; i++) {

			System.out.println("Informe um valor");
			termo = entrada.nextInt();
			soma = soma + termo;
			n2++;
		}
                media = (soma / n2);
		System.out.println("A média artmética é: " + media);
		entrada.close();
	}
}
