import java.util.Scanner;
public class Ex4_1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe a popula��o da primeira cidade: ");
		float p1 = entrada.nextFloat();
		System.out.print("Informe o percentual de crscimento desta cidade: ");
		float c1 = entrada.nextFloat();
		c1 = (float)(c1/100);
		
		System.out.print("Informe a popula��o da segunda cidade: ");
		float p2 = entrada.nextFloat();
		System.out.print("Informe o percentual de crscimento desta cidade: ");
		float c2 = entrada.nextFloat();
		c2 = (float)(c2/100);
        int anos = 0;
        
       if (p1<p2) {
        do {
        	p1 = (float) (p1 + (p1*c1));
            p2 = (float) (p2 + (p2*c2));
               anos++;      
        } while (p1<p2);
       
       System.out.print("A quantidade de anos necess�rios para que a  primeira popula��o seja maior ou igual a segunda � : "+ anos + " anos");
       }

       if (p2<p1) {
           do {
           	p1 = (float) (p1 + (p1*c1));
               p2 = (float) (p2 + (p2*c2));
                  anos++;      
           } while (p2<p1);
       }
    	  System.out.print("A quantidade de anos necess�rios para que a  segunda popula��o seja maior ou igual a primeira � : "+ anos + " anos");;
        entrada.close();	

	}

}
