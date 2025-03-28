package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio010 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Codigo -------- Especificação  -------- Preço");
        System.out.println("  1 ---------- Cachorro quente --------- R$4.00");
        System.out.println("  2 ----------    X-Salada     --------- R$4.50");
        System.out.println("  3 ----------    X-Bacon      --------- R$5.00");
        System.out.println("  4 ---------- Torrada Simples --------- R$2.00");
        System.out.println("  5 ---------- Refrigerante ------------ R$1.50");

        System.out.print("Faça o seu pedido de acordo com o código: ");
        int opcao = sc.nextInt();

        System.out.print("Quantidade: ");
        int quantidade = sc.nextInt();

        double preco = 0;
        String produto = "";

        switch (opcao) {
            case 1:
                preco = quantidade * 4.00;
                produto = "Cachorro Quente";
                break;
            case 2:
                preco = quantidade * 4.50;
                produto = "X-Salada";
                break;
            case 3:
                preco = quantidade * 5.00;
                produto = "X-Bacon";
                break;
            case 4:
                preco = quantidade * 2.00;
                produto = "Torrada Simples";
                break;
            case 5:
                preco = quantidade * 1.50;
                produto = "Refrigerante";
                break;
            default:
                System.out.println("Opção inválida.");
                sc.close();
                return; // Sai do programa se a opção for inválida
        }

        System.out.printf("Você comprou %d %s%nO valor total: R$%.2f%n", quantidade, produto, preco);

        sc.close(); // Fechar o Scanner
    }
}
