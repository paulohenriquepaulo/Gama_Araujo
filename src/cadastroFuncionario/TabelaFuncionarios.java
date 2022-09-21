package cadastroFuncionario;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class TabelaFuncionarios extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private static DefaultTableModel model;
	private static Integer idFuncionario;
	private static Object[] row = new Object[10];;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TabelaFuncionarios frame = new TabelaFuncionarios();
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
	public TabelaFuncionarios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 928, 505);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setEnabled(false);
		scrollPane.setBounds(136, 44, 735, 398);
		contentPane.add(scrollPane);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int contador = table.getSelectedRow();
				idFuncionario = Integer.parseInt(model.getValueAt(contador, 0).toString());
				System.out.println(idFuncionario);
			}

		});

		scrollPane.setViewportView(table);
		model = new DefaultTableModel();
		Object[] colunn = { "ID", "NOME", "CPF", "E-MAIL", "TELEFONE", "ENDEREÇO", "BAIRRO", "CEP", "ESTADO",
				"DATA ADMINISSÃO" };
		model.setColumnIdentifiers(colunn);
		table.setModel(model);

		JButton btnlistar = new JButton("LISTAR");
		btnlistar.setBackground(new Color(0, 255, 153));
		btnlistar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listar();

			}
		});
		btnlistar.setBounds(10, 251, 99, 31);
		contentPane.add(btnlistar);

		JLabel lblNewLabel = new JLabel("Funcionarios");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(421, 0, 319, 41);
		contentPane.add(lblNewLabel);

		JButton btnSair = new JButton("SAIR");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setBackground(new Color(255, 0, 0));
		btnSair.setBounds(10, 411, 99, 31);
		contentPane.add(btnSair);

		JButton btnDeletar = new JButton("DELETAR");
		btnDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.err.println(idFuncionario);
				if (idFuncionario != null) {
					FuncionarioService.deletarFuncionario(idFuncionario);
					idFuncionario = null;
				} else {
					JOptionPane.showMessageDialog(null, "Para Deletar precisa selecionar um dos funcionarios");
				}
				listar();
			}
		});
		btnDeletar.setBackground(new Color(255, 153, 51));
		btnDeletar.setBounds(10, 369, 99, 31);
		contentPane.add(btnDeletar);

		JButton btnEditar = new JButton("EDITAR");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (idFuncionario != null) {
					Funcionario f = FuncionarioService.getById(idFuncionario);
					AtualizarFuncionario atualizar = new AtualizarFuncionario();
					atualizar.setVisible(true);
					atualizar.preecherCampos(f);
				}
			}
		});
		btnEditar.setBackground(new Color(255, 255, 102));
		btnEditar.setBounds(10, 330, 99, 31);
		contentPane.add(btnEditar);

		JButton btnVoltar = new JButton("VOLTAR");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Inicio().setVisible(true);
			}
		});
		btnVoltar.setBackground(new Color(204, 153, 204));
		btnVoltar.setBounds(10, 288, 99, 31);
		contentPane.add(btnVoltar);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\00787809\\Downloads\\3.png"));
		lblNewLabel_1.setBounds(0, 0, 173, 60);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\00787809\\Downloads\\2.png"));
		lblNewLabel_2.setBounds(0, 0, 912, 466);
		contentPane.add(lblNewLabel_2);

	}

	public static void listar() {
		ArrayList<Funcionario> list = FuncionarioService.listarFuncionario();
		if (model.getRowCount() != 0) {
			model.setRowCount(0);
		}
		for (Funcionario f : list) {
			try {
				row[0] = f.getId().toString();
				row[1] = f.getNome();
				row[2] = f.getCpf();
				row[3] = f.getEmail();
				row[4] = f.getTelefone();
				row[5] = f.getEndereco();
				row[6] = f.getBairro();
				row[7] = f.getCep();
				row[8] = f.getEstado();
				row[9] = f.getDataAdmiao().toString();
				model.addRow(row);
			} catch (RuntimeException erro) {
				JOptionPane.showMessageDialog(null, erro.getMessage());
			}
		}
	}
}
