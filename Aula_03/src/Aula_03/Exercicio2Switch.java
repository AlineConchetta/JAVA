package Aula_03;

import java.util.Scanner;

public class Exercicio2Switch {

	static Scanner Leia = new Scanner(System.in);

	public static void main(String[] args) {

		Float cachorroQuente = 10.00f, xSalada = 15.00f, xBacon = 18.00f, bauru = 12.00f, refrigerante = 8.00f,
				sucoDeLaranja = 13.00f;
		int produto, quantidade;

		System.out.println("1 - Cachorro Quente");
		System.out.println("2 - X-Salada");
		System.out.println("3 - X-Bacon");
		System.out.println("4 - Bauru");
		System.out.println("5 - Refrigerante");
		System.out.println("6 - Suco de Laranja");

		System.out.println("Digite o código do produto que deseja: ");
		produto = Leia.nextInt();

		System.out.println("Digite a quantidade que deseja: ");
		quantidade = Leia.nextInt();

		switch (produto) {
		case 1:
			System.out.println("Cachorro Quente " + quantidade * cachorroQuente);
			break;

		case 2:
			System.out.println("Valor Total: " + quantidade * xSalada);
			break;

		case 3:
			System.out.println("Valor Total: " + quantidade * xBacon);
			break;

		case 4:
			System.out.println("Valor Total: " + quantidade * bauru);
			break;

		case 5:
			System.out.println("Valor Total: " + quantidade * refrigerante);
			break;

		case 6:
			System.out.println("Valor Total: " + quantidade * sucoDeLaranja);
			break;
		}
	}
}
