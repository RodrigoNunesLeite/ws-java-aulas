package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product127;
import entities.UsedProduct;

public class Aula127Exerc1_HerancaPolimorfismo {

	public static void main(String[] args) throws ParseException {
		/*
		 * Fazer um programa para ler os dados de N produtos (N fornecido pelo usu�rio).
		 * Ao final, mostrar a etiqueta de pre�o de cada produto na mesma ordem em que
		 * foram digitados. 
		 * Todo produto possui nome e pre�o. Produtos importados
		 * possuem uma taxa de alf�ndega, e produtos usados possuem data de fabrica��o.
		 * Estes dados espec�ficos devem ser acrescentados na etiqueta de pre�o conforme
		 * exemplo (pr�xima p�gina). Para produtos importados, a taxa e alf�ndega deve
		 * ser acrescentada ao pre�o final do produto.
		 * 
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product127> listProduct = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int quantity = sc.nextInt();
		
		for (int i = 1; i <= quantity; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char type = sc.next().charAt(0);
			
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if( type == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				
				listProduct.add(new ImportedProduct(name, price, customsFee));
			} else if(type == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());
				
				listProduct.add(new UsedProduct(name, price, manufactureDate));
			} else {
				listProduct.add(new Product127(name, price));	
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		
		for(Product127 products: listProduct) {
			System.out.println(products.priceTag());
		}
		
		sc.close();
	}

}
