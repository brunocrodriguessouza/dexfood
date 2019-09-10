package br.com.dextra.dexfood.model;

import java.util.List;

public class Pedido {
	private Lanche lanche;
	private List<Ingrediente> adicionais;

	public Pedido(Lanche lanche, List<Ingrediente> adicionais) {
		this.lanche = lanche;
		this.adicionais = adicionais;
	}

	public Pedido() {

	}

	public Lanche getLanche() {
		return lanche;
	}

	public void setLanche(Lanche lanche) {
		this.lanche = lanche;
	}

	public List<Ingrediente> getAdicionais() {
		return adicionais;
	}

	public void setAdicionais(List<Ingrediente> adicionais) {
		this.adicionais = adicionais;
	}

	public double getValorTotal() {
		for(Ingrediente ingrediente: adicionais) {
			this.lanche.adicionaIngrediente(ingrediente);
		}
		return lanche.getPreco();
	}

}

// public BigDecimal getValorTotal(){
// return getPreco().multiply(new BigDecimal(quantidade));
// }
