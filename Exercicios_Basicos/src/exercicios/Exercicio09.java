package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Digite o Primeiro Numero: ");
		int valorA = sc.nextInt();
		
		
		System.out.println("Digite o Segundo Numero:");
		int valorB = sc.nextInt();
		
		
		if(valorA % valorB == 0 || valorB % valorA == 0) {
			System.out.println("O numero Sao multiplos");
		}
		else {
			System.out.println("O numero Nao sao multiplos");
		}
		
		

	}

}
