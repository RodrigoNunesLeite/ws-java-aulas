package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account141;
import entities.exceptions.DomainException;

public class Aula141Exerc1_exception {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler os dados de uma conta banc�ria e depois realizar
		 * um saque nesta conta banc�ria, mostrando o novo saldo. Um saque n�o pode
		 * ocorrer ou se n�o houver saldo na conta, ou se o valor do saque for superior
		 * ao limite de saque da conta.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			String holder = sc.next();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			
			Account141 account = new Account141(number, holder, balance, withdrawLimit);
			
			System.out.println();
			
			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
			account.withdraw(amount);
			System.out.println("New balance: " + account.getBalance());
		} 
		catch(DomainException e) {
			System.out.println(e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Unexpected error");
		}
		sc.close();

	}

}
