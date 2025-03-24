package exercicios;

import java.awt.geom.Area;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Valor de A: ");
		double valorA = sc.nextDouble();
		
		System.out.print("Valor de B: ");
		double valorB = sc.nextDouble();
		
		System.out.print("Valor de C: ");
		double valorC = sc.nextDouble();
		
		
		double areaTrianguloRetangulo = valorA * valorC / 2.0;
		double areaCirculo = 3.14159 * valorC * valorC;
		double areaTrapezio =(valorA + valorB) / 2.0 * valorC;
		double areaQuadrado = valorB * valorB;	
		double areaRetangulo = valorA * valorB;
		
		
		System.out.printf("Area Triangulo %.2f%n",areaTrianguloRetangulo);
		System.out.printf("Area Circulo %.2f%n",areaCirculo);
		System.out.printf("Area Trapezio %.2f%n",areaTrapezio);
		System.out.printf("Area Quadrado %.2f%n",areaQuadrado);
		System.out.printf("Area Retangulo %.2f%n",areaRetangulo);
		
		
		sc.close();
		

	}

}
