package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite o Primeiro Numero: ");
		int primeiroNumero = sc.nextInt();
		
		System.out.print("Digite o Segundo Numero:");
		int segundoNumero = sc.nextInt();
		
		
		int soma = primeiroNumero + segundoNumero;
		
		
		System.out.printf("A soma vale: %d",soma);
		
		sc.close();
	
	}

}
