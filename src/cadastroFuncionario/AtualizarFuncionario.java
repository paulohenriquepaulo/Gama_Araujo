package cadastroFuncionario;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class AtualizarFuncionario extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField campNome;
	private JTextField campCpf;
	private JTextField campEmail;
	private JTextField campTelefone;
	private JTextField campIdade;
	private JTextField campEndereco;
	private JTextField campBairro;
	private JTextField campCep;
	private JTextField campEstado;
	private JTextField campDataAdmissao;
	private JTextField campId;
	private JButton btnVoltar;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					AtualizarFuncionario frame = new AtualizarFuncionario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public  void preecherCampos(Funcionario f) {
		campId.setText(f.getId().toString());
		campNome.setText(f.getNome());
		campEndereco.setText(f.getEndereco());
		campIdade.setText(f.getIdade().toString());
		campEmail.setText(f.getEmail());
		campCpf.setText(f.getCpf());
		campTelefone.setText(f.getTelefone());
		campBairro.setText(f.getBairro());
		campCep.setText(f.getCep());
		campEstado.setText(f.getEstado());
		campDataAdmissao.setText(f.getDataAdmiao().toString());
	}

	/**
	 * Create the frame.
	 */
	public AtualizarFuncionario() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 644, 414);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel textNome = new JLabel("NOME:");
		textNome.setForeground(new Color(255, 255, 255));
		textNome.setFont(new Font("Tahoma", Font.BOLD, 13));
		textNome.setBounds(116, 70, 86, 28);
		contentPane.add(textNome);

		campNome = new JTextField();
		campNome.setColumns(10);
		campNome.setBounds(240, 75, 256, 19);
		contentPane.add(campNome);

		JLabel textCpf = new JLabel("CPF:");
		textCpf.setForeground(new Color(255, 255, 255));
		textCpf.setFont(new Font("Tahoma", Font.BOLD, 13));
		textCpf.setBounds(116, 99, 86, 28);
		contentPane.add(textCpf);

		campCpf = new JTextField();
		campCpf.setEditable(false);
		campCpf.setColumns(10);
		campCpf.setBounds(240, 104, 256, 19);
		contentPane.add(campCpf);

		JLabel textEmail = new JLabel("E-MAIL");
		textEmail.setForeground(new Color(255, 255, 255));
		textEmail.setFont(new Font("Tahoma", Font.BOLD, 13));
		textEmail.setBounds(116, 129, 86, 28);
		contentPane.add(textEmail);

		campEmail = new JTextField();
		campEmail.setColumns(10);
		campEmail.setBounds(240, 134, 256, 19);
		contentPane.add(campEmail);

		JLabel textTelefone = new JLabel("TELEFONE:");
		textTelefone.setForeground(new Color(255, 255, 255));
		textTelefone.setFont(new Font("Tahoma", Font.BOLD, 13));
		textTelefone.setBounds(116, 160, 86, 28);
		contentPane.add(textTelefone);

		campTelefone = new JTextField();
		campTelefone.setColumns(10);
		campTelefone.setBounds(240, 165, 256, 19);
		contentPane.add(campTelefone);

		JLabel lblIdade = new JLabel("IDADE:");
		lblIdade.setForeground(new Color(255, 255, 255));
		lblIdade.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblIdade.setBounds(116, 189, 86, 28);
		contentPane.add(lblIdade);

		campIdade = new JTextField();
		campIdade.setColumns(10);
		campIdade.setBounds(240, 194, 256, 19);
		contentPane.add(campIdade);

		JLabel txtEndereco = new JLabel("ENDEREÇO:");
		txtEndereco.setForeground(new Color(255, 255, 255));
		txtEndereco.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtEndereco.setBounds(116, 219, 86, 28);
		contentPane.add(txtEndereco);

		campEndereco = new JTextField();
		campEndereco.setColumns(10);
		campEndereco.setBounds(240, 224, 256, 19);
		contentPane.add(campEndereco);

		JLabel txtBairro = new JLabel("BAIRRO:");
		txtBairro.setForeground(new Color(255, 255, 255));
		txtBairro.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtBairro.setBounds(116, 248, 86, 28);
		contentPane.add(txtBairro);

		campBairro = new JTextField();
		campBairro.setColumns(10);
		campBairro.setBounds(240, 254, 256, 19);
		contentPane.add(campBairro);

		JLabel TXTcEP = new JLabel("CEP:");
		TXTcEP.setForeground(new Color(255, 255, 255));
		TXTcEP.setFont(new Font("Tahoma", Font.BOLD, 13));
		TXTcEP.setBounds(116, 278, 86, 28);
		contentPane.add(TXTcEP);

		campCep = new JTextField();
		campCep.setColumns(10);
		campCep.setBounds(240, 284, 256, 19);
		contentPane.add(campCep);

		JLabel txtEstado = new JLabel("ESTADO:");
		txtEstado.setForeground(new Color(255, 255, 255));
		txtEstado.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtEstado.setBounds(116, 309, 86, 28);
		contentPane.add(txtEstado);

		campEstado = new JTextField();
		campEstado.setColumns(10);
		campEstado.setBounds(240, 314, 256, 19);
		contentPane.add(campEstado);

		campDataAdmissao = new JTextField();
		campDataAdmissao.setColumns(10);
		campDataAdmissao.setBounds(240, 341, 256, 19);
		contentPane.add(campDataAdmissao);

		JLabel txtDataAdmissao = new JLabel("DATA ADMISSAO:");
		txtDataAdmissao.setForeground(new Color(255, 255, 255));
		txtDataAdmissao.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtDataAdmissao.setBounds(116, 336, 123, 28);
		contentPane.add(txtDataAdmissao);

		JLabel lblId = new JLabel("ID:");
		lblId.setForeground(new Color(255, 255, 255));
		lblId.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblId.setBounds(116, 36, 86, 28);
		contentPane.add(lblId);

		campId = new JTextField();
		campId.setEditable(false);
		campId.setColumns(10);
		campId.setBounds(240, 41, 256, 19);
		contentPane.add(campId);

		JButton btnNewButton = new JButton("SALVAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Funcionario f = FuncionarioService.getById(Integer.parseInt(campId.getText()));

				try {
					FuncionarioService.validarCampos(campNome, campEndereco, campIdade, campEmail, campTelefone,
							campBairro, campCep, campEstado, campDataAdmissao);

					f.setNome(campNome.getText());
					f.setIdade(Integer.parseInt(campIdade.getText()));
					f.setEmail(campEmail.getText());
					f.setTelefone(campTelefone.getText());
					f.setEndereco(campEndereco.getText());
					f.setBairro(campBairro.getText());
					f.setEstado(campEstado.getText());
					f.setCep(campCep.getText());
					f.setDataAdmiao(LocalDate.parse(campDataAdmissao.getText()));
					FuncionarioService.atualizarFuncionario(f);
					FuncionarioService.limparCampos(campId, campNome, campEndereco, campIdade, campEmail, campCpf,
							campTelefone, campBairro, campCep, campEstado, campDataAdmissao);
				} catch (RuntimeException ex) {
					JOptionPane.showMessageDialog(null, ex.getMessage());
				}

			}
		});
		btnNewButton.setBackground(new Color(0, 255, 102));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(518, 260, 89, 46);
		contentPane.add(btnNewButton);

		btnVoltar = new JButton("VOLTAR");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TabelaFuncionarios().setVisible(true);
				TabelaFuncionarios.listar();
			}
		});
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnVoltar.setBackground(new Color(255, 153, 204));
		btnVoltar.setBounds(518, 314, 89, 46);
		contentPane.add(btnVoltar);

		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\00787809\\Downloads\\3.png"));
		lblNewLabel.setBounds(465, 0, 163, 64);
		contentPane.add(lblNewLabel);

		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\00787809\\Downloads\\2.png"));
		lblNewLabel_1.setBounds(0, 0, 628, 375);
		contentPane.add(lblNewLabel_1);

	}

}
