package entities;

public enum Tipo {

	CACHORRO("Cachorro"),
	GATO("Gato");
	
	private String tipo;
	
	private Tipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}

}
