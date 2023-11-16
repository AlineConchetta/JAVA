package Aula_05_Vetores;

import java.util.Scanner;

public class Exercicio02_Vetores {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		float[][] notas = new float [2][4];
		float[] medias= new float[2];
		float soma = 0.0f;
	
			
		for(int indiceI = 0; indiceI < notas.length; indiceI ++) {
			for(int indiceJ = 0; indiceJ < notas[indiceI].length; indiceJ ++) {
				System.out.println("Digite a " + (indiceJ + 1) "nota do participante" + ": ");
				notas[indiceI][indiceJ] = leia.nextFloat();
				}
			}
		
		for(int indiceI = 0; indiceI < notas.length; indiceI ++) {
			for(int indiceJ = 0; indiceJ < notas[indiceI].length; indiceJ ++)
				soma += notas [indiceI][indiceJ];
	}

	medias[indiceI]= soma / notas[indiceI].length; soma = 0.0f;

	if(int indice = 0;indice<media.length;indice++);
	System.out.println("\nMédia do participante "+(indiceI+1)+":"+medias[indiceI]);

}

}