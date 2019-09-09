/**
 * 
 */
package br.com.dextra.dexfood.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bruno
 *
 */
public enum Lanches {
	@JsonProperty("x-Bacon")
	X_BACON(new Lanche("X-Bacon",Ingrediente.BACON, Ingrediente.HAMBURGER_CARNE, Ingrediente.QUEIJO)),
	@JsonProperty("x-Burger")
	X_BURGUER(new Lanche("X-Burger",Ingrediente.HAMBURGER_CARNE, Ingrediente.QUEIJO)),
	@JsonProperty("x-Egg")
	X_EGG(new Lanche("X-Egg",Ingrediente.OVO, Ingrediente.HAMBURGER_CARNE, Ingrediente.QUEIJO)),
	@JsonProperty("x-Egg-Bacon")
	X_EGGBACON(new Lanche("X-Egg-Bacon",Ingrediente.OVO, Ingrediente.BACON, Ingrediente.HAMBURGER_CARNE, Ingrediente.QUEIJO));

	private Lanche lanche;

	Lanches(Lanche lanche) {
		this.lanche = lanche;
	}

	public Lanche getLanche() {
		return lanche;
	}
}
