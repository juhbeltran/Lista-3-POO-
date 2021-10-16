
import java.util.Scanner;

public class Ex14 {
	public static void main(String args[]) {

		Scanner entrada = new Scanner(System.in);
		int fatorial = 1;
		int s = 0;
		int b = 0;
		System.out.print("Entre com o numero: ");
		int n1 = entrada.nextInt();

		for (int i = 1; i <= n1; i++) {

			s = s + 1;
			b = b + 2;
			System.out.print("S= ");
			System.out.print( s + "/" + b + "+");
		}

	}
}
