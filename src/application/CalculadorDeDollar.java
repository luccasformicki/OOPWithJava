package application;

import java.util.Locale;
import java.util.Scanner;

import entitis.CurrencyConverter;

public class CalculadorDeDollar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Qual o preço do dollar? ");
		double dollar = sc.nextDouble();
		
		System.out.println("Quantos dolares você quer comprar? ");
		double price = sc.nextDouble();
		
		System.out.printf("Você Vai pagar: $ %.2f%n", CurrencyConverter.calculaDollar(dollar, price));
		
		
		
		sc.close();

	}

}
