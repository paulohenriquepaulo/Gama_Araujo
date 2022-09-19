package calculadora;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Calculadora extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel campResultado;
	private JTextField resultado;
	private JButton numDois;
	private JButton numTres;
	private JButton numQuatro;
	private JButton numCinco;
	private JButton numZero;
	private JButton numNove;
	private JButton numOito;
	private JButton numSete;
	private JButton numSeis;
	private JButton btnPonto;
	private JButton btnDivisao;
	private JButton btnMultiplicacao;
	private JButton btnSubtracao;
	private JButton igual;
	private JButton btnLimpar;
	private JButton btnApagar;
	private String operacaoCorrente;
	private JButton btnSoma;
	private String valor1, valor2, ultimoValor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 377);
		campResultado = new JPanel();
		campResultado.setBackground(new Color(152, 251, 152));
		campResultado.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(campResultado);
		campResultado.setLayout(null);

		resultado = new JTextField();
		resultado.setForeground(new Color(248, 248, 255));
		resultado.setFont(new Font("Tahoma", Font.BOLD, 19));
		resultado.setBackground(Color.DARK_GRAY);
		resultado.setBounds(34, 23, 366, 57);
		campResultado.add(resultado);
		resultado.setColumns(10);

		JButton num1 = new JButton("1");
		num1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String valor = resultado.getText() + num1.getText();

				resultado.setText(valor);

			}
		});
		num1.setFont(new Font("Tahoma", Font.BOLD, 12));
		num1.setBounds(76, 101, 48, 45);
		campResultado.add(num1);

		numDois = new JButton("2");
		numDois.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor = resultado.getText() + numDois.getText();
				resultado.setText(valor);
			}
		});
		numDois.setFont(new Font("Tahoma", Font.BOLD, 12));
		numDois.setBounds(133, 101, 48, 45);
		campResultado.add(numDois);

		numTres = new JButton("3");
		numTres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor = resultado.getText() + numTres.getText();
				resultado.setText(valor);
			}
		});
		numTres.setFont(new Font("Tahoma", Font.BOLD, 12));
		numTres.setBounds(191, 101, 48, 45);
		campResultado.add(numTres);

		numQuatro = new JButton("4");
		numQuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor = resultado.getText() + numQuatro.getText();
				resultado.setText(valor);
			}
		});
		numQuatro.setFont(new Font("Tahoma", Font.BOLD, 12));
		numQuatro.setBounds(249, 101, 48, 45);
		campResultado.add(numQuatro);

		numCinco = new JButton("5");
		numCinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor = resultado.getText() + numCinco.getText();
				resultado.setText(valor);
			}
		});
		numCinco.setFont(new Font("Tahoma", Font.BOLD, 12));
		numCinco.setBounds(307, 101, 48, 45);
		campResultado.add(numCinco);

		numZero = new JButton("0");
		numZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor = resultado.getText() + numZero.getText();
				resultado.setText(valor);
			}
		});
		numZero.setFont(new Font("Tahoma", Font.BOLD, 12));
		numZero.setBounds(307, 157, 48, 45);
		campResultado.add(numZero);

		numNove = new JButton("9");
		numNove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor = resultado.getText() + numNove.getText();
				resultado.setText(valor);
			}
		});
		numNove.setFont(new Font("Tahoma", Font.BOLD, 12));
		numNove.setBounds(249, 157, 48, 45);
		campResultado.add(numNove);

		numOito = new JButton("8");
		numOito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor = resultado.getText() + numOito.getText();
				resultado.setText(valor);
			}
		});
		numOito.setFont(new Font("Tahoma", Font.BOLD, 12));
		numOito.setBounds(191, 157, 48, 45);
		campResultado.add(numOito);

		numSete = new JButton("7");
		numSete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor = resultado.getText() + numSete.getText();
				resultado.setText(valor);
			}
		});
		numSete.setFont(new Font("Tahoma", Font.BOLD, 12));
		numSete.setBounds(133, 157, 48, 45);
		campResultado.add(numSete);

		numSeis = new JButton("6");
		numSeis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor = resultado.getText() + numSeis.getText();
				resultado.setText(valor);
			}
		});
		numSeis.setFont(new Font("Tahoma", Font.BOLD, 12));
		numSeis.setBounds(76, 157, 48, 45);
		campResultado.add(numSeis);

		btnPonto = new JButton(".");
		btnPonto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (!resultado.getText().contains(".")) {
					resultado.setText(resultado.getText() + btnPonto.getText());
				}
				if (resultado.getText().equals("")) {
					resultado.setText("0.");
				}

			}
		});
		btnPonto.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPonto.setBounds(307, 212, 48, 45);
		campResultado.add(btnPonto);

		btnDivisao = new JButton("/");
		btnDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = resultado.getText();
				operacaoCorrente = "/";
				resultado.setText("");
			}
		});
		btnDivisao.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnDivisao.setBounds(249, 212, 48, 45);
		campResultado.add(btnDivisao);

		btnMultiplicacao = new JButton("*");
		btnMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = resultado.getText();
				operacaoCorrente = "*";
				resultado.setText("");
			}
		});
		btnMultiplicacao.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnMultiplicacao.setBounds(191, 212, 48, 45);
		campResultado.add(btnMultiplicacao);

		btnSubtracao = new JButton("-");
		btnSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = resultado.getText();
				operacaoCorrente = "-";
				resultado.setText("");
			}
		});
		btnSubtracao.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSubtracao.setBounds(133, 212, 48, 45);
		campResultado.add(btnSubtracao);

		btnSoma = new JButton("+");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = resultado.getText();
				operacaoCorrente = "+";
				resultado.setText("");

			}
		});
		btnSoma.setBounds(76, 213, 48, 44);
		campResultado.add(btnSoma);

		igual = new JButton("=");
		igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor2 = resultado.getText();
				String valor = null;

				if (valor1 != null) {
					ultimoValor = valor2;
					switch (operacaoCorrente) {
					case "/":
						valor = CalculadoraServ.dividir(valor1, valor2);
						break;
					case "*":
						valor = CalculadoraServ.multiplicar(valor1, valor2);
						break;
					case "+":
						valor = CalculadoraServ.somar(valor1, valor2);
						break;
					case "-":
						valor = CalculadoraServ.subtrair(valor1, valor2);
						break;
					}
					valor1 = null;
				} else {
					switch (operacaoCorrente) {
					case "/":
						valor = CalculadoraServ.dividir(valor2, ultimoValor);
						break;
					case "*":
						valor = CalculadoraServ.multiplicar(valor2, ultimoValor);
						break;
					case "+":
						valor = CalculadoraServ.somar(valor2, ultimoValor);
						valor1 = null;
						break;
					case "-":
						valor = CalculadoraServ.subtrair(valor2, ultimoValor);
						break;
					}
				}

				resultado.setText(valor);

			}
		});
		igual.setFont(new Font("Tahoma", Font.BOLD, 12));
		igual.setBounds(191, 268, 164, 45);
		campResultado.add(igual);

		btnLimpar = new JButton("C");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = "0";
				valor2 = "0";
				resultado.setText("");
			}
		});
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLimpar.setBounds(133, 268, 48, 45);
		campResultado.add(btnLimpar);

		btnApagar = new JButton("<");
		btnApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ultimoDigito = resultado.getText().length();
				try {
					resultado.setText((String) resultado.getText().subSequence(0, (ultimoDigito - 1)));
				} catch (StringIndexOutOfBoundsException err) {

				}

			}
		});
		btnApagar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnApagar.setBounds(76, 268, 48, 45);
		campResultado.add(btnApagar);

	}
}
