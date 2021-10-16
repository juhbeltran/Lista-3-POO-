import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int maior = 0;
		int menor = 0;
		int termo = 0;
		
		System.out.print("Informe a quantidade de némeros do conjunto: ");
		int n1 = entrada.nextInt();

		for (int i = 0; i < n1; i++) {

			System.out.println("Informe um valor");
			termo = entrada.nextInt();

			if (termo >= maior) {
				maior = termo;
			} else if (termo <= menor && maior>menor)
				;
			{
				menor = termo;

			}

		}
		
		System.out.println("Menor:" + menor);
		System.out.println("Maior:" + maior);
		System.out.println("Soma= " + (menor+maior));
		entrada.close();
	}
}