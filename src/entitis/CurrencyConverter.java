package entitis;

public class CurrencyConverter {

	public static final double IOF = 6.0;
	
	public static double calculaDollar (double dollar, double price) {
		return (dollar * price) * IOF / 100 + (dollar * price);
	}
	
}
