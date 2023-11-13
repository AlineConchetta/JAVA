package Aula_05_Vetores;

import java.util.Scanner;

public class Matrizes_Exemplo2 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		
		matriz [][] matrizDouble new Double [3][3];
		
		
		for (int indiceI = 0; indiceI < matrizDouble.length; indiceI++) {
			for (int indiceJ = 0; indiceJ < matrizDouble.length; indiceJ++) {
				System.out.println("Matriz[" + indiceI + "][" + indiceJ + "] = " + matriz[indiceI][indiceJ]);
				matrizDouble = leia.nextDouble();
			}
			

		}

	}
}

	}

}
