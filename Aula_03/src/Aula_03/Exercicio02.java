package Aula_03;

import java.util.Scanner;

public class Exercicio02 {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
	
	
	int numero;
	
	System.out.println("Digite um número: ");
	numero=leia.nextInt();
	
	if(numero % 2 == 0) {
	System.out.println("O número é par");
	
	} else {
		System.out.println("O número é impar");
	} 
	
	
	if (numero > 0) {
		System.out.println("O número é positivo");
	} else {
		System.out.println("O número é negativo");
	}
	}}
	