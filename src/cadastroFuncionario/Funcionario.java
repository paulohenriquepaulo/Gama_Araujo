package cadastroFuncionario;
import java.time.LocalDate;

public class Funcionario {

	private Integer id;
	private String nome;
	private Integer idade;
	private String cpf;
	private String email;
	private String telefone;
	private String endereco;
	private String bairro;
	private String cep;
	private String estado;
	private LocalDate dataAdmisao;
	
	

	public Funcionario() {
		super();
	}

	public Funcionario(Integer id, String nome, Integer idade, String cpf, String email, String telefone, String endereco,
			String bairro, String cep, String estado, LocalDate dataAdmissao) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
		this.bairro = bairro;
		this.cep = cep;
		this.estado = estado;
		this.dataAdmisao = dataAdmissao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public LocalDate getDataAdmiao() {
		return dataAdmisao;
	}

	public void setDataAdmiao(LocalDate dataAdmiao) {
		this.dataAdmisao = dataAdmiao;
	}

	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", idade=" + idade + ", cpf=" + cpf + ", email=" + email
				+ ", telefone=" + telefone + ", endereco=" + endereco + ", bairro=" + bairro + ", cep=" + cep
				+ ", estado=" + estado + ", dataAdmiao=" + dataAdmisao + "]";
	}

	
	
}
