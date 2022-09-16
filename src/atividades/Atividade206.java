package atividades;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade206 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("##,##0.00");
		Double numero = 1.0;
		Integer numeroInteiro = 0;

		do {
			System.out.print("Informe um número de 1 até 9 para o cálculo da tabuada: ");
			numero = entrada.nextDouble();
			numeroInteiro = numero.intValue();
			if (numero < 10 && numero > 0) {
				System.out.println("\nTabuada do + e - para o número " + numeroInteiro + ": ");
				for (int i = 0; i < 10; i++) {
					System.out.print(numeroInteiro + " + " + i + " = " + (numeroInteiro + i));
					System.out.println("\t\t\t" + numeroInteiro + " - " + i + " = " + Math.abs(numeroInteiro - i));
				}

				System.out.println("\nTabuada da * e / para o número " + numeroInteiro + ": ");
				for (int i = 0; i < 10; i++) {
					System.out.print(numeroInteiro + " * " + i + " = " + (numeroInteiro * i));
					if (i == 0) {
						System.out
								.println("\t\t\t" + numeroInteiro + " / " + i + " = " + "não existe divisão por zero");
					} else {
						System.out.println("\t\t\t" + numeroInteiro + " / " + i + " = " + format.format(numero / i));
					}
				}
				break;
			} else {
				System.out.println("O número precisa ser de 1 até 9");
				numero = 1.0;

			}
		} while (true);
		entrada.close();
	}

}
