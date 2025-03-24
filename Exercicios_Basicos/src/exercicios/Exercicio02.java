package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double valorPi = 3.14159;
		
		System.out.print("Informe o valor do Raio: ");
		double raioCirculo = sc.nextDouble();
		
		double areaCirculo = valorPi * (raioCirculo * raioCirculo);
		
		System.out.printf("Valor da Area: %.4f",areaCirculo);
		
		
		sc.close();
		
		

	}

}
