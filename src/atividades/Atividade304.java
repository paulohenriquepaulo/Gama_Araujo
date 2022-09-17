package atividades;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Atividade304 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Random radon = new Random();
		int votosBrancos = 0;
		int votosNulos = 0;
		int votosValidos = 0;
		int contador = 0;
		int quantidadeEleitores = 0;
		int opcao = 0;

		System.out.print("Informe a quantidade de eleitores: ");

		while (true) {
			try {
				quantidadeEleitores = entrada.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Entrada invalida.");
				entrada.nextLine();
			}
		}

		while (contador < quantidadeEleitores) {
			opcao = radon.nextInt(3) + 1;
			switch (opcao) {
			case 1:
				votosValidos++;
				contador++;
				break;
			case 2:
				votosBrancos++;
				contador++;
				break;
			case 3:
				votosNulos++;
				contador++;
				break;
			}
		}
		resultadoElicao(votosBrancos, votosNulos, votosValidos, quantidadeEleitores);
		entrada.close();
	}

	static void resultadoElicao(int votosBrancos, int votosNulos, int votosValidos, int quanitdadeEleitores) {
		DecimalFormat format = new DecimalFormat("00.00");
		double pesoVoto = 100d / quanitdadeEleitores;
		System.out.println("===================================================");
		System.out.println("=============== Resultado da Eleição ==============");
		System.out.println("===================================================");
		System.out.println("Percentual de Votos Válidos:   	\t" + format.format(votosValidos * pesoVoto) + " %"
				+ "\nPercentual de Votos Brancos:     \t" + format.format(votosBrancos * pesoVoto) + " %"
				+ "\nPercentual de Votos Nulos:       \t" + format.format(votosNulos * pesoVoto) + " %");
		System.out.println("---------------------------------------------------");

	}
}
