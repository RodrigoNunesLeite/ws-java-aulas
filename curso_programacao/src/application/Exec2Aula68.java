package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Exec2Aula68 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler os dados de um funcion�rio (nome, sal�rio bruto e
		 * imposto). Em seguida, mostrar os dados do funcion�rio (nome e sal�rio
		 * l�quido). Em seguida, aumentar o sal�rio do funcion�rio com base em uma
		 * porcentagem dada (somente o sal�rio bruto � afetado pela porcentagem) e
		 * mostrar novamente os dados do funcion�rio. Use a classe projetada abaixo.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		double percentage;
		
		System.out.print("Name:");
		employee.name = sc.nextLine();
		System.out.print("Gross salary:");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax:");
		employee.tax = sc.nextDouble();
		employee.netSalary();
		
		System.out.println();
		
		System.out.println("Employee:" + employee.toString());
		System.out.println();
		
		System.out.print("Which percentage to increase salary? ");
		percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		System.out.println();
		
		System.out.println("Update data: " + employee.toString());
		
		sc.close();
		

	}

}
