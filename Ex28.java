import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int maior = 0;
		int menor = 0;
		int temp = 0;
		float n2 = 0;
		float soma = 0;
		float media = 0;
		System.out.print("Informe a quantidade de temperaturas: ");
		int n1 = entrada.nextInt();

		for (int i = 0; i < n1; i++) {

			System.out.println("Informe um valor");
			temp = entrada.nextInt();

			if (temp >= maior) {
				maior = temp;
			} else if (temp <= menor && maior > menor)
				;
			{
				menor = temp;

			}
			soma = soma + temp;

			n2++;
		}
		media = (soma / n2);
		System.out.println("Menor temperatura:" + menor);
		System.out.println("Maior temperatura:" + maior);
		System.out.println(" A temperaturamédia " + media);
		entrada.close();
	}
}