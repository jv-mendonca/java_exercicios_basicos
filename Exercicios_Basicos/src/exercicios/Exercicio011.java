package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio011 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int contador = 0;
		
		System.out.print("Digite um numero para ver a sua tabuada: ");
		int numeroUsuario = sc.nextInt();
		
		while(contador <= 10) {
			int resultado = numeroUsuario * contador;
			System.out.printf("%d X %d = %d%n",numeroUsuario, contador, resultado);
			contador ++;
			
		}
		
		sc.close();
		
		

	}

}
