package repeticao;

import java.util.Scanner;

public class TabuadaComEntradaValida {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe um numero: ");
		int numero = entrada.nextInt();

		for (;;) {
			if (numero > 10 || numero < 1) {
				System.out.println("Valor invalido\n ");
				System.out.print("Informe um numero de 1 a 10: ");
				numero = entrada.nextInt();
			} else {
				entrada.close();
				break;
			}
		}

		System.out.println("======================================");
		System.out.println("=========== TABUADA DO " + numero + " =============");
		System.out.println("======================================");

		for (int j = 1; j < 11; j++) {
			System.out.println(numero + " x " + j + " = " + (numero * j));
		}
		
	}

}
