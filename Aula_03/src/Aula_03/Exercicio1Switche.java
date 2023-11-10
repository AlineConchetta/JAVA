package Aula_03;

import java.util.Scanner;

public class Exercicio1Switche {
	
	static Scanner Leia= new Scanner(System.in);

	public static void main(String[] args) {
		
		Float valor, saldo = 1000.00f;
		int operacao;
		
		System.out.println("1 - Saldo");
		System.out.println("2 - Saque");
		System.out.println("3 - Depósito");
		
		System.out.println("\n Digite o número da operação que deseja realizar.");
		
		operacao=Leia.nextInt();
		
		switch(operacao) {
			case 1:
			System.out.println("Saldo da conta é:");
			saldo=Leia.nextFloat();
			break;
			
		
		}
	}
}
