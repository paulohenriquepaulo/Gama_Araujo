package cadastroFuncionario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class FuncionarioRepository {

	// Declarando as variáveis que serão utilizaadas para configurar o nosso
	// conector
	private static Connection connection = null;
	private static java.sql.Statement statement = null;
	private static ResultSet resultSet = null;

	// criando o métodod de conexão com o banco de dados
	private static void conectar() {
		// Criando a variável para se conectar ao nosso servidor e DataBase
		String servidor = "jdbc:mysql://localhost/funcionarios";

		// Criando a variável do ususario do banco de dados
		String usuario = "root";

		// Criando a variável senha do banco de dados
		String senha = "mysql";

		// Criando a variável de conexão
		String driver = "com.mysql.cj.jdbc.Driver";

		// Criando o processo de analise da nossa conexão com o banco de dados
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(servidor, usuario, senha);
			statement = connection.createStatement();
			System.out.println("conectado...");
		} catch (Exception e) {
			System.out.println("ERRO: " + e.getMessage());
		}
	}

	public boolean estaConectado() {
		if (connection != null) {
			return true;
		}
		return false;
	}

	public static Funcionario getById(int id) {
		Funcionario f = null;
		try {

			String sql = "SELECT * FROM funcionarios where Id_Funcionario = " + id + ";";

			ResultSet resultSet = executarConsulta(sql);

			if (resultSet.next()) {
				f = new Funcionario();
				f.setId(resultSet.getInt("Id_Funcionario"));
				f.setNome(resultSet.getString("Nome_Funcionario"));
				f.setIdade(resultSet.getInt("Idade_Funcionario"));
				f.setCpf(resultSet.getString("CPF_Funcionario"));
				f.setEndereco(resultSet.getString("Endereco_Funcionario"));
				f.setBairro(resultSet.getString("Bairro_Funcionario"));
				f.setCep(resultSet.getString("CEP_Funcionario"));
				f.setEstado(resultSet.getString("Estado_Funcionario"));
				f.setEmail(resultSet.getString("Email_Funcionario"));
				f.setDataAdmiao(LocalDate.parse(resultSet.getString("Data_Admissao")));
				f.setTelefone(resultSet.getString("Celular_Funcionario"));

			}
		} catch (Exception e) {
			System.out.println("ERRO:" + e.getMessage());
		}
		return f;
	}
	
	public  Funcionario getByCpf(String cpf) {
		Funcionario f = null;
		try {

			String sql = "SELECT * FROM funcionarios where CPF_Funcionario = '" + cpf + "';";

			ResultSet resultSet = executarConsulta(sql);

			if (resultSet.next()) {
				f = new Funcionario();
				f.setId(resultSet.getInt("Id_Funcionario"));
				f.setNome(resultSet.getString("Nome_Funcionario"));
				f.setIdade(resultSet.getInt("Idade_Funcionario"));
				f.setCpf(resultSet.getString("CPF_Funcionario"));
				f.setEndereco(resultSet.getString("Endereco_Funcionario"));
				f.setBairro(resultSet.getString("Bairro_Funcionario"));
				f.setCep(resultSet.getString("CEP_Funcionario"));
				f.setEstado(resultSet.getString("Estado_Funcionario"));
				f.setEmail(resultSet.getString("Email_Funcionario"));
				f.setDataAdmiao(LocalDate.parse(resultSet.getString("Data_Admissao")));
				f.setTelefone(resultSet.getString("Celular_Funcionario"));
			}
			return f;
		} catch (Exception e) {
			System.out.println("ERRO:" + e.getMessage());
			return null;
		}
	}
	

	public static Boolean countByCpf(String cpf) {
		String sql = "SELECT COUNT(*) as num_intem FROM Funcionarios WHERE CPF_Funcionario = '" + cpf + "';";
		resultSet = executarConsulta(sql);

		try {
			if (resultSet.next()) {
				int quantidadeCpf = resultSet.getInt("num_intem");
				if (quantidadeCpf <= 0) {
					return false;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	private static ResultSet executarConsulta(String consulta) {
		conectar();
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(consulta);
		} catch (SQLException ex) {
			System.out.println("Não conseguiu executar a consulta\n" + consulta);
			// Caso ocorra algum erro desconecta do banco de dados.

		}

		return resultSet;
	}

	public static ArrayList<Funcionario> listarFuncionarios() {

		ArrayList<Funcionario> lista = new ArrayList<>();
		String listar = "SELECT * FROM Funcionarios";
		ResultSet resultSet = executarConsulta(listar);

		try {
			while (resultSet.next()) {
				Funcionario f = new Funcionario();
				f.setId(resultSet.getInt("Id_Funcionario"));
				f.setNome(resultSet.getString("Nome_Funcionario"));
				f.setIdade(resultSet.getInt("Idade_Funcionario"));
				f.setCpf(resultSet.getString("CPF_Funcionario"));
				f.setEndereco(resultSet.getString("Endereco_Funcionario"));
				f.setBairro(resultSet.getString("Bairro_Funcionario"));
				f.setBairro(resultSet.getString("Bairro_Funcionario"));
				f.setCep(resultSet.getString("CEP_Funcionario"));
				f.setEstado(resultSet.getString("Estado_Funcionario"));
				f.setEmail(resultSet.getString("Email_Funcionario"));
				f.setDataAdmiao(LocalDate.parse(resultSet.getString("Data_Admissao")));
				f.setTelefone(resultSet.getString("Celular_Funcionario"));
				lista.add(f);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return lista;

	}

	public static boolean executarDML(String dml) {
		conectar();
		boolean ok = false;
		try {
			statement = connection.createStatement();
			statement.execute(dml);
			ok = true;
		} catch (SQLException ex) {
			System.out.println("Nao conseguiu executar o DML\n" + dml);
		}

		return ok;
	}

	public void inserir(Funcionario funcionario) {
		String inserir = "INSERT INTO `Funcionarios` " + " VALUES (null, '" + funcionario.getNome() + "', '"
				+ funcionario.getIdade() + "', " + "'" + funcionario.getCpf() + "', '" + funcionario.getEndereco()
				+ "', '" + funcionario.getBairro() + "','" + funcionario.getCep() + "', '" + funcionario.getEstado()
				+ "', '" + funcionario.getDataAdmiao().toString() + "','" + funcionario.getEmail() + "', '"
				+ funcionario.getTelefone() + "');";
		System.out.println(inserir);
		executarDML(inserir);
	}

	// Este metodo exclui um funcionario pelo id
	public void excluir(int id) {
		String delete = "DELETE FROM FUNCIONARIOS WHERE Id_Funcionario ='" + id + "'";
		executarDML(delete);
	}

	public static void atualizar(Funcionario f) {
		String update = "UPDATE `funcionarios`.`Funcionarios` SET `Nome_Funcionario` = '" + f.getNome()
				+ "', `Idade_Funcionario` = '" + f.getIdade() + "', `Endereco_Funcionario` = '" + f.getEndereco()
				+ "', `Bairro_Funcionario` = '" + f.getBairro() + "', `CEP_Funcionario` = '" + f.getCep()
				+ "', `Estado_funcionario` = '" + f.getEstado() + "', `Email_Funcionario` = '" + f.getEmail()
				+ "', `Celular_Funcionario` = '" + f.getTelefone() + "' WHERE (`Id_Funcionario` = '" + f.getId()
				+ "');";
		executarDML(update);

	}

}
