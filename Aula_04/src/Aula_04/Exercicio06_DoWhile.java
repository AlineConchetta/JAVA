package Aula_04;

import java.util.Scanner;

public class Exercicio06_DoWhile {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int num;
		float multiplos = 0, media = 0, totalMult = 0;

		do {
			System.out.println("Digite um número: ");
			num = leia.nextInt();

			if (num % 3 == 0 && num != 0) {
				multiplos++;
				// media = soma de todos os produtos divido pela quantidade de produto
				// media=totalMult // multiplos
				totalMult = totalMult + num;
			}
		} while (num != 0);
		System.out.println("O valor da média dos multiplos de 3 é de: " + (totalMult / multiplos));
	}
}
