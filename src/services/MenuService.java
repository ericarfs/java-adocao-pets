package services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Pet;

public class MenuService {
	
	public MenuService() {
	}
	
	public void cadastrarPet() throws Exception {
		List<Object> answers = new ArrayList<>();
		try (BufferedReader reader = new BufferedReader(new FileReader("formulario.txt"))){
			Scanner sc = new Scanner(System.in);
			String question;
			while ((question = reader.readLine())!= null) {
				System.out.println(question);
				
				if(question.charAt(0) == '4') {
					System.out.print("Número da casa: ");
					Object ans = sc.nextLine();
					answers.add(ans);
					
					System.out.print("Cidade: ");
					ans = sc.nextLine();
					answers.add(ans);
					
					System.out.print("Rua: ");
					ans = sc.nextLine();
					answers.add(ans);
					
					continue;
				}
				Object ans = sc.nextLine();
				answers.add(ans);
			}
			
			Pet pet = new Pet(answers);
			
			
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}
