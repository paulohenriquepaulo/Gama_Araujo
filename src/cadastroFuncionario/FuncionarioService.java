package cadastroFuncionario;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FuncionarioService {

	private static FuncionarioRepository repository = new FuncionarioRepository();

	public static Funcionario cadastrarFuncionairo(Funcionario funcionario) {
			try {
				validarCpfExistente(funcionario.getCpf());
				return novoFuncionario(funcionario);
			} catch (RuntimeException e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
			return null;
	}

	public static Funcionario novoFuncionario(Funcionario funcionario) {
		repository.inserir(funcionario);
		return funcionario;
	}

	public static void atualizarFuncionario(Funcionario f) {
		repository.atualizar(f);
	}

	public static void deletarFuncionario(int id) {
		repository.excluir(id);
	}

	public static ArrayList<Funcionario> listarFuncionario() {
		return repository.listarFuncionarios();

	}

	public static Funcionario getById(Integer id) {
		return repository.getById(id);
	}
	
	public static Funcionario getByCPF(String cpf) {
		return repository.getByCpf(cpf);
	}

	public static Boolean getByCpf(String cpf) {
		return repository.countByCpf(cpf);
	}

	public static void validarCpfExistente(String cpf) {
		if (getByCpf(cpf)) {
			throw new RuntimeException("CPF já cadastrado");
		}
	}

	public static void limparCampos(JTextField... j) {
		for (int i = 0; i < j.length; i++) {
			j[i].setText("");

		}
	}

	public static void validarCampos(JTextField... campo) {
		for (int i = 0; i < campo.length; i++) {
			if (campo[i].getText().equals("")) {
				campo[i].requestFocus();
				throw new RuntimeException("Não pode conter campos vazios.");
			}

		}
	}

}
