
import java.util.Scanner;

public class Ex15 {
	public static void main(String args[]) {

		
		
		int s1 = 37;

		int s2 = 38;
		float resultado = 0;
		
		System.out.print("Série = ");

        for (int b = 1; b <= 37; b++) {

				
			if (b>=2);
			System.out.print(" + ");
			
			System.out.print(s1+"*"+s2+"/"+b);
			s1--;
			s2--;
			resultado = resultado + ((s1*s2)/b);
		}			
        
        
        System.out.println("= "+resultado);
        

}
}
