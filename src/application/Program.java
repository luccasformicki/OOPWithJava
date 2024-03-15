package application;

import java.util.Locale;
import java.util.Scanner;

import entitis.Triangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Digite as dimenções do triangulo x");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Digite as dimenções do triangulo y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		double teste1 = x.Area();
		showResult(teste1);
		
		double teste2 = y.Area();
		showResult(teste2);
		
		if (teste1 > teste2) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
		
		sc.close();

	}
	
	public static void showResult (double value) {
		System.out.printf("triangulo =  %.4f%n", value);
	}
}
