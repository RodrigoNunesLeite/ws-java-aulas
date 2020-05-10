import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		/* int y = 32;
		double x = 10.3482;
		double k = 8.121;
		
		System.out.printf("%.2f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", x);
		
		System.out.printf("Teste x %.2f , teste y %.2f", x, k);
		*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		
		sc.close();
	}

}
