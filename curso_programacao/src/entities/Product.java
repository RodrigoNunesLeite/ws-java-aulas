package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		// o this faz referencia ao atributo da classe
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	/*
	 * Como minha classe é do tipo Object, eu estou aqui nesse ponto sobrescrevendo
	 * o metódo nativo toString
	 */
	@Override
	public String toString() {
		return name 
				+ ", $ " 
				+ String.format("%.2f", price) 
				+ ", " 
				+ quantity 
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
