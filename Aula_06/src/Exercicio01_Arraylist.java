import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01_Arraylist {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		ArrayList<String> Cores = new ArrayList<String>();
		String cor;

		for (int contador = 0; contador < 5; contador++) {
			System.out.println("Digite uma cor: ");
			cor = leia.nextLine();

			Cores.add(cor);
		}
		System.out.println(Cores);

		System.out.println("Cores digitadas: ");
		Cores.forEach(System.out::println);

		Cores.sort(null);

		System.out.println("Cores em ordem alfabetica");
		Cores.forEach(System.out::println);
	}

}
