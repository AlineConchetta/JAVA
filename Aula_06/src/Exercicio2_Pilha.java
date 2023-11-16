import java.util.Scanner;
import java.util.Stack;

public class Exercicio2_Pilha {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		Stack<String> livros = new Stack<String>();
		int opcao = 1;

		while (opcao != 0) {

			System.out.println("*******************************************************");

			System.out.println("1 - Adicionar um novo livro na pilha");
			System.out.println("2 - Listar todos os livros da pilha");
			System.out.println("3 - Retirar um livro da Fila");
			System.out.println("0 - Sair");
			System.out.println("*******************************************************");

			System.out.println("Digite uma opção: ");
			opcao = leia.nextInt();
			leia.skip("\\R");

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome do livro:");
				livros.add(leia.nextLine());

				System.out.println("\n--- Pilha ---\n");
				livros.forEach(System.out::println);
				break;

			case 2:
				if (livros.isEmpty())
					System.out.println("\n--- Pilha vazia ---\n");
				else
					System.out.println("\n--- Livros ---\n");
				livros.forEach(System.out::println);
				break;

			case 3:
				if (livros.isEmpty())
					System.out.println("\n--- Pilha vazia ---\n");
				else
					System.out.printf("O livro %s foi removido", livros.pop());
				System.out.println("\n--- Pilha de Livros ---\n");
				livros.forEach(System.out::println);
				break;

			case 0:
				System.out.println("Programa encerrado.");
				break;

			default:
				System.out.println("Digite uma opção válida.");
			}

		}
	}

}
