package formulario;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Formulario extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField campNome;
	private JTextField campTelefone;
	private JTextField campEmail;
	private JTextField campIdade;
	private JTextField campEndereco;
	private JTextField campBairro;
	private JTextField campCep;
	private JTextField campEstado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
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
	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 490, 369);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Formulário");
		lblNewLabel.setFont(new Font("Sitka Banner", Font.BOLD | Font.ITALIC, 27));
		lblNewLabel.setBounds(175, 0, 132, 44);
		contentPane.add(lblNewLabel);
		
		JLabel txtNome = new JLabel("Nome:");
		txtNome.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtNome.setBounds(10, 52, 75, 22);
		contentPane.add(txtNome);
		
		campNome = new JTextField();
		campNome.setBounds(89, 55, 331, 20);
		contentPane.add(campNome);
		campNome.setColumns(10);
		
		JLabel txtTelefone = new JLabel("Telefone: ");
		txtTelefone.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtTelefone.setBounds(10, 136, 75, 14);
		contentPane.add(txtTelefone);
		
		campTelefone = new JTextField();
		campTelefone.setBounds(89, 135, 118, 19);
		contentPane.add(campTelefone);
		campTelefone.setColumns(10);
		
		JButton btnNewButton = new JButton("Gravar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = campNome.getText();
				String email = campEmail.getText();
				String idade = campIdade.getText();
				String telefone = campTelefone.getText();
				String endereco = campEndereco.getText();
				String bairro = campBairro.getText();
				String cep = campCep.getText();
				String estado = campEstado.getText();;
				try {
					PessoaService.cadastrarPessoa(nome, email, idade, telefone, endereco, bairro, cep, estado);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				campNome.setText("");
				campEmail.setText("");
				campIdade.setText("");
				campTelefone.setText("");
				campEndereco.setText("");
				campBairro.setText("");
				campCep.setText("");
				campEstado.setText("");
				
			}
		});
		btnNewButton.setBounds(42, 280, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnSair.setBounds(348, 280, 89, 23);
		contentPane.add(btnSair);
		
		JLabel txtEmail = new JLabel("E-mail: ");
		txtEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtEmail.setBounds(10, 86, 75, 14);
		contentPane.add(txtEmail);
		
		JLabel txtIdade = new JLabel("Idade:");
		txtIdade.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtIdade.setBounds(10, 111, 75, 14);
		contentPane.add(txtIdade);
		
		campEmail = new JTextField();
		campEmail.setColumns(10);
		campEmail.setBounds(89, 85, 331, 20);
		contentPane.add(campEmail);
		
		campIdade = new JTextField();
		campIdade.setColumns(10);
		campIdade.setBounds(89, 111, 54, 19);
		contentPane.add(campIdade);
		
		JLabel txtEndereco = new JLabel("Endereço: ");
		txtEndereco.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtEndereco.setBounds(10, 161, 75, 14);
		contentPane.add(txtEndereco);
		
		campEndereco = new JTextField();
		campEndereco.setColumns(10);
		campEndereco.setBounds(89, 161, 331, 19);
		contentPane.add(campEndereco);
		
		JLabel txtBairro = new JLabel("Bairro:");
		txtBairro.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtBairro.setBounds(10, 188, 75, 14);
		contentPane.add(txtBairro);
		
		campBairro = new JTextField();
		campBairro.setColumns(10);
		campBairro.setBounds(89, 186, 331, 19);
		contentPane.add(campBairro);
		
		JLabel txtCep = new JLabel("CEP:");
		txtCep.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtCep.setBounds(10, 213, 75, 14);
		contentPane.add(txtCep);
		
		campCep = new JTextField();
		campCep.setColumns(10);
		campCep.setBounds(89, 212, 118, 19);
		contentPane.add(campCep);
		
		JLabel txtEstado = new JLabel("Estado:");
		txtEstado.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtEstado.setBounds(10, 238, 75, 14);
		contentPane.add(txtEstado);
		
		campEstado = new JTextField();
		campEstado.setColumns(10);
		campEstado.setBounds(89, 238, 118, 19);
		contentPane.add(campEstado);
	}
}
