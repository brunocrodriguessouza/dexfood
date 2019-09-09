/**
 * 
 */
package br.com.dextra.dexfood.model;

/**
 * @author bruno
 *
 */
public enum Lanches {
	X_BACON(new Lanche("X-Bacon",Ingrediente.BACON, Ingrediente.HAMBURGER_CARNE, Ingrediente.QUEIJO)),
	X_BURGUER(new Lanche("X-Burger",Ingrediente.HAMBURGER_CARNE, Ingrediente.QUEIJO)),
	X_EGG(new Lanche("X-Egg",Ingrediente.OVO, Ingrediente.HAMBURGER_CARNE, Ingrediente.QUEIJO)),
	X_EGGBACON(new Lanche("X-Egg Bacon",Ingrediente.OVO, Ingrediente.BACON, Ingrediente.HAMBURGER_CARNE, Ingrediente.QUEIJO));

	private Lanche lanche;

	Lanches(Lanche lanche) {
		this.lanche = lanche;
	}

	public Lanche getLanche() {
		return lanche;
	}
}
