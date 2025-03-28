package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio013 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual é o seu Peso? (kg): ");
        double peso = sc.nextDouble();

        System.out.print("Qual é a sua altura? (m): ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("O seu IMC é de %.2f%n", imc);

        if (imc < 16) {
            System.out.println("Você está com Magreza Grave.");
        } else if (imc < 17) {
            System.out.println("Você está com Magreza Moderada.");
        } else if (imc < 18.5) {
            System.out.println("Você está com Magreza Leve.");
        } else if (imc < 25) {
            System.out.println("Você está no Peso Normal.");
        } else if (imc < 30) {
            System.out.println("Você está com Sobrepeso.");
        } else if (imc < 35) {
            System.out.println("Você está com Obesidade Grau I.");
        } else if (imc < 40) {
            System.out.println("Você está com Obesidade Grau II (Severa).");
        } else {
            System.out.println("Você está com Obesidade Grau III (Mórbida).");
        }

        sc.close();
    }
}
