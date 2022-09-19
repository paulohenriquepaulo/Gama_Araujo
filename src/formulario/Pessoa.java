package formulario;

public class Pessoa {
	
	 private String nome;
	 private String email;
	 private String idade;
	 private String telefone;
	 private String endereco;
	 private String bairro;
	 private String cep;
	 private String estado;
	 
	 
	public Pessoa() {
		
	}

	public Pessoa(String nome, String email, String idade, String telefone, String endereco, String bairro, String cep,
			String estado) {
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.telefone = telefone;
		this.endereco = endereco;
		this.bairro = bairro;
		this.cep = cep;
		this.estado = estado;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
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
	 
	 
	

}
