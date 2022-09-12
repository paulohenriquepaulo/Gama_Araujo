package decisao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculaNota {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		double nota1 = 0, nota2 = 0, media = 0;

		while (true) {
			try {
				entrada = new Scanner(System.in);
				System.out.print("Informe a primeira nota: ");
				nota1 = entrada.nextDouble();
				validarNota(nota1);
				System.out.print("Informe a segunta nota: ");
				nota2 = entrada.nextDouble();
				validarNota(nota2);
				break;
			} catch (InputMismatchException e) {
				System.err.println("O valor de entrada precisar ser numerico");

			} catch (RuntimeException e) {
				System.err.println(e.getMessage());
			}

		}

		media = (nota1 + nota2) / 2;

		if (media > 5) {
			System.out.println("Aprovado");
		} else if (media > 4 && media <= 5) {
			System.out.println("Recuperação");
		} else {
			System.out.println("Reprovado");
		}
		entrada.close();
	}

	static void validarNota(double nota) {
		if (nota < 0) {
			throw new RuntimeException("O valor não pode ser negativo");
		}
	}
}
