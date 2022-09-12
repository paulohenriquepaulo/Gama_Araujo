package rotinas;

import java.util.Scanner;

public class Tela {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		
		//Declarando variáveis
		String nome = null;
		int idade = 0;
		
		System.out.print("Informe seu nome: " );
		nome = entrada.nextLine();
		
		System.out.print("Informe sua idade: ");
		idade = Integer.parseInt(entrada.nextLine());
		entrada.close();
		
		System.out.println("Seu nome é: " + nome + " Sua idade é: " + idade);
		
	}
}
