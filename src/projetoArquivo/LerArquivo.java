package projetoArquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivo {
	
	public static void main(String[] args) {
		
		//Declaração da variável com o caminho do arquivo
		String caminho = "c:\\teste\\banco_carros.txt";
		
		System.out.println("Mostrar o coeúdo do arquivo");
		
		try {
			//Ultilizando a função de leitura de arquivo 
			FileReader arquivo = new FileReader(caminho);
			
			//Inserindo o conteúdo do arquivo dentro de um buffer
			BufferedReader lerArquivo = new BufferedReader(arquivo);
			
			//Criando a variável para trabalhar como seletor de registro 
			String linha = lerArquivo.readLine(); // Permite ler a linha do registro
			
			//Criando um laço de repetição para fazer a leitura do arquivo com nosso seletor
			while (linha != null) {
				System.out.println(linha);
				linha = lerArquivo.readLine();
			}
			arquivo.close();
		} catch (IOException e) {
			System.err.println("Arquivo não encontrado " + e.getMessage());
		}
	}

}
