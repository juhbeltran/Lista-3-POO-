import java.util.Scanner;
public class Ex13 {
    public static void main(String args[]) {
     
    
    
        Scanner entrada = new Scanner(System.in);
		int fatorial = 1;
		
		System.out.print("Entre com o numero: ");
		int n1= entrada.nextInt();
		
						
		for (int i = 1; i <= n1; i++) {
			
			fatorial = fatorial*i;	
		}
			System.out.println(  n1+ "!"+fatorial);	
				
    }
}
