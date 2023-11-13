package Aula_04;

import java.util.Scanner;

public class Exercicio02_For {
	
	static Scanner Leia = new Scanner(System.in);

	public static void main(String[] args) {
	 
		int num, impar=0, par=0;
		
		for(int contador = 1; contador <= 10; contador ++) {
			
			System.out.println("Digite o número: ");
			num=Leia.nextInt();
			
			if (num % 2 == 0) {	
				par ++;
				
			} else {
				impar ++;
		}}
			System.out.println("A quantidade de numeros pares é: " + par);
			System.out.println("A quantidade numeros impares é: "+ impar);
}}