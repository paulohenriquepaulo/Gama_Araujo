package atividades;

import java.util.Scanner;

public class Atividade201 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Infome o seu nome: ");
		String nome = entrada.nextLine();

		System.out.println("Olá " + nome);
		entrada.close();
	}
}
