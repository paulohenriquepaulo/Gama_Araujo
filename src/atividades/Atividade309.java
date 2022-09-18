package atividades;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Atividade309 {
	// Classe Pessoa

	private String nome;
	private double altura;
	private LocalDate dataNascimento;

	public  void calcularIdade(LocalDate dataNascimento) {
		Calendar cal = GregorianCalendar.getInstance();
		int diaAtual = cal.get(Calendar.DAY_OF_MONTH);
		int mesAtual = cal.get(Calendar.MONTH) + 1;
		int anoAtual = cal.get(Calendar.YEAR);

		String nascimento = dataNascimento.toString();

		int anosNasc = Integer.parseInt(nascimento.substring(0, 4));
		System.out.println(anosNasc);
		int mesNasc = Integer.parseInt(nascimento.substring(5, 7));
		System.out.println(mesNasc);
		int diasNasc = Integer.parseInt(nascimento.substring(8, 10));
		System.out.println(diasNasc);
		if ((diasNasc <= 0) && (diasNasc > 31)) {
			System.out.println("Dia Invalido");
		} else {
			System.out.println("Mes em que você nasceu: ");

			if ((mesNasc <= 0) && (mesNasc > 12)) {
				System.out.println("Mes invalido");
			} else {
				System.out.println("Ano em que você nasceu: ");
				if ((anosNasc <= 0) && (anosNasc > anoAtual)) {
					System.out.println("Ano Invalido");
				} else {
					int Nasc = anosNasc * 365;
					Nasc = Nasc + (mesNasc * 31);
					Nasc = Nasc + diasNasc;
					int Atual = anoAtual * 365;
					Atual = Atual + (mesAtual * 31);
					Atual = Atual + diaAtual;

					System.out.println("Você tem " + (Atual - Nasc) + " dias ou " + ((Atual - Nasc) / 31) + " meses ou "
							+ ((Atual - Nasc) / 365) + " anos.");

				}
			}
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "Atividade309 [nome=" + nome + ", altura=" + altura + ", dataNascimento=" + dataNascimento + "]";
	}

}
