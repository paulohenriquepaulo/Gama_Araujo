package atividades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AtividadeMain309 {
	
	public static void main(String[] args) {
		
		Atividade309 tela = new Atividade309();
		
		String data = "10/01/1998";
		LocalDate dataConvertida = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		tela.calcularIdade(dataConvertida);
	}

}
