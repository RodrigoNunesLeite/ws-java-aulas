import java.util.Locale;

public class Main {
	
	public static void main(String[] args) {
		int y = 32;
		double x = 10.3482;
		double k = 8.121;
		
		System.out.printf("%.2f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", x);
		
		System.out.printf("Teste x %.2f , teste y %.2f", x, k);
	}

}
