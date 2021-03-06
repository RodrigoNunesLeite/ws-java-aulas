package application;

import java.util.Scanner;

public class Aula97Exerc1_Matrizes {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler dois n�meros inteiros M e N, e depois ler uma
		 * matriz de M linhas por N colunas contendo n�meros inteiros, podendo haver
		 * repeti��es. Em seguida, ler um n�mero inteiro X que pertence � matriz. Para
		 * cada ocorr�ncia de X, mostrar os valores � esquerda, acima, � direita e
		 * abaixo de X, quando houver, conforme exemplo.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Number of Lines: ");
		int m = sc.nextInt();
		System.out.print("Number of Columns: ");
		int n = sc.nextInt();
		System.out.println();
		
		Integer mat[][] = new Integer[m][n];

		// leitura das linhas
		for (int i = 0; i < mat.length; i++) {
			// leitura das colunas
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print("Line: " + i + " Column: " + j);
				System.out.print(" Value: ");
				Integer number = sc.nextInt();
				
				mat[i][j] = number;
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.print("Find number: ");
		Integer number = sc.nextInt();
		System.out.println();
		
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				
				if (mat[i][j] == number) {	
					System.out.println("Position: " + i + ", " + j);
					
					if (j != 0) {
						if (mat[i][j - 1] != null) {
							System.out.println("Left: " + mat[i][j - 1]);
						}
					}
					/*
					 * Nas valida��es precisei usar - 1 para comparar, porque o length � 4, 
					 * mas o valor m�ximo que a posi��o ocupa � 3 para coluna e 2 para linha
					 * */
					if(j < (mat[i].length - 1)) { 
						if (mat[i][j + 1] != null) {
							System.out.println("Right: " + mat[i][j + 1]);
						}
					}
					if(i != 0) {
						if (mat[i-1][j] != null) { 
							System.out.println("Top: " + mat[i-1][j]);
						}
					}
					if(i < (mat.length - 1)) {
						if (mat[i+1][j] != null) {
							System.out.println("Down: " + mat[i+1][j]);
						}
					}
				}
			}
		}

		sc.close();

	}

}
