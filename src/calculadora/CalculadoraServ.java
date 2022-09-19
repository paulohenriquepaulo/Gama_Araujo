package calculadora;
import javax.swing.JOptionPane;

public class CalculadoraServ {

	// Criando métodos de calculos
	public static String somar(String n1, String n2) {
		
			double resultado = Double.parseDouble(n1) + Double.parseDouble(n2);
			return String.valueOf(resultado);
		
	}

	public static String subtrair(String n1, String n2) {
		double resultado = Double.parseDouble(n1) - Double.parseDouble(n2);
		;
		return String.valueOf(resultado);
	}

	public static String dividir(String n1, String n2) {
		if (Double.parseDouble(n2) <= 0) {
			throw new RuntimeException("O valor não pode ser dividido por zero");
		}

		double resultado = Double.parseDouble(n1) / Double.parseDouble(n2);
		return String.valueOf(resultado);
	}

	public static String multiplicar(String n1, String n2) {
		double resultado = Double.parseDouble(n1) * Double.parseDouble(n2);
		return String.valueOf(resultado);
	}

	public static void validarValor(String v1, String v2) {

		if (v1.equals("")) {
			JOptionPane.showMessageDialog(null, "O campo  1 não pode ser vazio.");
			throw new RuntimeException("O campo 1 não pode ser vazio.");
		} else if (v2.equals("")) {
			JOptionPane.showMessageDialog(null, "O campo 2 não pode ser vazio.");
			throw new RuntimeException("O campo 1 não pode ser vazio.");
		}
	}


}
