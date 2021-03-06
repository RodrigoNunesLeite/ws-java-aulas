package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product183;

public class Aula183Exerc1_Arquivos {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler o caminho de um arquivo .csv contendo os dados de
		 * itens vendidos. Cada item possui um nome, pre�o unit�rio e quantidade,
		 * separados por v�rgula. Voc� deve gerar um novo arquivo chamado "summary.csv",
		 * localizado em uma subpasta chamada "out" a partir da pasta original do
		 * arquivo de origem, contendo apenas o nome e o valor total para aquele item
		 * (pre�o unit�rio multiplicado pela quantidade)
		 */
		Locale.setDefault(Locale.US);
		String path = "C:\\Users\\Rodrigo\\Documents\\GitHub\\ws-java-aulas\\curso_programacao\\";
		List<Product183> listItems = new ArrayList<>();
		String[] vectFields = new String[3];
		
		// criando a nova pasta
		boolean success = new File(path + "\\out").mkdir();
		
		
		try(BufferedReader br = new BufferedReader(new FileReader(path + "items.csv"))) {
			String line = br.readLine();
			
			while(line != null) {
				vectFields = line.split(";");
				
				String name = vectFields[0];
				double unitPrice = Double.parseDouble(vectFields[1]);
				int quantity = Integer.parseInt(vectFields[2]);
				
				Product183 item = new Product183(name, unitPrice, quantity);
				listItems.add(item);
				line = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println("Error:" + e.getMessage());
		}
		
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path + "\\out\\summary.csv"))){
			for(Product183 product: listItems) {
				bw.write(product.getName() + ";" + String.format("%.2f",product.totalValue()));
				bw.newLine();
			}
			
			System.out.println(" CREATED!");
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		
	}

}
