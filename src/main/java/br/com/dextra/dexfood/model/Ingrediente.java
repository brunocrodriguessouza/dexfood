package br.com.dextra.dexfood.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author bruno
 *
 */
public enum Ingrediente {

	@JsonProperty("Alface")
	ALFACE("Alface", 0.40), 
	@JsonProperty("Bacon")
	BACON("Bacon", 2.00), 
	@JsonProperty("Hambúrguer de Carne")
	HAMBURGER_CARNE("Hambúrguer de Carne", 3.00), 
	@JsonProperty("Ovo")
	OVO("Ovo",0.80), 
	@JsonProperty("Queijo")
	QUEIJO("Queijo", 1.50);

	private String descricao;
	private double preco;

	Ingrediente(String descricao, double preco) {
		this.descricao = descricao;
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
