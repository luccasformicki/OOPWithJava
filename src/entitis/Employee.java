package entitis;

public class Employee {

	public String name;
	public double salarioBruto;
	public double tax;
	
	
	public double salarioLiquido () {
		return salarioBruto - tax;
	}
	
	public void aumentoDeSalario (double porcentagem) {
		
		   salarioBruto += salarioBruto * porcentagem / 100;
		
	}
	public String toString() {
		return name + ", $ " + String.format("%.2f", salarioLiquido());
	}
}
