package atividades;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade203 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("##.#");

		System.out.print("Informe o valor do salaraio minimo: ");
		double valorSalarioMinimo = entrada.nextDouble();

		System.out.print("Informe o valor do salaraio do funcionario: ");
		double valorSalarioFuncionario = entrada.nextDouble();

		double quantidadeSalarioMinimo = valorSalarioFuncionario / valorSalarioMinimo;

		System.out.println("\nO funcionario recebe " + format.format(quantidadeSalarioMinimo) + " salarios minimos!");

		entrada.close();
	}

}
