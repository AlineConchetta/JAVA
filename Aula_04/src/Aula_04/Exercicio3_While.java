package Aula_04;

import java.util.Scanner;

public class Exercicio3_While {

	static Scanner Leia = new Scanner(System.in);

	public static void main(String[] args) {
		int idade = 1, contador1 = 0, contador2 = 0;

		
	// idades a cima de 0
		while (idade > 0) {
			System.out.println("Digite sua idade: ");
			idade = Leia.nextInt();

	// idades menores de 21 anos
			if (idade < 21 && idade > 0) {
				contador1++;
			
	// maiores de 50 anos		
			} else if (idade > 50) {
				contador2++;
			}
		}
		
	// resultado da contagem de idades	
		System.out.println("Total de pessoas menores de 21 anos." + contador1);
		System.out.println("Total de pessoas maior de 50 anos." + contador2);
	}

}
