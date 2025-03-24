package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Numero de Registro do funcionario: ");
		int numeroFuncionario = sc.nextInt();
		
		System.out.print("Total de horas trabalhadas: ");
		int horasTotais = sc.nextInt();
		
		System.out.print("Informe o valor por hora: ");
		double valorHora = sc.nextDouble();
		
		
		double salarioFuncionario = horasTotais * valorHora;
		
		System.out.printf("O funcionario %d tem o salario de R$%.2f",numeroFuncionario, salarioFuncionario);
		
		
		sc.close();
	}

}
