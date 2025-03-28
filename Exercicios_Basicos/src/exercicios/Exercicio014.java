package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio014 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro Valor: ");
        int primeiroValor = sc.nextInt();

        System.out.print("Segundo Valor: ");
        int segundoValor = sc.nextInt();

        System.out.printf("[ 1 ] Somar  %n[ 2 ] Multiplicar %n[ 3 ] Maior %n[ 4 ] Novos Numeros %n[ 5 ] Sair%n");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                int soma = primeiroValor + segundoValor;
                System.out.printf("A soma entre %d e %d é %d%n", primeiroValor, segundoValor, soma);
                break;

            case 2:
                int multiplicacao = primeiroValor * segundoValor;
                System.out.printf("A multiplicação entre %d e %d é %d%n", primeiroValor, segundoValor, multiplicacao);
                break;

            case 3:
                if ((primeiroValor > segundoValor) || (segundoValor > primeiroValor)) {
                    int maior = (primeiroValor > segundoValor) ? primeiroValor : segundoValor;
                    System.out.printf("O maior número é %d%n", maior);
                } else {
                    System.out.println("Os números são iguais.");
                }
                break;

            case 4:
                System.out.print("Primeiro Número: ");
                primeiroValor = sc.nextInt();

                System.out.print("Segundo Número: ");
                segundoValor = sc.nextInt();
                break;

            case 5:
                System.out.println("Saindo do programa...");
                break;

            default:
                System.out.println("Opção inválida! Escolha uma opção entre 1 e 5.");
        }

        sc.close();
    }
}
