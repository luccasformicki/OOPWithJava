package entitis;

public class Aluno {

	public String name;
	public double nota1;
	public double nota2;
	public double nota3;

	
	public double calculaNota () {
		
		 return nota1 + nota2 + nota3;
		
	}
	public double notaGlobal () {
		if (calculaNota () < 60) {
			return 60.0 - calculaNota();
		}else {
			return 0.0;
		}
	}
}
