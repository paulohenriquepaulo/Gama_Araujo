package sistemaNotas;
import javax.swing.JOptionPane;

public class ProcessarMedia {

	public static String[] calcularMedia(String n1, String n2, String n3, String nome) {
		String[] condicaoMedia = new String[2];
		try {
			validarNome(nome);
			double nota1 = Double.parseDouble(n1);
			double nota2 = Double.parseDouble(n2);
			double media = (nota1 + nota2) / 2;
			if (media > 5) {
				condicaoMedia[0] = "APROVADO";
			} else if (media >= 4) {
				condicaoMedia[0] = "RECUPERAÇÃO";
			} else {
				condicaoMedia[0] = "REPROVADO";
			}
			condicaoMedia[1] = String.valueOf(media);
			return condicaoMedia;

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Campo nota invalido ou vazio");
		} catch (RuntimeException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());

		}

		return null;
	}

	private static void validarNome(String nome) {
		String[] numeros = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		for (int i = 0; i < numeros.length; i++) {
			if (nome.contains(numeros[i])) {
				throw new RuntimeException("O campo nome é invalido");
			}

		}
		if (nome.equals("")) {
			throw new RuntimeException("O campo nome não pode ser vazio");
		}

	}

}
