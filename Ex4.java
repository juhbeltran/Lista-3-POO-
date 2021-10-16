import java.util.Scanner;
public class Ex4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		float p1 = 80000;
		float p2 = 200000;
        int anos = 0;
        
       
        do {
        	p1 = (float) (p1 + (p1*0.03));
            p2 = (float) (p2 + (p2*0.015));
               anos++;      
        } while (p1<p2);
        
        System.out.print("A quantidade de anos necessários é: "+ anos + " anos");
        entrada.close();		
	}

}
