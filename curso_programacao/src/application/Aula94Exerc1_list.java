package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee94;

public class Aula94Exerc1_list {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um n�mero inteiro N e depois os dados (id, nome e
		 * salario) de N funcion�rios. N�o deve haver repeti��o de id.
		 * 
		 * Em seguida, efetuar o aumento de X por cento no sal�rio de um determinado
		 * funcion�rio. Para isso, o programa deve ler um id e o valor X. Se o id
		 * informado n�o existir, mostrar uma mensagem e abortar a opera��o. Ao final,
		 * mostrar a listagem atualizada dos funcion�rios, conforme exemplos.
		 * 
		 * Lembre-se de aplicar a t�cnica de encapsulamento para n�o permitir que o
		 * sal�rio possa ser mudado livremente. Um sal�rio s� pode ser aumentado com
		 * base em uma opera��o de aumento por porcentagem dada.
		 */
		 
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		List<Employee94> listEmployee = new ArrayList<>();
		Integer id;
		String name;
		Double salary, percentage;
		
		
		System.out.print("How many employees will be registered? ");
		int numberEmployee = sc.nextInt();
		System.out.println();
		
		// Alimentando a lista
		for (int i = 1; i <= numberEmployee; i++) {
			
			System.out.println("Employee #" + i + ":");
			System.out.print("Id:");
			id = sc.nextInt();
			while (hasId(listEmployee, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			System.out.print("Name:");
			name = sc.next();
			System.out.print("Salary:");
			salary = sc.nextDouble();
			System.out.println();
			
			listEmployee.add(new Employee94(id, name, salary));
		}
		
		System.out.print("Enter the employee id that will have salary increase : ");
		int id2 = sc.nextInt();
		
		Employee94 emp = listEmployee.stream().filter(x -> x.getId() == id2).findFirst().orElse(null);
		
		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for(Employee94 obj: listEmployee) {
			System.out.println(obj);
		}
		
		sc.close();

	}
	
	public static boolean hasId(List<Employee94> listEmployee, int id) {
		Employee94 emp = listEmployee.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
