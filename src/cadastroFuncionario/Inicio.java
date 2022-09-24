package cadastroFuncionario;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class Inicio extends JFrame {


	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnCadastrar;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
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
	public Inicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 605, 436);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 153, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnCadastrar = new JButton("CADASTRAR FUNCIONARIO");
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnCadastrar.setBorder(UIManager.getBorder("CheckBox.border"));
		btnCadastrar.setBackground(new Color(153, 204, 102));
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastrarFuncionarios forFuncionarios = new CadastrarFuncionarios();
				forFuncionarios.setVisible(true);
			}
		});
		btnCadastrar.setBounds(397, 99, 169, 40);
		contentPane.add(btnCadastrar);
		
		JButton btnSair = new JButton("SAIR");
		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnSair.setBorder(UIManager.getBorder("CheckBox.border"));
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setBackground(new Color(255, 102, 102));
		btnSair.setBounds(397, 256, 169, 40);
		contentPane.add(btnSair);
		
		JButton btnFuncionarios = new JButton("FUNCIONARIOS");
		btnFuncionarios.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnFuncionarios.setBorder(UIManager.getBorder("CheckBox.border"));
		btnFuncionarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TabelaFuncionarios funcionairos = new TabelaFuncionarios();
				funcionairos.setVisible(true);
				TabelaFuncionarios.listar();
			}
		});
		btnFuncionarios.setBackground(new Color(255, 204, 153));
		btnFuncionarios.setBounds(397, 150, 169, 40);
		contentPane.add(btnFuncionarios);
		
		JButton btnSair_1 = new JButton("PESQUISAR");
		btnSair_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  String cpf = JOptionPane.showInputDialog("Informe o CPF"); Funcionario
				  funcionario = FuncionarioService.getByCPF(cpf); AtualizarFuncionario
				  atualizar = new AtualizarFuncionario();
				  
				  if(funcionario != null) {
				  atualizar.preecherCampos(funcionario); atualizar.setVisible(true);
				  } else {
					  JOptionPane.showMessageDialog(null, "CPF não encotrado");
				  }
			}
		});
		btnSair_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnSair_1.setBorder(UIManager.getBorder("CheckBox.border"));
		btnSair_1.setBackground(new Color(127, 255, 212));
		btnSair_1.setBounds(397, 201, 169, 40);
		contentPane.add(btnSair_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\00787809\\Downloads\\FUNDO ZOOM.JPG"));
		lblNewLabel.setBounds(0, 0, 589, 397);
		contentPane.add(lblNewLabel);
	}
}
