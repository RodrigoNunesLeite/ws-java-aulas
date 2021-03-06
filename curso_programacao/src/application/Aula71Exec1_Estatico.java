package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Aula71Exec1_Estatico {

	public static void main(String[] args) {
		/*
		 * Essa aplica��o tem o intuito de praticar a aplica��o de met�dos est�ticos
		 * Fa�a um programa para ler a cota��o do d�lar, e depois um valor em d�lares a
		 * ser comprado por uma pessoa em reais. Informar quantos reais a pessoa vai
		 * pagar pelos d�lares, considerando ainda que a pessoa ter� que pagar 6% de IOF
		 * sobre o valor em d�lar. Criar uma classe CurrencyConverter para ser
		 * respons�vel pelos c�lculos.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double price = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double quantity = sc.nextDouble();
		System.out.printf("Amount to be paid in reais = %.2f",CurrencyConverter.dollarConversion(price, quantity));
		
		sc.close();
		
	}

}
