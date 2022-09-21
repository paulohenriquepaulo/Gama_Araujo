package cadastroFuncionario;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class CadastrarFuncionarios extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField campNome;
	private JTextField campCpf;
	private JTextField campEmail;
	private JTextField campTelefone;
	private JTextField campEstado;
	private JLabel txtEstado;
	private JLabel TXTcEP;
	private JTextField campCep;
	private JTextField campBairro;
	private JLabel txtBairro;
	private JLabel txtEndereco;
	private JTextField campEndereco;
	private JTextField campIdade;
	private JLabel lblIdade;
	private JTextField campDataAdmissao;
	private JLabel txtDataAdmissao;
	private JLabel lblNewLabel_1;
	private JButton btnVoltar;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarFuncionarios frame = new CadastrarFuncionarios();
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
	public CadastrarFuncionarios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 551, 455);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Cadastrar Funcionário");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 29));
		lblNewLabel.setBounds(35, 27, 404, 43);
		contentPane.add(lblNewLabel);

		JLabel textNome = new JLabel("NOME:");
		textNome.setForeground(new Color(255, 255, 255));
		textNome.setFont(new Font("Tahoma", Font.BOLD, 13));
		textNome.setBounds(24, 107, 86, 28);
		contentPane.add(textNome);

		JLabel textCpf = new JLabel("CPF:");
		textCpf.setForeground(new Color(255, 255, 255));
		textCpf.setFont(new Font("Tahoma", Font.BOLD, 13));
		textCpf.setBounds(24, 136, 86, 28);
		contentPane.add(textCpf);

		JLabel textEmail = new JLabel("E-MAIL");
		textEmail.setForeground(new Color(255, 255, 255));
		textEmail.setFont(new Font("Tahoma", Font.BOLD, 13));
		textEmail.setBounds(24, 166, 86, 28);
		contentPane.add(textEmail);

		JLabel textTelefone = new JLabel("TELEFONE:");
		textTelefone.setForeground(new Color(255, 255, 255));
		textTelefone.setFont(new Font("Tahoma", Font.BOLD, 13));
		textTelefone.setBounds(24, 197, 86, 28);
		contentPane.add(textTelefone);

		campNome = new JTextField();
		campNome.setBounds(148, 112, 256, 19);
		contentPane.add(campNome);
		campNome.setColumns(10);

		campCpf = new JTextField();
		campCpf.setColumns(10);
		campCpf.setBounds(148, 141, 256, 19);
		contentPane.add(campCpf);

		campEmail = new JTextField();
		campEmail.setColumns(10);
		campEmail.setBounds(148, 171, 256, 19);
		contentPane.add(campEmail);

		campTelefone = new JTextField();
		campTelefone.setColumns(10);
		campTelefone.setBounds(148, 202, 256, 19);
		contentPane.add(campTelefone);

		campEstado = new JTextField();
		campEstado.setColumns(10);
		campEstado.setBounds(148, 351, 256, 19);
		contentPane.add(campEstado);

		txtEstado = new JLabel("ESTADO:");
		txtEstado.setForeground(new Color(255, 255, 255));
		txtEstado.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtEstado.setBounds(24, 346, 86, 28);
		contentPane.add(txtEstado);

		TXTcEP = new JLabel("CEP:");
		TXTcEP.setForeground(new Color(255, 255, 255));
		TXTcEP.setFont(new Font("Tahoma", Font.BOLD, 13));
		TXTcEP.setBounds(24, 315, 86, 28);
		contentPane.add(TXTcEP);

		campCep = new JTextField();
		campCep.setColumns(10);
		campCep.setBounds(148, 321, 256, 19);
		contentPane.add(campCep);

		campBairro = new JTextField();
		campBairro.setColumns(10);
		campBairro.setBounds(148, 291, 256, 19);
		contentPane.add(campBairro);

		txtBairro = new JLabel("BAIRRO:");
		txtBairro.setForeground(new Color(255, 255, 255));
		txtBairro.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtBairro.setBounds(24, 285, 86, 28);
		contentPane.add(txtBairro);

		txtEndereco = new JLabel("ENDEREÇO:");
		txtEndereco.setForeground(new Color(255, 255, 255));
		txtEndereco.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtEndereco.setBounds(24, 256, 86, 28);
		contentPane.add(txtEndereco);

		campEndereco = new JTextField();
		campEndereco.setColumns(10);
		campEndereco.setBounds(148, 261, 256, 19);
		contentPane.add(campEndereco);

		JButton btnCadastrar = new JButton("CADASTRAR");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					FuncionarioService.validarCampos(campNome, campEndereco, campIdade, campEmail, campCpf,
							campTelefone, campBairro, campCep, campEstado, campDataAdmissao);

					Funcionario funcionairo = new Funcionario(null, campNome.getText(),
							Integer.parseInt(campIdade.getText()), campCpf.getText(), campEmail.getText(),
							campTelefone.getText(), campEndereco.getText(), campBairro.getText(), campCep.getText(),
							campEstado.getText(), LocalDate.parse(campDataAdmissao.getText()));

					if (!FuncionarioService.cadastrarFuncionairo(funcionairo).equals(null)) {
						FuncionarioService.limparCampos(campNome, campEndereco, campIdade, campEmail, campCpf,
								campTelefone, campBairro, campCep, campEstado, campDataAdmissao);
					}
				} catch (RuntimeException ex) {
					JOptionPane.showMessageDialog(null, ex.getMessage());
				}
			}
		});
		btnCadastrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCadastrar.setBackground(new Color(0, 204, 51));
		btnCadastrar.setBounds(414, 300, 109, 43);
		contentPane.add(btnCadastrar);

		campIdade = new JTextField();
		campIdade.setColumns(10);
		campIdade.setBounds(148, 231, 256, 19);
		contentPane.add(campIdade);

		lblIdade = new JLabel("IDADE:");
		lblIdade.setForeground(new Color(255, 255, 255));
		lblIdade.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblIdade.setBounds(24, 226, 86, 28);
		contentPane.add(lblIdade);

		campDataAdmissao = new JTextField();
		campDataAdmissao.setColumns(10);
		campDataAdmissao.setBounds(148, 378, 256, 19);
		contentPane.add(campDataAdmissao);

		txtDataAdmissao = new JLabel("DATA ADMISSAO:");
		txtDataAdmissao.setForeground(new Color(255, 255, 255));
		txtDataAdmissao.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtDataAdmissao.setBounds(24, 373, 123, 28);
		contentPane.add(txtDataAdmissao);

		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\00787809\\Downloads\\3.png"));
		lblNewLabel_1.setBounds(366, 11, 180, 59);
		contentPane.add(lblNewLabel_1);

		btnVoltar = new JButton("VOLTAR");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Inicio().setVisible(true);
			}
		});
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnVoltar.setBackground(new Color(255, 153, 204));
		btnVoltar.setBounds(414, 354, 109, 43);
		contentPane.add(btnVoltar);

		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\00787809\\Downloads\\2.png"));
		lblNewLabel_2.setBounds(0, 0, 535, 416);
		contentPane.add(lblNewLabel_2);

	}

}
