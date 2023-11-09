package aula_02;

import java.util.Scanner;

public class Exercicio3 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
	
	float salarioBruto, adicionalNoturno, horasExtras, descontos;
	
	System.out.println("Digite o salario bruto: ");
	salarioBruto=leia.nextFloat();	
	System.out.println("Digite o adicional noturno: ");
	adicionalNoturno=leia.nextFloat();	
	System.out.println("Digite as horas extras: ");
	horasExtras=leia.nextFloat();	
	System.out.println("Digite os descontos: ");
	descontos=leia.nextFloat();
	
	System.out.println("O salario liquido é: " + (salarioBruto+adicionalNoturno+(horasExtras*5)-descontos));

}}
