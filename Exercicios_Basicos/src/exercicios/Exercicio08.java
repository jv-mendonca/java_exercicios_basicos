package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite um numero: ");
		int numero = sc.nextInt();
		
		
		String resultado = (numero % 2 == 0) ? "Par" : "Impar"; 
		
		System.out.printf("O numero %d e %s",numero, resultado);
		
		sc.close();
	}

}
