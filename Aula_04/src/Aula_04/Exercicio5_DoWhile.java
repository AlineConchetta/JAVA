package Aula_04;

import java.util.Scanner;

public class Exercicio5_DoWhile {
	
	static Scanner Leia = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		int numero, numero1 = 0;
		
		do {
			System.out.println("Digite um numero: ");
			numero=Leia.nextInt();
	
		if(numero > 0) {numero1 += numero;}}
		
		while(numero != 0); {
			System.out.println("A soma dos números positivos é: " + numero1);}
}}
