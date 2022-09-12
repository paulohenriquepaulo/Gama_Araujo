package projetoArquivo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CriandoArquivo {
	public static void main(String[] args) throws IOException {
		
		//Envocando as funçoes para gravção do nosso arquivo.
		FileWriter arquivo = new FileWriter("c:\\teste\\geracao_tabuada.txt");
		
		//Escrver dentro do arquivo na maquina
		PrintWriter gravarArq = new PrintWriter(arquivo);
		
		//Criando uma variável para gerar a nossa tabuada
		int n = 5;
		gravarArq.println("======== Resultado =====");
		for (int i = 0; i <= 10; i++) {
			gravarArq.println(n + " * " + i + " = " + (n * i));
		}
		
		gravarArq.println("=========================");
		
		
		//Para o grava no arquivo precisa fechar o arquivo PrintWriter
		gravarArq.close();
	}
	
}
