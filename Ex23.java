import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int alunos = 0;
		float soma = 0;
		float n2 = 0;
		float media = 0;
		System.out.print("Informe a quantidade de Turmas: ");
		int turmas = entrada.nextInt();
		for (int i = 0; i < turmas; i++) {
			do {
				System.out.println("Informe a quantidade de alunos:");
				alunos = entrada.nextInt();
			} while (alunos < 0 || alunos > 40);

			soma = soma + alunos;

			n2++;
		}
		media = (soma / n2);

		System.out.println("O número médio de alunos por turma é de: " + media);
		entrada.close();
	}
}