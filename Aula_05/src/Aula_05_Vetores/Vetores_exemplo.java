package Aula_05_Vetores;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores_exemplo {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		String[] pessoas = {"Luiza", "Aline", "Vinicius", "Antonio", "Vitor", "Samara"};
		float notas=0f;

		for(int indice = 0; indice < 6; indice ++) {
			System.out.println("Digite um valor para a posição: " + indice + "] = ");
		
			System.out.println("\n");
			
		}
		
		for(int indice = 0; indice < 5; indice ++)
			System.out.println("Posição " + indice + " = " + pessoas[indice]);
			notas[indice] = leia.nextFloat();
		
			Arrays.sort(pessoas);
		
		for(int indice = 0;indice<5;indice++)System.out.println("Posição [" + indice + " = "+ pessoas [indice]);

	}
}
