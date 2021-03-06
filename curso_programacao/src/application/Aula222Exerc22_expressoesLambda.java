package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee222;

public class Aula222Exerc22_expressoesLambda {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler os dados (nome, email e sal�rio) de funcion�rios a
		 * partir de um arquivo em formato .csv. Em seguida mostrar, em ordem
		 * alfab�tica, o email dos funcion�rios cujo sal�rio seja superior a um dado
		 * valor fornecido pelo usu�rio. Mostrar tamb�m a soma dos sal�rios dos
		 * funcion�rios cujo nome come�a com a letra 'M'.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter full file path: ");
		String path = sc.next();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			List<Employee222> list = new ArrayList<>();
			
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				list.add(new Employee222(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			
			System.out.print("Enter salary: ");
			Double salary = sc.nextDouble();
			System.out.printf("Email of people whose salary is more than %.2f: \n", salary );
			
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List<String> emails = list.stream()
					.filter(emp -> emp.getSalary() > salary)
					.map(emp -> emp.getEmail()).sorted(comp)
					.collect(Collectors.toList());
			
			emails.forEach(System.out::println);
			
			double sum = list.stream()
					.filter(emp -> emp.getName().charAt(0) == 'M')
					.map(emp -> emp.getSalary())
					.reduce(0.0, (x,y) -> x + y);
			
			System.out.printf("Sum of salary of people whose name starts with 'M': %.2f", sum);
			
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();

	}

}
