package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Menu;

public class Main {
	public static void main(String[] args) throws Exception {
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

		
		Menu menu = new Menu();
		int option = 0;
		try(Scanner input = new Scanner(System.in)){
			do {
				menu.showMenu();
				try {
					option = input.nextInt();
				}catch(InputMismatchException e) {
					throw new InputMismatchException("Entrada deve ser apenas números.");
				}
			} while (option < 1 || option > 6);
		}
		
	}


}
