package repeticao;

import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		int numero = entrada.nextInt();
		
		System.out.println("Tabuada de Subtração / Soma" );
		for (int i = 0; i < 10; i++) {
			System.out.println(numero + " - " + i + " = " + (numero - i) + 
					"\t\t" + numero + " + " + i + " = " + (numero + i));

		}
		entrada.close();
	}

}
