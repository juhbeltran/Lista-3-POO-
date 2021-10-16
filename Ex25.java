import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		
		System.out.print("Informe  o valor dos produtos: ");
		float num = entrada.nextInt();
		final int TAM = 50;

		for (float i = 0; i <= TAM; i++) {

			System.out.println(i+ "x" + num + " =" + (num * i));
		}
		entrada.close();

	}

}
