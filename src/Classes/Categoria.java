package Classes;

public enum Categoria {

	EMPREGADO("Empregado"),
	EMPREGADOR("Empregador"),
	DESEMPREGADO("Desempregado");
	

	private String descricao;

	private Categoria(String nome) {
		this.descricao = nome;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return descricao;
		
	}
	
}
