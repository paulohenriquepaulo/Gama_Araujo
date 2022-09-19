package atividades;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade302 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int idadeAnos = 0;
		int idadeMeses = 0;
		int idadeDias = 0;
		int resultadoEmDias = 0;

		do {

			try {
				System.out.print("Informe a sua idade em anos: ");
				idadeAnos = entrada.nextInt();
				validarValores(idadeAnos);

				System.out.print("Informe a sua idade em meses: ");
				idadeMeses = entrada.nextInt();
				validarValores(idadeMeses);

				System.out.print("Informe a sua idade em dias: ");
				idadeDias = entrada.nextInt();
				validarValores(idadeDias);

				break;
			} catch (InputMismatchException e) {
				entrada.nextLine();
				System.out.println("Opção invalida.");

			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
			}

		} while (true);

		resultadoEmDias = (idadeAnos * 365) + (idadeMeses * 30) + idadeDias;

		System.out.println(
				idadeAnos + " anos, " + idadeMeses + " meses e " + idadeDias + " dias = " + resultadoEmDias + " dias.");
		entrada.close();
	}

	public static void validarValores(int valor) {
		if (valor <= 0) {
			throw new RuntimeException("O valor precisa ser igual o maior que zero.");
		}
	}
}
