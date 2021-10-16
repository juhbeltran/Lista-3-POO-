import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		String nome;
		int idade;
		float salario;
		char sexo;
		char ecivil;

		do {
			System.out.print("Digite seu nome: ");
			nome = entrada.nextLine();

		} while (nome.length() <= 3);

		do {
			System.out.print("Digite sua idade: ");
			idade = entrada.nextInt();

		} while (idade < 0 || idade > 150);

		do {
			System.out.print("Informe seu salário: ");
			salario = entrada.nextFloat();

		} while (salario < 0);

		do {

			System.out.print("Informe seu sexo, f para feminino e m para masculino: ");

			sexo = entrada.next().charAt(0);

		} while (!(sexo == 'f' || sexo == 'm'));

		do {
			System.out.print("Informe seu estado civil, (s) solteira, (c) casada, (v) viúva e (d) divorciada: ");
			ecivil = entrada.next().charAt(0);

		} while (!(ecivil == 's' || ecivil == 'c' || ecivil == 'v' || ecivil == 'd'));

		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println(" Salário: R$" + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado civil: " + ecivil);

		entrada.close();

	}

}
