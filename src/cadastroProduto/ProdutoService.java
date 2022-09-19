package cadastroProduto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class ProdutoService {

	public static ProdutoModel cadastrarProduto(ProdutoModel produto) {
		String caminho = "c:\\teste\\Produtos.txt";
		try {

			ProdutoModel p = novoProduto(produto);
			salvarProduto(caminho, p.toString());
			return p;
		} catch (RuntimeException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		return null;
	}

	private static ProdutoModel novoProduto(ProdutoModel p) {
		ProdutoModel novoProduto = new ProdutoModel();
		novoProduto.setNome(p.getNome());
		novoProduto.setQuantidade(p.getQuantidade());
		novoProduto.setValidade(p.getValidade());
		novoProduto.setMarca(p.getMarca());
		novoProduto.setValorUnitario(p.getValorUnitario());
		return novoProduto;
	}

	private static void salvarProduto(String caminho, String arquivo) {

		try (FileWriter NovoArquivo = new FileWriter(caminho, true);
				BufferedWriter buffer = new BufferedWriter(NovoArquivo);
				PrintWriter escritorDeArquivo = new PrintWriter(buffer);) {
				escritorDeArquivo.append(arquivo + "\n");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	

}
