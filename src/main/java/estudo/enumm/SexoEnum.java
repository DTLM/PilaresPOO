package estudo.enumm;

public enum SexoEnum {

	MASCULINO("Masculino"), FEMININO("Feminino"), NAO_IDENTIFICAR("N�o identificar");
	
	private final String name;
	
	private SexoEnum(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
