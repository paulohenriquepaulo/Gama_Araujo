package array;

import java.util.HashMap;
import java.util.Scanner;

public class Cadastro {

	public static void main(String[] args) {

		
		Scanner entrada = new Scanner(System.in);
		HashMap<String, String>  cadastro = new HashMap<String, String>(); 
		int opcao = 0;
		boolean repetir = true;
		boolean mostrarMenu = true;
		System.out.println("===================================");
		System.out.println("============= CADASTRO ============");
		System.out.println("===================================");

		do {
			
			if (mostrarMenu == true) {
				System.out.println(
						"1 - Cadastro" + "\n2 - Mostrar Registros" + "\n3 - Excluir um Resitro pelo nome" + "\n4 - Sair");
				System.out.print("Escolha uma opção: ");
				opcao = Integer.parseInt(entrada.nextLine());
			} 
			
			switch (opcao) {
			case 1:
				System.out.print("Informe o nome: ");
				String nome = entrada.nextLine().toUpperCase();
				System.out.print("Informe o e-mail: ");
				String email = entrada.nextLine();
				cadastro.put(nome, email);
				System.out.println("Deseja fazer mais um cadastro ? \n1- Sim \n2 - Não");
				opcao = Integer.parseInt(entrada.nextLine());
				if (opcao ==  1) {
					mostrarMenu = false;
				} else {
					mostrarMenu = true;
				}
				break;
			case 2:
				System.out.println(cadastro);
				mostrarMenu = true;
				break;
			case 3:
				System.out.print("Informe o nome do cadastro que deseja excluir: ");
				nome = entrada.nextLine().toUpperCase();
				cadastro.remove(nome);
				
				break;
			case 4:
					repetir = false;
				break;

			default:
				System.err.println("Opção invalida.");
				break;
			}

		
		} while (repetir);
		System.out.println("Finalizando...");
		entrada.close();
		
	}

}
