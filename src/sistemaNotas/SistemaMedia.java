package sistemaNotas;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.DefaultButtonModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class SistemaMedia extends JFrame {

	private JPanel contentPane;
	private final JLabel lblSistemaDeNotas = new JLabel("Sistema de Notas");
	private JTextField campNome;
	private JTextField campNota1;
	private JTextField campNota2;
	private JTextField campMedia;
	private JTextField campCondicao;
	private JButton btnLimpar;
	private JTable table;
	private DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SistemaMedia frame = new SistemaMedia();
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
	public SistemaMedia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 454);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblSistemaDeNotas.setFont(new Font("Microsoft Himalaya", Font.BOLD, 54));
		lblSistemaDeNotas.setBounds(124, 11, 338, 48);
		contentPane.add(lblSistemaDeNotas);

		JLabel txtNome = new JLabel("Nome:");
		txtNome.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtNome.setBounds(10, 65, 78, 23);
		contentPane.add(txtNome);

		JLabel txtNota1 = new JLabel("Nota 1:");
		txtNota1.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtNota1.setBounds(10, 99, 78, 23);
		contentPane.add(txtNota1);

		JLabel txtNota2 = new JLabel("Nota 2:");
		txtNota2.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtNota2.setBounds(135, 99, 78, 23);
		contentPane.add(txtNota2);

		JLabel txtMedia = new JLabel("Media:");
		txtMedia.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtMedia.setBounds(258, 99, 78, 23);
		contentPane.add(txtMedia);

		JLabel txtCondicao = new JLabel("Condição: ");
		txtCondicao.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtCondicao.setBounds(359, 99, 78, 23);
		contentPane.add(txtCondicao);

		campNome = new JTextField();
		campNome.setBounds(70, 64, 472, 28);
		contentPane.add(campNome);
		campNome.setColumns(10);

		campNota1 = new JTextField();
		campNota1.setColumns(10);
		campNota1.setBounds(70, 98, 60, 28);
		contentPane.add(campNota1);

		campNota2 = new JTextField();
		campNota2.setColumns(10);
		campNota2.setBounds(197, 98, 51, 28);
		contentPane.add(campNota2);

		campMedia = new JTextField();
		campMedia.setEditable(false);
		campMedia.setColumns(10);
		campMedia.setBounds(306, 98, 51, 28);
		contentPane.add(campMedia);

		campCondicao = new JTextField();
		campCondicao.setEditable(false);
		campCondicao.setColumns(10);
		campCondicao.setBounds(430, 98, 112, 28);
		contentPane.add(campCondicao);

		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				campNome.setText("");
				campCondicao.setText("");
				campNota1.setText("");
				campNota2.setText("");
				campMedia.setText("");

			}
		});
		btnLimpar.setBounds(124, 376, 89, 28);
		contentPane.add(btnLimpar);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 137, 532, 230);
		contentPane.add(scrollPane);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int contador = table.getSelectedRow();
				campNome.setText(model.getValueAt(contador, 0).toString());
				campNota1.setText(model.getValueAt(contador, 1).toString());
				campNota2.setText(model.getValueAt(contador, 2).toString());
				campMedia.setText(model.getValueAt(contador, 3).toString());
				campCondicao.setText(model.getValueAt(contador, 4).toString());
			}
		});

		scrollPane.setViewportView(table);
		model = new DefaultTableModel();
		Object[] colunn = { "NOME", "NOTA 1", "NOTA 2", "MEDIA", "CONDIÇÃO" };
		Object[] row = new Object[5];
		model.setColumnIdentifiers(colunn);

		table.setModel(model);

		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aluno aluno = new Aluno(campNome.getText(), campNota1.getText(), campNota2.getText(),
						campMedia.getText());

				try {
					aluno = AlunoService.atualizarAluno(aluno);
				} catch (IOException e1) {

					e1.printStackTrace();
				}

				if (aluno != null) {
					campCondicao.setText(aluno.getCondicao());
					campMedia.setText(aluno.getMedia());

					row[0] = campNome.getText();
					row[1] = campNota1.getText();
					row[2] = campNota2.getText();
					row[3] = campMedia.getText();
					row[4] = campCondicao.getText();
					model.addRow(row);

				} else {

					if (!campNome.getText().equals("")) {
						String[] numeros = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
						for (int i = 0; i < numeros.length; i++) {
							if (campNome.getText().contains(numeros[i])) {
								campNome.requestFocus();
								campNome.setText("");
								break;
							}
						}
					}
					if (!campNome.getText().equals("")) {
						campNota1.requestFocus();
						campNota1.setText("");
						campNota2.setText("");
					}
				}

			}
		});
		btnAtualizar.setBounds(10, 376, 89, 28);
		contentPane.add(btnAtualizar);

	}
}
