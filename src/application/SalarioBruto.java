package application;

import java.util.Locale;
import java.util.Scanner;

import entitis.Employee;

public class SalarioBruto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee salario = new Employee ();
		
		System.out.println("Nome: ");
		salario.name = sc.nextLine();
		System.out.println("Salario Bruto: ");
		salario.salarioBruto = sc.nextDouble();
		System.out.println("Imposto: ");
		salario.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("funcionario (a): " + salario);
		
		System.out.println();
		System.out.println("qual porcentagem gostaria de acresentar ao seu salario?");
		double porcentagem = sc.nextDouble();
		salario.aumentoDeSalario(porcentagem);
		
		System.out.println();
		System.out.println("Atualização; " + salario);
		
		
		sc.close();

	}

}
