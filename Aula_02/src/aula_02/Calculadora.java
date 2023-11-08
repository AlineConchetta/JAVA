package aula_02;

import java.util.Scanner;

public class Calculadora {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
	
		double numero1, numero2;
		
		System.out.println("Digite o primeiro número: ");
		numero1 = leia.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		numero2 = leia.nextDouble();
		
		System.out.println("Soma: " + (numero1+numero2));
		System.out.println("Substração: " + (numero1-numero2));
		System.out.println("Multiplicação: " + (numero1*numero2));
		System.out.println("Divisão: " + (numero1/numero2));
		System.out.println("Módulo do numero 1 (resto da divisão): " + (numero1%2));
		System.out.println("Módulo do numero 2 (resto da divisão): " + (numero2%2));
	
		System.out.println("Raiz quadrada do numero 1: " + (Math.sqrt(numero2)));
		
		System.out.println("Potencia do numero1 pelo número2: " + (Math.pow(numero1,numero2)));
	}

}
