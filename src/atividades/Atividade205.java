package atividades;

import java.util.Scanner;

public class Atividade205 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		int numero = entrada.nextInt();
		
		int antecessor = numero - 1; 
		int sucessor = numero + 1;

		System.out.println("O antecessor de " + numero + " é " + antecessor +
				"\nO sucessor de " + numero + " é " + sucessor);
		entrada.close();
	}

}
