package Aula_05_Vetores;

public class Matrizes_exemplo {

	public static void main(String[] args) {

		int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int indiceI = 0; indiceI < matriz.length; indiceI++) {
			for (int indiceJ = 0; indiceJ < matriz.length; indiceJ++) {
				System.out.println("Matriz[" + indiceI + "][" + indiceJ + "] = " + matriz[indiceI][indiceJ]);
			}

		}

	}
}
