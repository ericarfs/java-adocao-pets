package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Menu;
import entities.Pet;
import services.MenuService;
import services.PetService;

public class Main {
	public static void main(String[] args) throws Exception {
		Menu menu = new Menu();
		MenuService menuService = new MenuService();

		Boolean sair = false;
		while (sair == false) {
			Scanner input = new Scanner(System.in);
			int option;
			menu.showMenu();
			try {
				option = input.nextInt();
			} catch (InputMismatchException e) {
				throw new InputMismatchException("Entrada deve ser apenas números.");
			}
			switch (option) {
			case 1:
				menuService.cadastrarPet();
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				sair = true;
				input.close();
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
		}

	}
}
