package atividades;

import java.util.Scanner;

public class Atividade02 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String nome1, nome2, nome3;
		
		System.out.println("Informe um nome: ");
		nome1 = entrada.nextLine();
		nome2 = "mestre do universo";
		
		System.out.println("\nValor original das variáveis:");
		System.out.println("Nome1: " + nome1 + " Nome2: " + nome2 );
		nome3 = nome1;
		nome1 = nome2;
		nome2 = nome3;
		System.out.println("\nValor trocado das variáveis:");
		System.out.println("Nome1: " + nome1 + " Nome2: " + nome2 );
		entrada.close();
	}

}
