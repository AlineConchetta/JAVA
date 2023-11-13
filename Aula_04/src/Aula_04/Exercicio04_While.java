package Aula_04;

import java.util.Scanner;

public class Exercicio04_While {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int idade, identidade, areaTrabalho, backend = 0, mulheresFront = 0, homensDev40 = 0, nBinariasFull = 0,
				totalPax = 0, totalId = 0;
		float media=0f;
		String resp = "S";

		while (resp.equalsIgnoreCase("S")) {

			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();

			System.out.println("Qual sua identidade de genêro?: ");
			identidade = leia.nextInt();

			System.out.println("Qual sua área de trabalho?: ");
			areaTrabalho = leia.nextInt();

			System.out.println("Você deseja continua a pesquisa?");
			resp = leia.next();
			totalPax++;
			media ++;
			totalId += idade;

			if (areaTrabalho == 1) {
				backend++;
			} else if (identidade == 1 || identidade == 3) {
				mulheresFront++;
			} else if ((identidade == 2 || identidade == 5) && (areaTrabalho == 3 && idade > 40)) {
				homensDev40++;
			} else if (identidade == 3 && areaTrabalho == 4 && idade < 30) {
				nBinariasFull++;
			}
		}
		System.out.println("Total de desenvolvedores BackEnd são: " + backend);
		System.out.println("Total de mulheres Cis/Trans e FrontEnd são: " + mulheresFront);
		System.out.println("Total de homens Cis/Trans e Mobile são: " + homensDev40);
		System.out.println("Total de pessoas não binárias e Full são: " + nBinariasFull);
		System.out.println("Total de pessoas que responderam a pesquisa foi: " + totalPax);
		System.out.println("A média de idade das pessoas é de: " + totalId / media);
	}
}
