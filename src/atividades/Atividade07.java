package atividades;

import java.util.Scanner;

public class Atividade07 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int soma = 0;
		
		System.out.print("Informe o primeiro número: ");
		int numero1 = entrada.nextInt();
		
		System.out.print("Informe o primeiro número: ");
		int numero2 = entrada.nextInt();
		
		for (int i = 0; i < numero2; i++) {
			soma += numero1;
		}
		
		System.out.println("A multiplicação dos dois números digitados por de somas repetidas é: " + soma);
		entrada.close();
	}

}
