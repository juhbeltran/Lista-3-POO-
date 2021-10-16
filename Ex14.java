
import java.util.Scanner;

public class Ex14 {
	public static void main(String args[]) {

		Scanner entrada = new Scanner(System.in);
		
		
		int b = 1;
		System.out.print("Entre com o numero: ");
		int n1 = entrada.nextInt();
		System.out.print("Série = ");
		for (int s = 1; s <= n1; s++) {

			
			if (s>1);
			System.out.print(" + ");
			
			System.out.print(s+"/"+b);
			b=b+2;
			
		}

	}
}
