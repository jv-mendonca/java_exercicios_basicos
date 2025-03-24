package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		
		System.out.print("Informe o codigo da Primeira Peça: ");
		int codPeça1 = sc.nextInt();
		
		System.out.print("Quantidade: ");
		int quantidade1 = sc.nextInt();
		
		System.out.print("Valor Unitario: ");
		double valorUnitario1 = sc.nextDouble();
		
		
		System.out.print("Informe o codigo da Segunda Peça: ");
		int codPeça2 = sc.nextInt();
		
		System.out.print("Quantidade: ");
		int quantidade2 = sc.nextInt();
		
		System.out.print("Valor Unitario: ");
		double valorUnitario2 = sc.nextDouble();
		
		double preçoTotal = (quantidade1 * valorUnitario1) + (quantidade2 * valorUnitario2);
		
		System.out.printf("Valor a Pagar; R$%2.f" , preçoTotal );
		
		sc.close();
		
	}

}
