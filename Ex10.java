import java.util.Scanner;

public class Ex10 {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		int n1 = 0;
		int n2 = 0;
		int resultado = 1;
		System.out.print("Digite um n�mero: ");
		n1 = entrada.nextInt();
		System.out.print("Digite outro n�mero: ");
		n2 = entrada.nextInt();
		for (int i = 1; i <= n2; i++) {
			resultado = resultado * n1;
		}
		System.out.println(" O resulado �: " + resultado);
		entrada.close();
	}
}
