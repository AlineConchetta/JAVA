package Aula_05_Vetores;

import java.util.Scanner;

public class Exercicio01_Vetores {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int[] numeros = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int numerosInteiros = 0;

		System.out.println("Digite o numero que você quer encontrar");
		numerosInteiros = leia.nextInt();

		System.out.println("\n");

		int posicao = -1;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == numerosInteiros) {
				posicao = i;
				break;
			}
		}
		if (posicao != -1) {
			System.out.println("O numero " + numerosInteiros + " foi encontrado na posição " + posicao);
		} else {
			System.out.println("O numero " + numerosInteiros + " não foi encontrado!");
		}
	}
}