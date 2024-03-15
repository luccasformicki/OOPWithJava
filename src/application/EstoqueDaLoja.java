package application;

import java.util.Locale;
import java.util.Scanner;

import entitis.Product;

public class EstoqueDaLoja {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Product produto = new Product();
		System.out.println("Enter product data: ");
		System.out.printf("Name: ");
		produto.name = sc.nextLine();
		System.out.printf("Price: ");
		produto.price = sc.nextDouble();
		System.out.printf("Quantity in stock: ");
		produto.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Product data: " + produto);
		
		System.out.println();
		System.out.println("Entre com uma quantidade de produtos para serem adicionados ao estoque: ");
		int quantity = sc.nextInt();
		produto.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + produto);
		
		System.out.println();
		System.out.println("Digite uma quantia que deseja retirar do estoque: ");
		quantity = sc.nextInt();
		produto.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + produto);
		
		
		
		
		
		
		sc.close();

	}

}
