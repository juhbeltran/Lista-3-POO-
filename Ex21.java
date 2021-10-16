import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		float soma = 0;
		float media = 0;
		float termo = 0;
		float n2 = 0;
		System.out.print("Informe a quantidade de alunos: ");
		float n1 = entrada.nextInt();
		for (int i = 0; i < n1; i++) {

			System.out.println("Informe a idade do aluno");
			termo = entrada.nextInt();
			soma = soma + termo;
			n2++;
		}
		media = (soma / n2);

		System.out.println("A média de idade dos alunos é: " + media);

		if (media < 25) {
			System.out.println("Turma Jovem");

		}

		else if ((media > 25) && (media <= 60)) {
			System.out.println("Turma Adulta");

		} else {
			System.out.println(" Turma Idosa");
		}

		entrada.close();

	}

}
