package Aula_04;

import java.util.Scanner;

public class Exercicio01_For {

	static Scanner Leia= new Scanner(System.in);

	public static void main(String[] args) {
	
	int n1, n2;
	
	System.out.println("Digite o primeiro número do intervalo: ");
	n1=Leia.nextInt();
	
	System.out.println("Digite o segundo número do intervalo: ");
	n2=Leia.nextInt();
	
	
	if (n1 > n2) {
		System.out.println("Intervalo inválido.");
		
	} else {
		System.out.printf("No intervalo entre %d e %d :\n", n1, n2);

		for(int contador = n1; contador <= n2; contador ++) {
			
		if(contador % 3 == 0 && contador %  5 == 0) {
			System.out.println(contador + " é múltiplo de 3 e 5\n");}
	    }
	  }
	}
}
		
