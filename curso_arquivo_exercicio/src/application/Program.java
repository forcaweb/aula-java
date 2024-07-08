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
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();
		System.out.println("Enter a diretory: ");
		String path = sc.nextLine();
		
		File file = new File(path);
		String fileStr = file.getParent();
		boolean success = new File(fileStr + "/out").mkdir();
		
		String targetFile = fileStr + "/out/out.csv";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String lines = br.readLine();
			
			while (lines != null) {
				String[]  fields = lines.split(",");
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);
				list.add(new Product(name, price, quantity));
				lines = br.readLine();
			}
			
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile))){
				for(Product item : list) {
					bw.write(item.getName() + "," + item.total());
					bw.newLine();
				}
			}
			catch(IOException e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}

}
