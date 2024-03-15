package application;

import java.util.Locale;
import java.util.Scanner;

import entitis.CalculatorCircle;

public class CirculoOOP {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o Raio do Circulo: ");
		double raio = sc.nextDouble();
		
		double c = CalculatorCircle.circumferencia(raio);
		
		double v = CalculatorCircle.volume(raio);
		
		System.out.printf("Circumferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor de PI: %.2f%n", CalculatorCircle.PI);
		
		
		
		
		sc.close();

	}

}
