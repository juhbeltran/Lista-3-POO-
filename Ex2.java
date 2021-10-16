import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String usuario;
		String senha;

		do {
			System.out.println("Digite o usúario: ");
			usuario = entrada.nextLine();
			System.out.println("Digite a senha: ");
			senha = entrada.nextLine();

			if (usuario.equals(senha)) {
				System.out.println("Erro");
			}

		} while (usuario.equals(senha));
		System.out.println("Senha válida! ");

	}

}
