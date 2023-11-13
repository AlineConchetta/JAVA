package Aula_03;

import java.util.Scanner;

public class Exercicio01 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int a, b, c;

		System.out.println("Digite o número A: ");
		a = leia.nextInt();
		System.out.println("Digite o número B: ");
		b = leia.nextInt();
		System.out.println("Digite o número C: ");
		c = leia.nextInt();

		if (a + b > c) {
			System.out.println("A soma de A + B é maior do que C");
		} else if (a + b < c) {
			System.out.println("A soma de A + B é menor do que C");
		} else {
			System.out.println("A soma de A + B é igual a C");
		}
	}
}
