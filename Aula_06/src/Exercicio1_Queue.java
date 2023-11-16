import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1_Queue {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();
		int opcao = 1;

		while (opcao != 0) {

			System.out.println("*******************************************************");

			System.out.println("1 - Adicionar cliente na fila ");
			System.out.println("2 - Listar todos os Clientes");
			System.out.println("3 - Retirar Cliente da Fila");
			System.out.println("0 - Sair");
			System.out.println("*******************************************************");

			System.out.println("Digite uma opção: ");
			opcao = leia.nextInt();
			leia.skip("\\R");

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome:");
				fila.add(leia.nextLine());
				System.out.println("\n--- Fila ---\n");
				fila.forEach(System.out::println);
				System.out.println("\nCliente adicionado!\n");
				break;

			case 2:
				if (fila.isEmpty())
					System.out.println("\n Fila vazia\n");
				else {
					System.out.println("\n--- Fila ---\n");
					fila.forEach(System.out::println);
				}
				break;

			case 3:
				if (fila.isEmpty())
					System.out.println("\n Fila vazia\n");
				else {
					System.out.printf("\n O cliente %s foi chamado!\n", fila.poll());
					System.out.println("\n--- Fila ---\n");
					fila.forEach(System.out::println);
				}
				break;

			case 0:
				System.out.println("Programa encerrado");
				break;

			default:
				System.out.println("Insira uma opção válida!");
			}

		}

	}
}
