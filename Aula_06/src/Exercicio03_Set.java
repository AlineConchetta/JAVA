import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio03_Set {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		Set<Integer> setNumeros = new HashSet<Integer>();

		for (int contador = 0; contador < 10; contador++) {
			System.out.println("Digite um número: ");
			setNumeros.add(leia.nextInt());
		}
		
		System.out.println("Os números digitados foram: " );
		Iterator<Integer> iSetNumeros = setNumeros.iterator();
		
		while(iSetNumeros.hasNext())
			System.out.println(iSetNumeros.next());
		

	}
}