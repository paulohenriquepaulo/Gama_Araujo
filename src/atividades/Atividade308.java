package atividades;

import java.util.Scanner;

public class Atividade308 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		double media = 0, totalNotas = 0;

		System.out.print("Informe o seu nome: ");
		String nome = entrada.nextLine();

		for (int i = 1; i <= 4; i++) {
			System.out.print("Informe a " + i + "° nota: ");
			try {
				double nota = entrada.nextDouble();
				validarNota(nota);
				totalNotas += nota;
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
				i--;
			} catch (Exception e) {
				System.out.println("Entrada invalida.");
				entrada.nextLine();
				i--;
			}

		}

		media = totalNotas / 4;

		System.out.println(nome + " sua media é: " + media);
		entrada.close();
	}

	public static void validarNota(Double valor) {
		if (valor < 0) {
			throw new RuntimeException("A nota precisar ser maior ou igual a 0.");
		}
	}
}
