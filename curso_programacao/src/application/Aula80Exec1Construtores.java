package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class Aula80Exec1Construtores {

	public static void main(String[] args) {
		/*
		 * Em um banco, para se cadastrar uma conta banc�ria, � necess�rio informar o
		 * n�mero da conta, o nome do titular da conta, e o valor de dep�sito inicial
		 * que o titular depositou ao abrir a conta. Este valor de dep�sito inicial,
		 * entretanto, � opcional, ou seja: se o titular n�o tiver dinheiro a depositar
		 * no momento de abrir sua conta, o dep�sito inicial n�o ser� feito e o saldo
		 * inicial da conta ser�, naturalmente, zero. Importante: uma vez que uma conta
		 * banc�ria foi aberta, o n�mero da conta nunca poder� ser alterado. J� o nome
		 * do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasi�o
		 * de casamento, por exemplo). Por fim, o saldo da conta n�o pode ser alterado
		 * livremente. � preciso haver um mecanismo para proteger isso. O saldo s�
		 * aumenta por meio de dep�sitos, e s� diminui por meio de saques. Para cada
		 * saque realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar
		 * com saldo negativo se o saldo n�o for suficiente para realizar o saque e/ou
		 * pagar a taxa. Voc� deve fazer um programa que realize o cadastro de uma
		 * conta, dando op��o para que seja ou n�o informado o valor de dep�sito
		 * inicial. Em seguida, realizar um dep�sito e depois um saque, sempre mostrando
		 * os dados da conta ap�s cada opera��o.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numberAccount;
		String name;
		double balance; 
		char res;
		BankAccount  bankAccount;
		
		System.out.print("Enter account number: ");
		numberAccount = sc.nextInt();
		System.out.print("Enter account holder: ");
		name = sc.next();
		System.out.print("Is there na initial deposit (y/n)? ");
		res = sc.next().charAt(0);
		
		if (res == 'y' ) {
			System.out.print("Enter initial deposit value: ");
			balance = sc.nextDouble();
			System.out.println();
			
			  bankAccount= new BankAccount(numberAccount, name, balance);
		} else {
			  bankAccount = new BankAccount(numberAccount, name);
		}
		
		System.out.println("Account data:");
		
		// O print do bankAccount retorna o toString() da classe
		System.out.println("Account: " + bankAccount);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		balance = sc.nextDouble();
		bankAccount.deposit(balance);
		System.out.println("Updated account data:");
		// O print do bankAccount retorna o toString() da classe
		System.out.println("Account: " + bankAccount);
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		balance = sc.nextDouble();
		bankAccount.withdraw(balance);
		System.out.println("Updated account data:");
		// O print do bankAccount retorna o toString() da classe
		System.out.println("Account: " + bankAccount);
		
		sc.close();

	}

}
