package atividades;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade307 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		while (true) {

			try {
				System.out.println("Informe a massa em quilogramas: ");
				double m = entrada.nextDouble();

				System.out.println("Informe a altura em metros: ");
				double h = entrada.nextDouble();

				System.out.println("Informe o tempo em segundos: ");
				double t = entrada.nextDouble();
				double cavalos = (m * h / t) / 745.6999;
				
				System.out.println("A quantidade de cavalos necessários é: " + cavalos);
				entrada.close();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Entrada invalida.");
				entrada.nextLine();
			}
		}
	}
}
