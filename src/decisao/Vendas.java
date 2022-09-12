package decisao;

import java.util.Scanner;

public class Vendas {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String nomeRemedio;
		int quantidadeRemedio, anoVencimento, anoAtual;
		double valorUnitario;

		System.out.print("Informe o nome do remedio: ");
		nomeRemedio = entrada.nextLine();

		System.out.print("Informe a quantidade: ");
		quantidadeRemedio = entrada.nextInt();

		System.out.print("Informe o valor unitario: ");
		valorUnitario = entrada.nextDouble();

		System.out.print("Informe o ano vencimento: ");
		anoVencimento = entrada.nextInt();

		System.out.print("Informe o ano atual: ");
		anoAtual = entrada.nextInt();

		System.out.println("\n================================================");
		System.out.println("================ DROGARIA ARAUJO ===============");
		System.out.println("================================================");

		System.out.println("\nRemedio: " + nomeRemedio + "\nQuantidade: " + quantidadeRemedio + "\nValor unitario: "
				+ valorUnitario + "\nTotal: " + (quantidadeRemedio * valorUnitario) + "\nAno vencimento: "
				+ anoVencimento + "\nAno atual: " + anoAtual + "\nFalta " + (anoVencimento - anoAtual)
				+ " Anos para o vencimento");
		System.out.println("------------------------------------------------\n");
		entrada.close();
	}

}
