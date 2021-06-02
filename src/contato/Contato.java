package contato;

import java.util.Scanner;

public class Contato {

	public static void main(String[] args) {

		String nome;
		String telefone;
		String email;
		
		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite o nome:");
		nome = leitor.nextLine();

		System.out.println("Digite o telefone:");
		telefone = leitor.nextLine();

		System.out.println("Digite o email:");
		email = leitor.nextLine();

		leitor.close();
		
		System.out.println("Pessoa cadastrada com Sucesso!");
		System.out.println("Nome: " + nome);
		System.out.println("Telefone: " + telefone);
		System.out.println("Email: " + email);	
		
	}

}
