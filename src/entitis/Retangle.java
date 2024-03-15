package entitis;

public class Retangle {

	public double largura;
	public double altura;
	
	public double areaDoRetangulo () {
		return largura * altura;
	}
	public double perimetroDoRetangulo () {
		return (2*(largura + altura));
	}
	public double diagonalDoRetangulo () {
		double d;
		
		d = Math.sqrt(Math.pow(altura, 2) + Math.pow(largura, 2));
		return d;
	}
}
