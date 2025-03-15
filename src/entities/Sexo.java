package entities;

public enum Sexo {

	FEMEA("Femea"),
	MACHO("Macho");
	
	private String sexo;
	
	private Sexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getSexo() {
		return sexo;
	}
}
