package atividades;

import java.util.Scanner;

public class Atividade301 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		while (true) {

			try {
				System.out.println("Informe um número: ");
				int numero = entrada.nextInt();
				System.out.println("Esolha uma opção: \n 1 - CRESCENTE \n 2 - DECRESCENTE");
				int opcao = entrada.nextInt();

				switch (opcao) {
				case 1: 
					 crescente(numero);
					break;
				case 2: 
					 decrescente(numero);
					break;
				default:
					throw new Exception();
					
				}
				entrada.close();
				break;
			} catch (Exception e) {
				System.err.println("Opção invalida.");
				entrada.nextLine();
			}
		}
	}

	public static void crescente(int numero) {
		System.out.println("CRESCENTE");
		for (int i = 0; i <= numero; i++) {
			System.out.println(i);
		}
	}

	public static void decrescente(int numero) {
		System.out.println("DECRESCENTE");
		for (int i = numero; i >= 0; i--) {
			System.out.println(i);
		}
	}
}
