package atividades;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade303 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		int maiorNumero = 0;
		
		for (int i = 1; i <= 3; i++) {
			System.out.print("Informe o " + i + "° número: ");
			try {
				numero = entrada.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Entrada invalida.");
				i--;
				entrada.nextLine();
			}
			
			if (numero > maiorNumero) {
				maiorNumero = numero;
			}
		}
		
		System.out.println("O maior número informado é: " + maiorNumero);
		entrada.close();
	}
}
