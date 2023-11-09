package aula_02;

import java.util.Scanner;

public class Exercicio1 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		float numero1, numero2;
		
		System.out.println("Digite seu salario: ");
		numero1=leia.nextFloat();
		
		
		System.out.println("Digite o abono: ");
		numero2=leia.nextFloat();
		
		System.out.println("Novo salario é: " + (numero1 + numero2));
	}

}
