package br.com.dextra.dexfood.model;

/**
 * 
 * @author bruno
 *
 */
public enum Ingrediente {

	ALFACE("Alface", 0.40), BACON("Bacon", 2.00), HAMBURGER_CARNE("Hambúrguer de Carne", 3.00), OVO("Ovo",
			0.80), QUEIJO("Hambúrguer de Carne", 3.00);

	private String descricao;
	private double preco;

	Ingrediente(String descricao, double preco) {
		this.descricao = descricao;
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
