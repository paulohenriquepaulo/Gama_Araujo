package cadastroProduto;

public class ProdutoModel {

	private String nome;
	private String quantidade;
	private String valorUnitario;
	private String marca;
	private String validade;

	public ProdutoModel() {
		super();
	}


	public ProdutoModel(String nome, String quantidade, String valorUnitario, String marca, String validade) {
		super();
		this.nome = nome;
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;
		this.marca = marca;
		this.validade = validade;
	}




	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	

	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	public String getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(String valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", quantidade=" + quantidade + ", valorUnitario=" + valorUnitario
				+ ", validade=" + validade + "]";
	}

}
