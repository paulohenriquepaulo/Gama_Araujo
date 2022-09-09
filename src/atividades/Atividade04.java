package atividades;

import java.util.Scanner;

public class Atividade04 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de horas trabalhadas: ");
		int horasTrabalhadas = entrada.nextInt();
		double salario = 10.00 * horasTrabalhadas;
		
		System.out.println("Este mês o seu salário é: R$" + salario);
		entrada.close();
	}

}
