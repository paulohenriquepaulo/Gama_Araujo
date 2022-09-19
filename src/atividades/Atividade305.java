package atividades;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade305 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int opcao = -1;
		do {

			try {
				System.out.print("Informe o primeiro valor: ");
				int valor1 = entrada.nextInt();

				System.out.print("Informe o segundo valor: ");
				int valor2 = entrada.nextInt();

				if (valor1 > valor2) {
					System.out.println("O maior número é: " + valor1 + "\nO menor número é: " + valor2);
				} else if (valor2 > valor1) {
					System.out.println("O maior número é: " + valor2 + "\nO menor número é: " + valor1);
				} else {
					System.out.println("Os valores informado são iguais.");
				}

				System.out.print("Digite zero para finalizar ou qualquer outro número para continuar: ");
			} catch (InputMismatchException e) {
				System.out.println("Opção invalida.");
				entrada.nextLine();
			}

		} while (opcao != 0);
		opcao = entrada.nextInt();

	}

}
