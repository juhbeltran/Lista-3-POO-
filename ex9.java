import java.util.Scanner;
public class ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			 
			 Scanner entrada = new Scanner(System.in);
			  
			  System.out.print("Informe  número da tabuada que deseja: "); int num =
			  entrada.nextInt(); final int TAM = 10;
			 
			  for (int i = 0; i<=TAM; i++) {
			 
			 System.out.println(num + "x" + i + " =" + (num * i)); } 
			  entrada.close();
		
	}

}
