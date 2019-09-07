package br.com.dextra.dexfood.model;

import java.util.List;

/**
 * 
 * @author bruno
 *
 */
public abstract class Lanche {

	protected List<Ingrediente> ingredientes;
	
	public List<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	public double getPreco() {
		double preco = 0;
		for (Ingrediente ingrediente : ingredientes) {
			preco += ingrediente.getPreco();
		}
		return preco;
	}
	
	public double montarLanche(Lanche lanche, List<Ingrediente> adicionais) {
		for (Ingrediente ingrediente : adicionais) {
			lanche.getIngredientes().add(ingrediente);
		}
		return lanche.getPreco();
	}
}
