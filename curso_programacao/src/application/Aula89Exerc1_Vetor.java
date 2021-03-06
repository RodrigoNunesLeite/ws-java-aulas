package application;

import java.util.Scanner;

import entities.Rent;

public class Aula89Exerc1_Vetor {

	public static void main(String[] args) {
		/*
		 * A dona de um pensionato possui dez quartos para alugar para estudantes, sendo
		 * esses quartos identificados pelos n�meros 0 a 9.
		 * 
		 * Fazer um programa que inicie com todos os dez quartos vazios, e depois leia
		 * uma quantidade N representando o n�mero de estudantes que v�o alugar quartos
		 * (N pode ser de 1 a 10). Em seguida, registre o aluguel dos N estudantes. Para
		 * cada registro de aluguel, informar o nome e email do estudante, bem como qual
		 * dos quartos ele escolheu (de 0 a 9). Suponha que seja escolhido um quarto
		 * vago. Ao final, seu programa deve imprimir um relat�rio de todas ocupa��es do
		 * pensionato, por ordem de quarto, conforme exemplo.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String name, email;
		int roomNumber;
		
		// Iniciando o vetor de quartos
		Rent[] rentVect = new Rent[9];
		
		// Informando o n�mero de quartos
		System.out.print("How many rooms will be rented? ");
		int nrooms = sc.nextInt();
		System.out.println();
		
		
		for(int i = 1; i <= nrooms; i ++) {
			System.out.println("Rent #" + i);
			System.out.print("Name: ");
			name = sc.next();
			System.out.print("Email: ");
			email = sc.next();
			System.out.print("Room: ");
			roomNumber = sc.nextInt(); 
			
			System.out.println();
			
			rentVect[roomNumber] = new Rent(roomNumber, name, email);
		}
		
		System.out.println("Busy rooms:");
		
		for(int i = 0; i < rentVect.length; i ++) {
			if (rentVect[i] != null) {
				System.out.println(rentVect[i]);
			}
		}
		
		sc.close();
	}

}
