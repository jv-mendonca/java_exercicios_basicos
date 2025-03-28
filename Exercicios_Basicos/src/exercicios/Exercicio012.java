package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio012 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int anoAtual = 2025;
		
		System.out.print("Ano de Nascimento");
		int anoNascimento = sc.nextInt();
		
		int idade = anoAtual - anoNascimento;
		System.out.printf("Quem nasceu em %d tem %d%n",anoNascimento, idade);
		
		if (idade > 18) {
			System.out.printf("Voce ja deveria ter se alistado há %d anos%n", idade - 18);
			System.out.printf("Seu alistamento foi em %d",anoAtual - (idade - 18));
		}
		else if (idade < 18) {
			System.out.printf("Ainda falta %d anos para o alistamento!", 18 - idade);
			System.out.printf("Seu alistamente sera em %d",anoAtual + (18 - idade));
			
		}
		else {
			System.out.println("Voce tem que se alistar Imediatamente");
		}
		sc.close();
	}

}
