package cadastroProduto;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class CadastroProdutos extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static JTextField campProduto;
	private static JTextField campQuantidade;
	private static JTextField campValorUnitario;
	private static JTextField campMarca;
	private static JTextField campValidade;
	private JTable table;
	private DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroProdutos frame = new CadastroProdutos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastroProdutos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 870, 469);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Cadastro de Produtos");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 29));
		lblNewLabel.setBounds(276, 0, 420, 56);
		contentPane.add(lblNewLabel);

		JLabel txtProduto = new JLabel("Produto:");
		txtProduto.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtProduto.setBounds(26, 91, 85, 23);
		contentPane.add(txtProduto);

		JLabel txtQuantidade = new JLabel("Quantidade:");
		txtQuantidade.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtQuantidade.setBounds(26, 125, 85, 23);
		contentPane.add(txtQuantidade);

		JLabel txtValorUnitario = new JLabel("Valor Unitario:");
		txtValorUnitario.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtValorUnitario.setBounds(26, 159, 99, 23);
		contentPane.add(txtValorUnitario);

		JLabel txtMarca = new JLabel("Marca:");
		txtMarca.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtMarca.setBounds(26, 193, 85, 23);
		contentPane.add(txtMarca);

		JLabel lblNewLabel_1_3_1 = new JLabel("Validade:");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_3_1.setBounds(26, 227, 85, 23);
		contentPane.add(lblNewLabel_1_3_1);

		campProduto = new JTextField();
		campProduto.setBounds(131, 93, 182, 23);
		contentPane.add(campProduto);
		campProduto.setColumns(10);

		campQuantidade = new JTextField();
		campQuantidade.setColumns(10);
		campQuantidade.setBounds(131, 128, 182, 23);
		contentPane.add(campQuantidade);

		campValorUnitario = new JTextField();
		campValorUnitario.setColumns(10);
		campValorUnitario.setBounds(131, 162, 182, 23);
		contentPane.add(campValorUnitario);

		campMarca = new JTextField();
		campMarca.setColumns(10);
		campMarca.setBounds(131, 196, 182, 23);
		contentPane.add(campMarca);

		campValidade = new JTextField();
		campValidade.setColumns(10);
		campValidade.setBounds(131, 230, 182, 23);
		contentPane.add(campValidade);

		JButton btnEditar = new JButton("EDITAR");
		btnEditar.setBackground(new Color(204, 255, 51));
		btnEditar.setBounds(120, 319, 93, 40);
		contentPane.add(btnEditar);

		JButton btnExcluir = new JButton("EXCLUIR");
		btnExcluir.setBackground(new Color(255, 102, 51));
		btnExcluir.setBounds(223, 319, 90, 40);
		contentPane.add(btnExcluir);

		JButton btnSair = new JButton("SAIR");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setBackground(new Color(255, 0, 0));
		btnSair.setBounds(18, 379, 90, 40);
		contentPane.add(btnSair);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setEnabled(false);
		scrollPane.setBounds(332, 91, 512, 266);
		contentPane.add(scrollPane);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int contador = table.getSelectedRow();
				campProduto.setText(model.getValueAt(contador, 0).toString());
				campQuantidade.setText(model.getValueAt(contador, 1).toString());
				campValorUnitario.setText(model.getValueAt(contador, 2).toString());
				campMarca.setText(model.getValueAt(contador, 3).toString());
				campValidade.setText(model.getValueAt(contador, 4).toString());
			}
		});

		scrollPane.setViewportView(table);
		model = new DefaultTableModel();
		Object[] colunn = { "PRODUTO", "QUANTIDADE", "VALOR UNITARIO", "MARCA", "VALIDADE" };
		Object[] row = new Object[5];
		model.setColumnIdentifiers(colunn);

		table.setModel(model);

		JButton btnCriar = new JButton("CRIAR");
		btnCriar.setBackground(new Color(144, 238, 144));
		btnCriar.setForeground(new Color(0, 0, 0));
		btnCriar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProdutoModel novoProduto = new ProdutoModel(campProduto.getText(), campQuantidade.getText(),
						campValorUnitario.getText(), campMarca.getText(), campValidade.getText());

				try {
					validarCampos(novoProduto);
					row[0] = campProduto.getText();
					row[1] = campQuantidade.getText();
					row[2] = campValorUnitario.getText();
					row[3] = campMarca.getText();
					ProdutoService.cadastrarProduto(novoProduto);
					if (campValidade.getText().equals("")) {
						campValidade.setText("## ## ####");
						row[4] = campValidade.getText();
						campValidade.setText("");
					} else {
						row[4] = campValidade.getText();
					}
					limparCamp();
					model.addRow(row);

				} catch (RuntimeException erro) {
					JOptionPane.showMessageDialog(null, erro.getMessage());
				}

			}
		});
		btnCriar.setBounds(18, 319, 93, 40);
		contentPane.add(btnCriar);

	}

	public static void validarCampos(ProdutoModel p) {

		if (p.getNome().equals("")) {
			campProduto.setText("");
			campProduto.requestFocus();
			throw new RuntimeException("O campo nome não pode ser vazio");
		}

		if (p.getQuantidade().equals("")) {
			campQuantidade.setText("");
			campQuantidade.requestFocus();
			throw new RuntimeException("A quantidade não pode ser vazia");
		}

		if (!p.getQuantidade().equals("")) {
			try {
				Integer.parseInt(p.getQuantidade());
				validarValor(p.getQuantidade(), "quantidade");
			} catch (NumberFormatException e) {
				campQuantidade.setText("");
				campQuantidade.requestFocus();
				throw new RuntimeException("A quantidadde é invalida");
			}
		}

		if (p.getValorUnitario().equals("")) {
			campValorUnitario.setText("");
			campValorUnitario.requestFocus();
			throw new RuntimeException("O valor não pode ser vazio");
		}

		if (!p.getValorUnitario().equals("")) {
			try {
				Integer.parseInt(p.getValorUnitario());
				validarValor(p.getValorUnitario(), "valor unitario");
			} catch (NumberFormatException e) {
				campValorUnitario.setText("");
				campValorUnitario.requestFocus();
				throw new RuntimeException("O valor é invalido");
			}
		}

		if (!p.getValidade().equals("")) {
			try {
				LocalDate.parse(p.getValidade(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			} catch (DateTimeParseException e) {
				campValidade.setText("");
				campValidade.requestFocus();
				throw new RuntimeException("A data é invalida");
			}
		}

		if (p.getMarca().equals("")) {
			campMarca.setText("");
			campMarca.requestFocus();
			throw new RuntimeException("A marca não pode ser vazia");
		}

	}

	private static void validarValor(String valor, String campo) {

		if (Integer.parseInt(valor) <= 0) {
			throw new RuntimeException("O campo " + campo + " precisa ser maior que 0");
		}

	}

	private static void limparCamp() {
		campMarca.setText("");
		campValidade.setText("");
		campValorUnitario.setText("");
		campQuantidade.setText("");
		campProduto.setText("");
	}
}
