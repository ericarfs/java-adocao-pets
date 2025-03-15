package entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Menu {
	private List<String> options = new ArrayList<>();
	
	public Menu() {
		String [] options = {"Cadastrar um novo pet",
				"Alterar os dados do pet cadastrado",
				"Deletar um pet cadastrado",
				"Listar todos os pets cadastrados",
				"Listar pets por algum critério (idade, nome, raça)",
				"Sair"};
		this.options = Arrays.asList(options);
	}

	public List<String> getOptions() {
		return options;
	}

	public void setOptions(List<String> options) {
		this.options = options;
	}
	
	public void showMenu() {
		int index = 1;
		for(String option : options) {
			System.out.println(index + " - "+option);
			index++;
		}
	}
	
	

}
