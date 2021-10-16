import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		 int i = 0;
		int n1 = 0;
		int n2 = 0;
				
	
		do {
		System.out.print("Digite um numero inteiro: ");
		n1 = entrada.nextInt();
		System.out.print("Digite outro numero inteiro: ");
		 n2 = entrada.nextInt();
		
		}while (n2 < n1);
		
		for ( i = (n1+1); i < n2; i++) {
			System.out.println(i);
		}
		
		entrada.close();
		
	}

}
