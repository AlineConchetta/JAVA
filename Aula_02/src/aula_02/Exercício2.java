package aula_02;

import java.util.Scanner;

public class Exercício2 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		float nota1, nota2, nota3, nota4;
		
		System.out.println("Digite sua primeira nota: ");
		nota1=leia.nextFloat();
		
		System.out.println("Digite sua segunda nota: ");
		nota2=leia.nextFloat();
		
		System.out.println("Digite sua terceira nota: ");
		nota3=leia.nextFloat();
		
		System.out.println("Digite sua quarta nota: ");
		nota4=leia.nextFloat();
		
		System.out.println("Sua média é: " + ((nota1+nota2+nota3+nota4)/4));
	}

}
