package application;

import java.util.Locale;
import java.util.Scanner;

import entitis.Retangle;

public class RetanguloOOP {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Retangle retangulo = new Retangle ();
		
		System.out.println("digite a largura e a altura do retangulo");
		retangulo.largura = sc.nextDouble();
		retangulo.altura = sc.nextDouble();
		System.out.printf("Area: %.2f%n",retangulo.areaDoRetangulo());
		System.out.printf("Perimetro: %.2f%n", retangulo.perimetroDoRetangulo());
		System.out.printf("Diagonal: %.2f%n", retangulo.diagonalDoRetangulo());
		
		
		
		sc.close();

	}

}
