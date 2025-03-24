package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("valor de A: ");
		int valorA = sc.nextInt();
		
		System.out.print("valor de B: ");
		int valorB= sc.nextInt();
		
		System.out.print("valor de C: ");
		int valorC = sc.nextInt();
		
		System.out.print("valor de D: ");
		int valorD = sc.nextInt();
		
		
		int diferenca = (valorA * valorB - valorC * valorD);
		
		System.out.printf("A diferençao = %d",diferenca);
		
		sc.close();
		

	}

}
