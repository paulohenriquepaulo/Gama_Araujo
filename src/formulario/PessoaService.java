package formulario;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PessoaService {

	public static void cadastrarPessoa(String nome, String email, String idade, String telefone, String endereco,
			String bairro, String cep, String estado) throws IOException {

		FileWriter arquivo = new FileWriter("c:\\teste\\Banco_Agenda.txt");
		PrintWriter gravarArq = new PrintWriter(arquivo);
		
		Pessoa pessoa = new Pessoa(nome, email, idade, telefone, endereco, bairro, cep, estado);
		gravarArq.println("================================================="
				+ "=========================================================="
				+ "======================================================");
		gravarArq.println("==============================================="
				+ "============================ AGENDA ===================="
				+ "==========================================================");
		gravarArq.println("=================================================="
				+ "==========================================================="
				+ "====================================================");
		gravarArq.print("Nome: " +pessoa.getNome() + "|\t|E-mail: " + pessoa.getEmail() + "|\t|Idade: " + pessoa.getIdade() + "|\t|Telefone: "
				+ pessoa.getTelefone() + "|\t|Endereço: " + pessoa.getEndereco() + "|\t|Bairro: " + pessoa.getBairro() + "|\t|Cep:" + pessoa.getCep());

		gravarArq.close();
	}
}
