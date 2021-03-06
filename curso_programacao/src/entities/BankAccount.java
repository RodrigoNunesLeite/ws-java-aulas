package entities;

public class BankAccount {
	private int numberAccount;
	private String name;
	private double balance;
	
	public BankAccount(int numberAccount, String name) {
		this.numberAccount = numberAccount;
		this.name = name;
	}
	
	public BankAccount(int numberAccount, String name, double balance) {
		this.numberAccount = numberAccount;
		this.name = name;
		// this.balance = balance;
		deposit(balance);
	}
	
	public long getNumberAccount() {
		return numberAccount;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double valueDeposit) {
		balance += valueDeposit;
	}
	
	public void withdraw(double withdrawalAmount) {
		balance -= withdrawalAmount + 5.00; 
	}
	
	public String toString() {
		return  numberAccount
				+ ", Holder: "
				+ name
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
}
