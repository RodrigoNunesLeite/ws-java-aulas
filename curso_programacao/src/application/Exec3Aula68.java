package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Exec3Aula68 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler o nome de um aluno e as tr�s notas que ele obteve
		 * nos tr�s trimestres do ano (primeiro trimestre vale 30 e o segundo e terceiro
		 * valem 35 cada). Ao final, mostrar qual a nota final do aluno no ano. Dizer
		 * tamb�m se o aluno est� aprovado (PASS) ou n�o (FAILED) e, em caso negativo,
		 * quantos pontos faltam para o aluno obter o m�nimo para ser aprovado (que �
		 * 60% da nota). Voc� deve criar uma classe Student para resolver este problema.
		 * 
		 */
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
		 
		 Student student = new Student();
		 
		 System.out.print("Enter the student's name: ");
		 student.name = sc.next();
		 /* Notas do 1�, 2� e 3� trimestre */
		 System.out.print("First quarter note: ");
		 student.note1 = sc.nextDouble();
		 System.out.print("Second quarter note: ");		 
		 student.note2 = sc.nextDouble();
		 System.out.print("Third quarter note: ");
		 student.note3 = sc.nextDouble();
		 System.out.println();
		 System.out.println(student.finalGrade()); 
		 
		 sc.close();
	}

}
