package atividades;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Atividade306 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("00.00");
		Random random = new Random();
		int gradeFuncionarios = 0;
		int contador = 1;
		double valorSalario = 0.0;
		double mediaSalario = 0.0;
		double totalSalario = 0.0;
		
		System.out.print("Informe a quantidade de funcionario: " );
		gradeFuncionarios = entrada.nextInt();
		
		while (contador < gradeFuncionarios) {
			valorSalario = random.nextDouble(5000);
			System.out.println("Funcionario " + contador + " Salario: " + format.format(valorSalario));
			totalSalario += valorSalario;
			contador++;
			
		}
		
		mediaSalario = totalSalario / gradeFuncionarios;
		System.out.println("A media de salario da empresa é: " + format.format(mediaSalario));
		entrada.close();
	}

}
