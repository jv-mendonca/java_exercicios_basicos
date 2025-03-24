package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite um numero: ");
		int numero = sc.nextInt();
		
		if(numero >= 0) {
			System.out.printf("O numero %d e Positivo",numero);
		}
		else {
			System.out.printf("O numero %d e Negativo",numero);
		}
		
		
		
		sc.close();
	}

}
