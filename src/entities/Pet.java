package entities;

import java.util.Arrays;
import java.util.List;

public class Pet {
	private String nome;
	private String sobrenome;
	private Tipo tipo;
	private Sexo sexo;
	private String rua;
	private String numero;
	private String cidade;
	private String idade;
	private String peso;
	private String raca;
	
	private final String naoInformado = "NÃO INFORMADO";
	
	public Pet() {		
	}

	
	
	public Pet(String nome, String sobrenome, Tipo tipo, Sexo sexo, String rua, String numero, String cidade,
			String idade, String peso, String raca) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.tipo = tipo;
		this.sexo = sexo;
		this.rua = rua;
		this.numero = numero;
		this.cidade = cidade;
		this.idade = idade;
		this.peso = peso;
		this.raca = raca;
	}



	public Pet(List<Object> obj) throws Exception {
		String nomecompleto = (String) obj.get(0);
		String[] nomes = nomecompleto.split(" ");
		String nome = nomes[0];
		String sobrenome = String.join(" ", Arrays.copyOfRange(nomes, 1, nomes.length));
		System.out.println(nomecompleto);
		System.out.println(nome);
		System.out.println(sobrenome);

		this.setNome(nome);
		this.setSobrenome(sobrenome);
		this.setTipo((String) obj.get(1));
		this.setSexo((String) obj.get(2));
		this.setNumero((String) obj.get(3));
		this.setCidade((String) obj.get(4));
		this.setRua((String) obj.get(5));
		this.setIdade((String) obj.get(6));
		this.setPeso((String) obj.get(7));
		this.setRaca((String) obj.get(8));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws Exception {
		if (nome == null || nome.isBlank()) 
			throw new Exception("Nome não pode ser vazio.");
		
		if (nome.chars().allMatch(Character::isLetter))
			this.nome = nome;
		else
			throw new Exception("Nome não pode conter caracteres especiais.");
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) throws Exception {
		if (sobrenome == null || sobrenome.isBlank()) 
			throw new Exception("Sobrenome não pode ser vazio.");
		
		if (sobrenome.chars().allMatch(c -> Character.isLetter(c) || c == ' '))
			this.sobrenome = sobrenome;
		else
			throw new Exception("Sobrenome não pode conter caracteres especiais.");
	}

	public String getTipo() {
		return tipo.getTipo();
	}

	public void setTipo(String tipo) {
		if(tipo != null && !tipo.isBlank())
			this.tipo = Tipo.valueOf(tipo.toUpperCase());
	}

	public String getSexo() {
		return sexo.getSexo();
	}

	public void setSexo(String sexo) {
		if(sexo != null && !sexo.isBlank())
			this.sexo = Sexo.valueOf(sexo.toUpperCase());
	}
	
	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		if ( numero == null || numero.isBlank())
			this.numero = naoInformado;
		else 
			this.numero = numero;
		
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) throws Exception {
		if ( idade == null || idade.isBlank())
			this.idade = naoInformado;
		else {
			idade = idade.replace(",", ".");
			try {
				Double idadeVal = Double.parseDouble(idade);
				if (idadeVal > 20.0)
					throw new Exception("Valor inválido para idade.");
				else 
					this.idade = idade;
			} catch(NumberFormatException e) {
				System.out.println("Nao");
				e.printStackTrace();
			}
		}
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) throws Exception {
		if ( peso == null || peso.isBlank())
			this.peso = naoInformado;
		else {
			peso = peso.replace(",", ".");
			try {
				Double pesoVal = Double.parseDouble(peso);
				if (pesoVal > 60.0 || pesoVal < 0.5)
					throw new Exception("Valor inválido para peso.");
				else 
					this.peso = peso;
			} catch(NumberFormatException e) {
				e.printStackTrace();
			}
		}
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) throws Exception {
		if (raca == null || raca.isBlank())
			this.raca = naoInformado;
		else if (raca.chars().allMatch(Character::isLetter))
			this.raca = raca;
		else
			throw new Exception("Raça não pode conter números ou caracteres especiais.");
		
	}
}
