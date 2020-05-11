package entities;

public class CurrencyConverter {
	
	public static final double iof = 0.06;
	
	public static double dollarConversion(double price, double quantity) {
		double amount = price * quantity;
		return amount + (amount * iof); 
	}
}
