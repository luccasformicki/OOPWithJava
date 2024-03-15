package application;

import java.util.Locale;
import java.util.Scanner;

import entitis.Aluno;

public class NotaDoAluno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno ();
		
		System.out.println("Calculador de média escolar");
		System.out.println("Nome: ");
		aluno.name = sc.nextLine();
		System.out.println("nota do primeiro trimestre: ");
		aluno.nota1 = sc.nextDouble();
		System.out.println("Nota do segundo trimestre: ");
		aluno.nota2 = sc.nextDouble();
		System.out.println("Nota do terceiro trimestre: ");
		aluno.nota3 = sc.nextDouble();
		
		if (aluno.calculaNota() < 60) {
			System.out.printf("Nota Global: %.2f%n", aluno.calculaNota());
			System.out.println("FAILED");
			System.out.printf("Você precisa de %.2f ponto (s) %n", aluno.notaGlobal());
		} else {
			System.out.printf("Nota Global: %.2f%n", aluno.calculaNota());
			System.out.println("PASS");
		}
		
		sc.close();

	}

}
