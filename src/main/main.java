package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class main {

	public main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new FileReader("formulario.txt"))){	
			String line = reader.readLine();
			while (line != null) {
				System.out.println(line);
				line = reader.readLine();
			}
			} catch (IOException e) {
				System.out.println("An error occurred.");
				e.printStackTrace();
		}

	}

}
