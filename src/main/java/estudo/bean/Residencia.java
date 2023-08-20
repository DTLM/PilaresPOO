package estudo.bean;

public abstract class Residencia {

	private Long id;
	
	private Double preco;
	
	private Corretor corretor;
	
	private String local;

	public abstract Double calcularPreco();
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Corretor getCorretor() {
		return corretor;
	}

	public void setCorretor(Corretor corretor) {
		this.corretor = corretor;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}
	
}
