package array;

import java.util.Scanner;

public class Teste {

	static String lerNome(int numero) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("\n\nDigite o nome do indivíduo " + numero + ": ");
		String nome1 = entrada.nextLine();
		return nome1;
	}

	static int lerIdade(String nome) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a idade de " + nome + ": ");
		int idade = entrada.nextInt();
		entrada.nextLine();
		return idade;
	}

	static String lerOsexo(String nome) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o sexo de " + nome + ": ");
		String sexo = entrada.nextLine();
		return sexo;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int criança = 0, adolescente = 0, adulto = 0, melhorIdade = 0, maisVelho = 0;
		String nome1, nome2, nome3;
		int idade1, idade2, idade3;
		String sexo1, sexo2, sexo3;
		String nomeMaisV = null;

		nome1 = lerNome(1);
		idade1 = lerIdade(nome1);
		sexo1 = lerOsexo(nome1);

		if (idade1 <= 13) {
			System.out.print(nome1 + " é criança.");
			criança++;

		} else if (idade1 >= 13 && idade1 < 21) {
			System.out.print(nome1 + " é adolescente.");
			adolescente++;

		} else if (idade1 >= 21 && idade1 <= 50) {
			System.out.print(nome1 + " é adulto.");
			adulto++;
		} else if (idade1 > 50) {
			System.out.print(nome1 + " é da melhor idade.");
			melhorIdade++;
		}
		nome2 = lerNome(2);
		idade2 = lerIdade(nome2);
		sexo2 = lerOsexo(nome2);

		if (idade2 <= 13) {
			System.out.print(nome2 + " é criança.");
			criança++;

		} else if (idade2 >= 13 && idade2 < 21) {
			System.out.print(nome2 + " é adolescente.");
			adolescente++;

		} else if (idade2 >= 21 && idade2 <= 50) {
			System.out.print(nome2 + " é adulto.");
			adulto++;
		} else if (idade2 > 50) {
			System.out.print(nome2 + " é da melhor idade.");
			melhorIdade++;
		}
		nome3 = lerNome(3);
		idade3 = lerIdade(nome3);
		sexo3 = lerOsexo(nome3);

		if (idade3 <= 13) {
			System.out.print(nome3 + " é criança.");
			criança++;

		} else if (idade3 >= 13 && idade3 < 21) {
			System.out.print(nome3 + " é adolescente.");
			adolescente++;

		} else if (idade3 >= 21 && idade3 <= 50) {
			System.out.print(nome3 + " é adulto.");
			adulto++;
		} else if (idade3 > 50) {
			System.out.print(nome3 + " é da melhor idade.");
			melhorIdade++;
		}
		if (idade1 > maisVelho) {
			maisVelho = idade1;
			nomeMaisV = "\n\nO nome do indivíduo mais velho é: " + nome1;
		}
		if (idade1 > maisVelho) {
			maisVelho = idade2;
			nomeMaisV = "\n\nO nome do indivíduo mais velho é: " + nome2;
		}
		if (idade3 > maisVelho) {
			maisVelho = idade3;
			nomeMaisV = "\n\nO nome do indivíduo mais velho é: " + nome3;
		}
		System.out.print("\n\nTotal de crianças: " + criança + ":");
		System.out.print("\nTotal de adolescentes: " + adolescente);
		System.out.print("\nTotal de adultos: " + adulto);
		System.out.print("\nTotal melhor idade: " + melhorIdade);
		System.out.print(nomeMaisV);
	}
}
