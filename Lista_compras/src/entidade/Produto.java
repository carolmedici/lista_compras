package entidade;

public class Produto {
	private String nome;
	private String tipo;
	private String local;
	private Integer quantidade;
	
	public Produto(String nome, String tipo, String local, Integer quantidade) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.local = local;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public String lista_produto(){
		return quantidade
				+ "Item: "
				+ nome
				+ "Tipo: "
				+ tipo
				+ "Local: "
				+ local;
				
	}
	
}
