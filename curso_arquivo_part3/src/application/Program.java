package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		String [] lines = new String[] {"Diego", "Thais", "Nicole", "Thomas"};
		String path = "C:\\Users\\Dihh\\OneDrive\\Área de Trabalho\\Projetos\\Projetos Javas\\in.txt";
		
		// adicione true para adicionar o texto e não recriar new FileWriter(path,true)
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))) {
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
